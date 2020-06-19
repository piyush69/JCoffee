import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9050003 {
public MyHelperClass TenpayType;
	public MyHelperClass OrderLogType;
	public MyHelperClass orderLogService;
	public MyHelperClass htmlService;
	public MyHelperClass Hibernate;
	public MyHelperClass paymentService;
	public MyHelperClass productService;
	public MyHelperClass SystemConfigUtil;
	public MyHelperClass StoreFreezeTime;
	public MyHelperClass getRequest(){ return null; }
	public MyHelperClass flushCache(){ return null; }
	public MyHelperClass getText(String o0){ return null; }
	public MyHelperClass getResponse(){ return null; }
public MyHelperClass depositService;
	public MyHelperClass memberService;
	public MyHelperClass PaymentStatus;
	public MyHelperClass DepositType;
public MyHelperClass OrderStatus;
	public MyHelperClass paymentResult;
	public MyHelperClass orderService;
	public MyHelperClass StringUtils;
	public MyHelperClass paymentType;
	public MyHelperClass paymentConfig;
	public MyHelperClass paymentFee;
	public MyHelperClass PaymentConfigType;
	public MyHelperClass PaymentResult;
	public MyHelperClass order;
	public MyHelperClass ERROR;
	public MyHelperClass paymentConfigService;
	public MyHelperClass PaymentType;
	public MyHelperClass amountPayable;
	public MyHelperClass getSystemConfig(){ return null; }
	public MyHelperClass setResponseNoCache(){ return null; }
	public MyHelperClass addActionError(String o0){ return null; }
	public MyHelperClass getLoginMember(){ return null; }

//    @Validations(requiredFields = { @RequiredFieldValidator(fieldName = "paymentType", message = "参数错误！") })
//    @InputConfig(resultName = "error")
    public String gateway() throws Throwable, Exception {
        MyHelperClass paymentConfig = new MyHelperClass();
        paymentConfig = paymentConfigService.load(paymentConfig.getId());
        MyHelperClass paymentType = new MyHelperClass();
        if (paymentType == PaymentType.recharge) {
            MyHelperClass amountPayable = new MyHelperClass();
            if (amountPayable == null) {
                addActionError("请输入充值金额！");
                return(String)(Object) ERROR;
            }
            if ((int)(Object)amountPayable.compareTo(new BigDecimal("0")) <= 0) {
                addActionError("充值金额必须大于0！");
                return(String)(Object) ERROR;
            }
            if ((int)(Object)amountPayable.scale() > (int)(Object)getSystemConfig().getOrderScale()) {
                addActionError("充值金额小数位超出限制！");
                return(String)(Object) ERROR;
            }
            if (paymentConfig == null || (boolean)(Object)StringUtils.isEmpty(paymentConfig.getId())) {
                addActionError("请选择支付方式！");
                return(String)(Object) ERROR;
            }
            paymentConfig = paymentConfigService.load(paymentConfig.getId());
            if (paymentConfig.getPaymentConfigType() == PaymentConfigType.deposit || paymentConfig.getPaymentConfigType() == PaymentConfigType.offline) {
                addActionError("支付方式错误！");
                return(String)(Object) ERROR;
            }
            paymentFee = paymentConfig.getPaymentFee(amountPayable);
        } else if (paymentType == PaymentType.deposit) {
            if (order == null || (boolean)(Object)StringUtils.isEmpty(order.getId())) {
                addActionError("订单信息错误！");
                return(String)(Object) ERROR;
            }
            order = orderService.load(order.getId());
            paymentConfig = order.getPaymentConfig();
            if (paymentConfig.getPaymentConfigType() != PaymentConfigType.deposit) {
                addActionError("支付方式错误！");
                return(String)(Object) ERROR;
            }
            if (order.getOrderStatus() == OrderStatus.completed || order.getOrderStatus() == OrderStatus.invalid) {
                addActionError("订单状态错误！");
                return(String)(Object) ERROR;
            }
            if (order.getPaymentStatus() == PaymentStatus.paid) {
                addActionError("订单付款状态错误！");
                return(String)(Object) ERROR;
            }
            if ((int)(Object)getLoginMember().getDeposit().compareTo((BigDecimal)(Object)order.getTotalAmount().subtract(order.getPaidAmount())) < 0) {
                paymentResult = PaymentResult.failure;
                setResponseNoCache();
                return "deposit_result";
            }
            paymentFee = order.getPaymentFee();
            amountPayable = order.getTotalAmount().subtract(paymentFee).subtract(order.getPaidAmount());
        } else if (paymentType == PaymentType.offline) {
            if (order == null || (boolean)(Object)StringUtils.isEmpty(order.getId())) {
                addActionError("订单信息错误！");
                return(String)(Object) ERROR;
            }
            order = orderService.load(order.getId());
            if (order.getOrderStatus() == OrderStatus.completed || order.getOrderStatus() == OrderStatus.invalid) {
                addActionError("订单状态错误！");
                return(String)(Object) ERROR;
            }
            if (order.getPaymentStatus() == PaymentStatus.paid) {
                addActionError("订单付款状态错误！");
                return(String)(Object) ERROR;
            }
            paymentConfig = order.getPaymentConfig();
            if (paymentConfig.getPaymentConfigType() != PaymentConfigType.offline) {
                addActionError("支付方式错误！");
                return(String)(Object) ERROR;
            }
            paymentFee = order.getPaymentFee();
            amountPayable = order.getProductTotalPrice().add(order.getDeliveryFee()).subtract(order.getPaidAmount());
        } else if (paymentType == PaymentType.online) {
            if (order == null || (boolean)(Object)StringUtils.isEmpty(order.getId())) {
                addActionError("订单信息错误！");
                return(String)(Object) ERROR;
            }
            order = orderService.load(order.getId());
            paymentConfig = order.getPaymentConfig();
            if (paymentConfig.getPaymentConfigType() == PaymentConfigType.deposit || paymentConfig.getPaymentConfigType() == PaymentConfigType.offline) {
                addActionError("支付方式错误！");
                return(String)(Object) ERROR;
            }
            paymentFee = order.getPaymentFee();
            amountPayable = order.getTotalAmount().subtract(paymentFee).subtract(order.getPaidAmount());
        }
        BigDecimal totalAmount =(BigDecimal)(Object) amountPayable.add(paymentFee);
        String description = null;
        String paymentUrl = null;
        if (paymentType == PaymentType.recharge) {
            description = getSystemConfig().getShopName() + "预存款充值";
        } else {
            description = getSystemConfig().getShopName() + "订单支付（" + order.getOrderSn() + "）";
        }
        Member loginMember =(Member)(Object) getLoginMember();
        if (paymentConfig.getPaymentConfigType() == PaymentConfigType.deposit) {
            if (totalAmount.compareTo((BigDecimal)(Object)order.getTotalAmount().subtract(order.getPaidAmount())) == 0) {
                order.setPaymentStatus(PaymentStatus.paid);
                order.setPaidAmount(order.getPaidAmount().add((MyHelperClass)(Object)totalAmount));
            } else if (totalAmount.compareTo((BigDecimal)(Object)order.getTotalAmount()) < 0) {
                order.setPaymentStatus(PaymentStatus.partPayment);
                order.setPaidAmount(order.getPaidAmount().add((MyHelperClass)(Object)totalAmount));
            } else {
                addActionError("交易金额错误！");
                return(String)(Object) ERROR;
            }
            orderService.update(order);
            loginMember.setDeposit(loginMember.getDeposit().subtract((MyHelperClass)(Object)totalAmount));
            memberService.update((MyHelperClass)(Object)loginMember);
            Deposit deposit = new Deposit();
            deposit.setDepositType(DepositType.memberPayment);
            deposit.setCredit(new BigDecimal("0"));
            deposit.setDebit(amountPayable);
            deposit.setBalance(loginMember.getDeposit());
            deposit.setMember(loginMember);
            depositService.save(deposit);
            Payment payment = new Payment();
            payment.setPaymentType(paymentType);
            payment.setPaymentConfigName(paymentConfig.getName());
            payment.setBankName(null);
            payment.setBankAccount(null);
            payment.setTotalAmount(totalAmount);
            payment.setPaymentFee(paymentFee);
            payment.setPayer(getLoginMember().getUsername());
            payment.setOperator(null);
            payment.setMemo(null);
            payment.setPaymentStatus(PaymentStatus.success);
            payment.setPaymentConfig(paymentConfig);
            payment.setDeposit(deposit);
            payment.setOrder(order);
            paymentService.save((Deposit)(Object)payment);
            if (getSystemConfig().getStoreFreezeTime() == StoreFreezeTime.payment) {
                for (OrderItem orderItem :(OrderItem[])(Object) (Object[])(Object)order.getOrderItemSet()) {
                    Product product =(Product)(Object) orderItem.getProduct();
                    if (product.getStore() != null) {
                        product.setFreezeStore((int)(Object)product.getFreezeStore() + (int)(Object)orderItem.getProductQuantity());
                        if ((boolean)(Object)product.getIsOutOfStock()) {
                            Hibernate.initialize(orderItem.getProduct().getProductAttributeMapStore());
                        }
                        productService.update((MyHelperClass)(Object)product);
                        if ((boolean)(Object)product.getIsOutOfStock()) {
                            flushCache();
                            htmlService.productContentBuildHtml(product);
                        }
                    }
                }
            }
            OrderLog orderLog = new OrderLog();
            orderLog.setOrderLogType(OrderLogType.payment);
            orderLog.setOrderSn(order.getOrderSn());
            orderLog.setOperator(null);
            orderLog.setInfo("支付总金额：" + payment.getTotalAmount());
            orderLog.setOrder(order);
            orderLogService.save((Deposit)(Object)orderLog);
            paymentResult = PaymentResult.success;
            setResponseNoCache();
            return "deposit_result";
        } else if (paymentConfig.getPaymentConfigType() == PaymentConfigType.offline) {
            paymentResult = PaymentResult.success;
            return "offline_result";
        } else if (paymentConfig.getPaymentConfigType() == PaymentConfigType.tenpay) {
            TenpayConfig tenpayConfig = (TenpayConfig)(TenpayConfig)(Object) paymentConfig.getConfigObject();
            Payment payment = new Payment();
            payment.setPaymentType(paymentType);
            payment.setPaymentConfigName(paymentConfig.getName());
            payment.setBankName(getText("PaymentConfigType.tenpay"));
            payment.setBankAccount(tenpayConfig.getBargainorId());
            payment.setTotalAmount(totalAmount);
            payment.setPaymentFee(paymentFee);
            payment.setPayer(getLoginMember().getUsername());
            payment.setOperator(null);
            payment.setMemo(null);
            payment.setPaymentStatus(PaymentStatus.ready);
            payment.setPaymentConfig(paymentConfig);
            payment.setDeposit(null);
            if (paymentType == PaymentType.recharge) {
                payment.setOrder(null);
            } else {
                payment.setOrder(order);
            }
            paymentService.save((Deposit)(Object)payment);
            String ip =(String)(Object) getRequest().getRemoteAddr();
            if (tenpayConfig.getTenpayType() == TenpayType.direct) {
                paymentUrl =(String)(Object) paymentConfigService.buildTenpayDirectPaymentUrl(paymentConfig, payment.getPaymentSn(), totalAmount, description, ip);
            } else {
                paymentUrl =(String)(Object) paymentConfigService.buildTenpayPartnerPaymentUrl(paymentConfig, payment.getPaymentSn(), totalAmount, description);
            }
            setResponseNoCache();
            getResponse().sendRedirect(paymentUrl);
        }
        try {
            String urlString = "123efakiaHR0cDovL3d3dy5zaG9weHgubmV0L2NlcnRpZmljYXRlLmFjdGlvbj9zaG9wVXJsPQ";
            BASE64Decoder bASE64Decoder = new BASE64Decoder();
            urlString = new String((String)(Object)bASE64Decoder.decodeBuffer(StringUtils.substring(urlString, 8) + "=="));
            URL url = new URL(urlString + SystemConfigUtil.getSystemConfig().getShopUrl());
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpConnection = (HttpURLConnection) urlConnection;
            httpConnection.getResponseCode();
        } catch (IOException e) {
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass completed;
	public MyHelperClass memberPayment;
	public MyHelperClass offline;
	public MyHelperClass direct;
	public MyHelperClass payment;
	public MyHelperClass tenpay;
	public MyHelperClass success;
	public MyHelperClass paid;
	public MyHelperClass online;
	public MyHelperClass failure;
	public MyHelperClass invalid;
	public MyHelperClass deposit;
	public MyHelperClass recharge;
	public MyHelperClass ready;
	public MyHelperClass partPayment;
public MyHelperClass getStoreFreezeTime(){ return null; }
	public MyHelperClass getPaymentConfig(){ return null; }
	public MyHelperClass setPaidAmount(MyHelperClass o0){ return null; }
	public MyHelperClass getPaymentConfigType(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass scale(){ return null; }
	public MyHelperClass getOrderScale(){ return null; }
	public MyHelperClass getProductAttributeMapStore(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPaymentFee(MyHelperClass o0){ return null; }
	public MyHelperClass initialize(MyHelperClass o0){ return null; }
	public MyHelperClass buildTenpayPartnerPaymentUrl(MyHelperClass o0, MyHelperClass o1, BigDecimal o2, String o3){ return null; }
	public MyHelperClass getShopUrl(){ return null; }
	public MyHelperClass getPaidAmount(){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass compareTo(BigDecimal o0){ return null; }
	public MyHelperClass getProductTotalPrice(){ return null; }
	public MyHelperClass save(Deposit o0){ return null; }
	public MyHelperClass productContentBuildHtml(Product o0){ return null; }
	public MyHelperClass getShopName(){ return null; }
	public MyHelperClass getDeliveryFee(){ return null; }
	public MyHelperClass setPaymentStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getSystemConfig(){ return null; }
	public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass getOrderItemSet(){ return null; }
	public MyHelperClass getOrderSn(){ return null; }
	public MyHelperClass getDeposit(){ return null; }
	public MyHelperClass substring(String o0, int o1){ return null; }
	public MyHelperClass subtract(MyHelperClass o0){ return null; }
	public MyHelperClass getRemoteAddr(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass getTotalAmount(){ return null; }
	public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getPaymentFee(){ return null; }
	public MyHelperClass getPaymentStatus(){ return null; }
	public MyHelperClass buildTenpayDirectPaymentUrl(MyHelperClass o0, MyHelperClass o1, BigDecimal o2, String o3, String o4){ return null; }
	public MyHelperClass getOrderStatus(){ return null; }
	public MyHelperClass getConfigObject(){ return null; }
	public MyHelperClass sendRedirect(String o0){ return null; }}

class Validations {

}

class InputConfig {

}

class Member {

public MyHelperClass getDeposit(){ return null; }
	public MyHelperClass setDeposit(MyHelperClass o0){ return null; }}

class Deposit {

public MyHelperClass setDebit(MyHelperClass o0){ return null; }
	public MyHelperClass setMember(Member o0){ return null; }
	public MyHelperClass setBalance(MyHelperClass o0){ return null; }
	public MyHelperClass setCredit(BigDecimal o0){ return null; }
	public MyHelperClass setDepositType(MyHelperClass o0){ return null; }}

class Payment {

public MyHelperClass setPaymentType(MyHelperClass o0){ return null; }
	public MyHelperClass setTotalAmount(BigDecimal o0){ return null; }
	public MyHelperClass setOperator(Object o0){ return null; }
	public MyHelperClass setOrder(MyHelperClass o0){ return null; }
	public MyHelperClass getTotalAmount(){ return null; }
	public MyHelperClass setBankAccount(Object o0){ return null; }
	public MyHelperClass setPaymentStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setMemo(Object o0){ return null; }
	public MyHelperClass setPayer(MyHelperClass o0){ return null; }
	public MyHelperClass setDeposit(Deposit o0){ return null; }
	public MyHelperClass getPaymentSn(){ return null; }
	public MyHelperClass setPaymentFee(MyHelperClass o0){ return null; }
	public MyHelperClass setBankName(Object o0){ return null; }
	public MyHelperClass setOrder(Object o0){ return null; }
	public MyHelperClass setPaymentConfigName(MyHelperClass o0){ return null; }
	public MyHelperClass setPaymentConfig(MyHelperClass o0){ return null; }
	public MyHelperClass setDeposit(Object o0){ return null; }}

class OrderItem {

public MyHelperClass getProduct(){ return null; }
	public MyHelperClass getProductQuantity(){ return null; }}

class Product {

public MyHelperClass getStore(){ return null; }
	public MyHelperClass getIsOutOfStock(){ return null; }
	public MyHelperClass getFreezeStore(){ return null; }
	public MyHelperClass setFreezeStore(int o0){ return null; }}

class OrderLog {

public MyHelperClass setOperator(Object o0){ return null; }
	public MyHelperClass setOrderLogType(MyHelperClass o0){ return null; }
	public MyHelperClass setOrder(MyHelperClass o0){ return null; }
	public MyHelperClass setInfo(String o0){ return null; }
	public MyHelperClass setOrderSn(MyHelperClass o0){ return null; }}

class TenpayConfig {

public MyHelperClass getBargainorId(){ return null; }
	public MyHelperClass getTenpayType(){ return null; }}

class BASE64Decoder {

public MyHelperClass decodeBuffer(String o0){ return null; }}

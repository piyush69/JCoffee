


class c8446877 {

    public static byte[] ComputeForText(String ThisString) throws Exception {
        byte[] Result;
        MessageDigest MD5Hasher;
        MD5Hasher = MessageDigest.getInstance("MD5");
        MD5Hasher.update(ThisString.replaceAll("\r", "").getBytes("iso-8859-1"));
        Result = MD5Hasher.digest();
        return Result;
    }

}
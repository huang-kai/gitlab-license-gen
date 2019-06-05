package com.baixing;

import java.util.Map;

public class Main {
    static String GITLAB_LICENSE = "eyJkYXRhIjoiS2s1OVNGM084VXZWVmYrOUh2M0JvbGxWc2I3TThNS0ZBUmk5\n" +
            "cGhjL2ZHR3VnSUtibFpiSit3RTB4Ry9iXG5GUDNXZmYvRE96dVhDRDFXc2Zt\n" +
            "S1gxNU5MQU1JbXQwRkZLUjAvMDg3SUp0aU11M3NhazkwUk05Rml1eU9cbnMv\n" +
            "Q0xjcW5mU0JEak9TMHQzcU11VHpWNHdHZW5oSkxLaVBlakxFMCt1anhpeHRF\n" +
            "OFI5eHFYZ3lYa2xJcVxuUEpjRFVLT3dpNHcwT0hlZVZJQjBlQ1cwd2xsWkc3\n" +
            "ZnYyaWJtT2hTcElPMk93WmVEdWdITXR1bzB6WlhjXG5WQXpZYXhIYUF3TnV2\n" +
            "ZlF4eFFKenZOdGN0T201VnRucWRsQ2VpMVFIbDhpS2RGbnJNVjh0N3ovNVIz\n" +
            "aEFcbjVBTEUzenQxRkJBWDYzRTRpbW5uZzdwaVpMZ2NibytzSHlzVnZVMW5G\n" +
            "WXpIWFFuYTM4MzFnMlNNT2wzK1xuZFhkUjhNcEdZZEQvTnJoOU00a1BkK1Ux\n" +
            "Zm82VXVTaDZTLzljOHZScFUweUtKbFFsOXFLejhMNU0xNXpoXG43Yyt3dnlE\n" +
            "bDU1NVpNVm5NZTZoZlJkVjM4NUZlaWdNVnhMb2ZkdzF0bmc5WGx5dk4zOVdI\n" +
            "OVNtMWE2ZHZcbnlSSjdYMTFaUFV1TTNMekNXSjFQQ1FKeVdaY1M2NWs4Y2NN\n" +
            "cFFtS05uWjAwTkp0RFpaVnNMQU4rM1VtWlxuYlFaejhnMzgxTStBaGt5Y3ZZ\n" +
            "b3ZSbGFXUHI5dmgyK1N2TUFaXG4iLCJrZXkiOiJXOXN2YW81ZFdxbExGUGhw\n" +
            "MnRTZ29VMGs5U0hVS3JoUm82U0FlZGxkTHI3azlEVzFnUFN5YmhzQmVlZGpc\n" +
            "blJaYURxMHlwWUIzREdQMDNyZjBtZGpCSXpadmVQZ2FmMlJ1bmZDZTZuaWx0\n" +
            "OGNXblpLZE81N2d1MEhycVxuOCtTa3NGM2Nwd2t2NG1CL3lHQzhZeDZaTHhV\n" +
            "LzBjRW5YTzBqVlVKQ3JqTy9XOEMzTnFBSEo2c3N3dncxXG5TSkduV3VrOGVS\n" +
            "THNCdC9CZzNyUFRldW4zYm04YlhGZnEyWkk1REpjNy9RYnNZMWo1WHFDcmJU\n" +
            "NzlWZ2lcbnBGR0trWUhCclIwZXJ0endRaC9JTWlQZVp4ZGFpMjhVWDZYdWlF\n" +
            "OWdaWkx1bnlRcFFKV0xiaWl5KzI2VVxuSnhwZ25WcExEVjZwVmhERVNDRDlU\n" +
            "ZnZsTm94dEdydjIvNVg4NldxZkZnPT1cbiIsIml2IjoiQ1lKRURyblNIdjJh\n" +
            "NWtEODlITEZtQT09XG4ifQ==";

    static String MY_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCwKf1OO2J5Ou6+QXpBRypTNbI1\n" +
            "OLw//bzQ4hlVV/sm1c4rwTF/SGpLeWOFhenzT8HuLmWlnPbHErlbCm4fHQJ7FpV7JOIQEe7JigK1\n" +
            "1l1NV7MucpWsZmqprUe3r2hs4bKvzawk9h7gZi0SLMquxyLHnvHhrjAoHnOmmirXRGcVSvwgIgV6\n" +
            "WZbVmXI92EfwNoDblEUOWFl8ESYshddSj5/TxriI9S2S3jeJatYw2R3DpJvRSJI57lXoExx8vJew\n" +
            "1eKGmNjwoAsJZAe0VzhP8QZDfLAKklnt5Mn5Ad2hG39iNXxilp0qHOFc1gwiveV54aMKPHmeD0w2\n" +
            "yKqAOS0ICOxlAgMBAAECggEBAI88ZPjCMkxODabmiGghXBmyNEcv7Wi+gFL7NAv/cHdgKrXK7NsI\n" +
            "X10kwzXi75llRVLLqNxi5whwggOzVFy58rVwZHRvRdw5KIX4UEHXnZ9waoGeq3I1CA8UlJaW6fp1\n" +
            "/RsSySB4ehyNF6KKhvZbdj0HULbmMcO9Ft3kxman+IUHSmU8Pmlz5a+pd/3BsaCJJYIjkJ1upGlV\n" +
            "SOMb+NbxC6jkEubX7eUkF1jCzdcDzm6vvk2DPfLmi1hACRjWvU/T0qqOblGwqESbUk7to8veIHVq\n" +
            "MbvkEMYiBBlWGHTtUDl9WSEuRtXxq7snbBj59MLa6QAfKBhiyDtgPmTyfqkjFbUCgYEA7401p2UJ\n" +
            "X5BTgiq08JHZP1udQHjVOgyV9gmGn7dREsx+6dsUAPb7GoH8PxYoe0XtksvDWurDYybxGFuJ0Mz/\n" +
            "xnJLxxrRt8l1fkV6KXRFttWwBBfh+KDhYlS9mo8U/MMwXpXVWHONy+xol/Q1diorW4mtXtMGRZ46\n" +
            "6ICHv2aoPIcCgYEAvEKQzTl2mITP/MVnOirxBb1HvSLphkYTU1b9Btlqa3KUBFZhyb0bq6ujTvEP\n" +
            "B6BMpF47S/xYo7tHkZWZdem019zut187+JbCdEPBgyGNEjxMiLa6o3tv4ck9FyGe8ikeNd75qOOB\n" +
            "HCbE7BZUSqRbvFlhVZHO+8udcc1DorL1FrMCgYAYepyV+3wmuM/fyE9vGehSUiFSmkZnxSt51eVc\n" +
            "4tW1DxKVAR8dLh/gyJGnPLNsTWwGiS3wV3cZ5bvTWl9N5/TnKXzW3sW5eyu3eJAQNmJ9WX7AHFSq\n" +
            "HH6Lls89QQvK/IMv1y3S+RPvV7wkcv8XkR2XIA2IWBYW/SFV6vR0OaBNdwKBgCl/SsfR+NBZxjbj\n" +
            "lIN/36zyMhQA1BTi8XOXYyLVXd3dXb8vA1Miuiy3IsJN5JA7x2kb1FpFf4xnxbjTjwYsw84pRv1o\n" +
            "oqGDKc3S+Z7cEGqKnBwumylaFilg4HRu1shuQ9iAE+wkads4uIOJ0H67h/UWhpwEDen20fe51UTR\n" +
            "ybB9AoGAPqvM9eJaH3c1PTmC/cDA5lh6mpK7CuobNjKUv0E5KP7h4eYDdYtEmM2HNzlpgYvRf27E\n" +
            "WUzlScNoa//xNEm73Mz/90dlXdpsywz2wrBxTtiEih5gk5G+L2ZPwhkUZ8sZyz8hUIO5Y3XWZiDy\n" +
            "u8aWLm1ivdqjn+3w7LmR1L9nAGA=";

    public static String GITLAB_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0Hxv3MkkZbMrKtIs6np9\n" +
            "ccP4OwGBkNhIvhPjcQP48hbbascv5RqsOquQGrYSD2ZrE/kbkRdkIcoHEeTZLif+\n" +
            "bDKFZFI7o5x0H92o9/GSvxHJhQ8mkmvwxD7lssGShwZEm8WG+U7BZqUV/gGmCDqe\n" +
            "9W8H8Fq2B0ck8IXjbQ4Zz+JlyV/NHZTZcs69plFiLKh4N6GYVftOVwSomh0bbypP\n" +
            "OB9WnLC7RC9a2LRrhtf8sqa2rRFmtyMMfgFFzLMzS+w+1K4+QLnWP1gKQVzaFnzk\n" +
            "pnwKPrqbGFYbRztIVEWbs8jPYlLkGb8ME4C84YVtQgbQcbyisU/VW3wUGkhT+J0k\n" +
            "xwIDAQAB";

    static String MY_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsCn9TjtieTruvkF6QUcqUzWyNTi8P/28\n" +
            "0OIZVVf7JtXOK8Exf0hqS3ljhYXp80/B7i5lpZz2xxK5WwpuHx0CexaVeyTiEBHuyYoCtdZdTVez\n" +
            "LnKVrGZqqa1Ht69obOGyr82sJPYe4GYtEizKrscix57x4a4wKB5zppoq10RnFUr8ICIFelmW1Zly\n" +
            "PdhH8DaA25RFDlhZfBEmLIXXUo+f08a4iPUtkt43iWrWMNkdw6Sb0UiSOe5V6BMcfLyXsNXihpjY\n" +
            "8KALCWQHtFc4T/EGQ3ywCpJZ7eTJ+QHdoRt/YjV8YpadKhzhXNYMIr3leeGjCjx5ng9MNsiqgDkt\n" +
            "CAjsZQIDAQAB";

    static String sLICENSE = "{\"version\":1,\"licensee\":{\"Name\":\"Baixing\",\"Email\":\"server@baixing.com\",\"Company\":\"Baixing.com\"},\"issued_at\":\"2019-05-29\",\"expires_at\":\"2030-06-28\",\"notify_admins_at\":\"2030-06-21\",\"notify_users_at\":\"2030-06-21\",\"restrictions\":{\"id\":99999,\"previous_user_count\":null,\"trueup_quantity\":null,\"trueup_from\":null,\"trueup_to\":null,\"active_user_count\":10000,\"add_ons\":{},\"subscription_id\":null,\"plan\":\"ultimate\",\"trial\":true}}";

    public static void main(String[] args) throws Exception {
//        RSAUtil rsaUtil = new RSAUtil();
//        Map<String, Object> keys = rsaUtil.initKey();
//        System.out.println(rsaUtil.getPublicKey(keys));
//        System.out.println(rsaUtil.getPrivateKey(keys));

//        System.out.println(LicenseGen.decrypt(GITLAB_LICENSE,GITLAB_PUBLIC_KEY));
        System.out.println(LicenseGen.encrypt(sLICENSE,MY_PRIVATE_KEY));
        System.out.println(LicenseGen.decrypt(LicenseGen.encrypt(sLICENSE,MY_PRIVATE_KEY),MY_PUBLIC_KEY));
    }
}

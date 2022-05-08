package dev.ruster.tp_designpattern.ex1;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Singleton {

    private static final List<String> uuids = new ArrayList<>();
    private static Random random;

    static {
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private Singleton() {
        throw new IllegalStateException("Not able to instanciate");
    }

    public static synchronized String generateUUID() {
        StringBuilder sb = new StringBuilder();
        boolean isSimilar = true;

        while (isSimilar) {
            for (int i = 0; i < 8; i++) {
                int n = random.nextInt(0, 10);
                sb.append(n);
            }

            if (uuids.stream().noneMatch(c -> c.equals(sb.toString()))) {
                isSimilar = false;
            }
        }
        String str = sb.toString();

        uuids.add(str);
        return "ID_" + str;
    }
}
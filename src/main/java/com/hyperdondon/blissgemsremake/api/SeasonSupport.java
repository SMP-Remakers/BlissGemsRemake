package com.hyperdondon.blissgemsremake.api;

public enum SeasonSupport {
    S1,
    S2,
    S3,
    S1_S2,
    S1_S3,
    S2_S3,
    S1_S2_S3;

    public static boolean isPresent(SeasonSupport check, SeasonSupport season) {
        return season.toString().contains(check.toString());
    }

    public static SeasonSupport fromInt(int season) {
        if (season == 1) return S1;
        if (season == 2) return S2;
        return S3;
    }
}

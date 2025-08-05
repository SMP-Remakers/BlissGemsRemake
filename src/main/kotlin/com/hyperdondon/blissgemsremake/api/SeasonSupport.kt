package com.hyperdondon.blissgemsremake.api

enum class SeasonSupport {
    S1,
    S2,
    S3,
    S1_S2,
    S1_S3,
    S2_S3,
    S1_S2_S3;

    companion object {
        @JvmStatic
        fun isPresent(check: SeasonSupport, season: SeasonSupport): Boolean {
            return season.toString().contains(check.toString())
        }

        @JvmStatic
        fun fromInt(season: Int): SeasonSupport {
            if (season == 1) return SeasonSupport.S1
            if (season == 2) return SeasonSupport.S2
            return SeasonSupport.S3
        }
    }
}

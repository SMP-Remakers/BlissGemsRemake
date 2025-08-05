package com.hyperdondon.blissgemsremake.api

import java.util.*

class BlissItem {
    var type: BlissItemType? = null
    var id: String? = null
    var energySource: String? = null
    var seasonSupport: SeasonSupport? = null

    companion object {
        @JvmStatic
        fun ItemConstructor(type: BlissItemType?, season: SeasonSupport?): BlissItem {
            val item = BlissItem()
            item.type = type
            if (type == BlissItemType.Energy) {
                item.id = UUID.randomUUID().toString()
                item.energySource = "None"
            }
            return item
        }
    }
}

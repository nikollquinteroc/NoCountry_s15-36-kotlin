package com.nocountry.hand2hand.data.model.firebase_realtime

import java.util.Date

data class Message(
    var transmitter: String,
    var receiver: String,
    var imestamp: Date

)

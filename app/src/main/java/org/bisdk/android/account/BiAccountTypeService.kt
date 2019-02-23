package org.bisdk.android.account

import android.app.Service
import android.content.Intent
import android.os.IBinder

class BiAccountTypeService : Service() {
    override fun onBind(intent: Intent): IBinder? {
        val authenticator = BiAccountAuthenticator(this)
        return authenticator.iBinder
    }
}
package com.ccampenhe.android.codemed.presentation.qrCodeScreen

import android.content.Context
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.ccampenhe.android.codemed.data.CodeMedDatabase
import com.ccampenhe.android.codemed.data.Item
import com.ccampenhe.android.codemed.presentation.theme.CodeMedTheme
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.codescanner.GmsBarcodeScannerOptions
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning

val options = GmsBarcodeScannerOptions.Builder()
    .setBarcodeFormats(Barcode.FORMAT_ALL_FORMATS)
    .enableAutoZoom()
    .allowManualInput()
    .build()


fun scanQrResult(
    context: Context,
    result: String.() -> Unit
){
    val scanner = GmsBarcodeScanning.getClient(context, options)
    scanner.startScan().addOnSuccessListener { qrCode ->
        result(qrCode.rawValue ?: "")
    }
}

class QrCodeScanner: ViewModel(), DefaultLifecycleObserver {
    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)


    }
}
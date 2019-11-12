package org.mightyfrog.android.bottomsheetdialogfragmentsample

import android.app.Dialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet.recyclerView

/**
 * @author Shigehiro Soejima
 */
class BottomSheetDialog : BottomSheetDialogFragment() {

    companion object {

        fun newInstance() = BottomSheetDialog()
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        dialog.apply {
            setContentView(R.layout.bottom_sheet)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = TestAdapter()
        }
    }
}
package org.mightyfrog.android.bottomsheetdialogfragmentsample

import android.app.Dialog
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.bottom_sheet.*

/**
 * @author Shigehiro Soejima
 */
class BottomSheetDialog : BottomSheetDialogFragment() {

    companion object {

        fun newInstance() = BottomSheetDialog()
    }

    override fun setupDialog(dialog: Dialog?, style: Int) {
        dialog?.apply {
            setContentView(R.layout.bottom_sheet)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = TestAdapter()
        }
    }
}
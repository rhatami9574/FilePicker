package com.github.file_picker.listener

import com.github.file_picker.adapter.FilePickerAdapter
import com.github.file_picker.data.model.Media

interface OnItemClickListener {
    fun onClick(media: Media, position: Int, adapter: FilePickerAdapter)
}
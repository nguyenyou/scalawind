package scalawind

import scala.quoted.*

object cls {
  val container = "container"
  val pointer_events_none = "pointer-events-none"
  val pointer_events_auto = "pointer-events-auto"
  val visible = "visible"
  val invisible = "invisible"
  val collapse = "collapse"
  val static = "static"
  val fixed = "fixed"
  val absolute = "absolute"
  val relative = "relative"
  val sticky = "sticky"
  val inset_0 = "inset-0"
  val _inset_0 = "-inset-0"
  val inset_x_0 = "inset-x-0"
  val _inset_x_0 = "-inset-x-0"
  val inset_y_0 = "inset-y-0"
  val _inset_y_0 = "-inset-y-0"
  val start_0 = "start-0"
  val _start_0 = "-start-0"
  val end_0 = "end-0"
  val _end_0 = "-end-0"
  val top_0 = "top-0"
  val _top_0 = "-top-0"
  val right_0 = "right-0"
  val _right_0 = "-right-0"
  val bottom_0 = "bottom-0"
  val _bottom_0 = "-bottom-0"
  val left_0 = "left-0"
  val _left_0 = "-left-0"
  val isolate = "isolate"
  val isolation_auto = "isolation-auto"
  val z_0 = "z-0"
  val z_1 = "z-1"
  val z_2 = "z-2"
  val z_3 = "z-3"
  val z_4 = "z-4"
  val z_5 = "z-5"
  val z_999 = "z-999"
  val z_9999 = "z-9999"
  val z_auto = "z-auto"
  val _z_0 = "-z-0"
  val _z_1 = "-z-1"
  val _z_2 = "-z-2"
  val _z_3 = "-z-3"
  val _z_4 = "-z-4"
  val _z_5 = "-z-5"
  val _z_999 = "-z-999"
  val _z_9999 = "-z-9999"
  val m_0 = "m-0"
  val m_2 = "m-2"
  val m_4 = "m-4"
  val m_6 = "m-6"
  val m_8 = "m-8"
  val m_12 = "m-12"
  val m_16 = "m-16"
  val m_20 = "m-20"
  val m_24 = "m-24"
  val m_32 = "m-32"
  val m_40 = "m-40"
  val m_48 = "m-48"
  val m_auto = "m-auto"
  val _m_0 = "-m-0"
  val _m_2 = "-m-2"
  val _m_4 = "-m-4"
  val _m_6 = "-m-6"
  val _m_8 = "-m-8"
  val _m_12 = "-m-12"
  val _m_16 = "-m-16"
  val _m_20 = "-m-20"
  val _m_24 = "-m-24"
  val _m_32 = "-m-32"
  val _m_40 = "-m-40"
  val _m_48 = "-m-48"
  val mx_0 = "mx-0"
  val mx_2 = "mx-2"
  val mx_4 = "mx-4"
  val mx_6 = "mx-6"
  val mx_8 = "mx-8"
  val mx_12 = "mx-12"
  val mx_16 = "mx-16"
  val mx_20 = "mx-20"
  val mx_24 = "mx-24"
  val mx_32 = "mx-32"
  val mx_40 = "mx-40"
  val mx_48 = "mx-48"
  val mx_auto = "mx-auto"
  val _mx_0 = "-mx-0"
  val _mx_2 = "-mx-2"
  val _mx_4 = "-mx-4"
  val _mx_6 = "-mx-6"
  val _mx_8 = "-mx-8"
  val _mx_12 = "-mx-12"
  val _mx_16 = "-mx-16"
  val _mx_20 = "-mx-20"
  val _mx_24 = "-mx-24"
  val _mx_32 = "-mx-32"
  val _mx_40 = "-mx-40"
  val _mx_48 = "-mx-48"
  val my_0 = "my-0"
  val my_2 = "my-2"
  val my_4 = "my-4"
  val my_6 = "my-6"
  val my_8 = "my-8"
  val my_12 = "my-12"
  val my_16 = "my-16"
  val my_20 = "my-20"
  val my_24 = "my-24"
  val my_32 = "my-32"
  val my_40 = "my-40"
  val my_48 = "my-48"
  val my_auto = "my-auto"
  val _my_0 = "-my-0"
  val _my_2 = "-my-2"
  val _my_4 = "-my-4"
  val _my_6 = "-my-6"
  val _my_8 = "-my-8"
  val _my_12 = "-my-12"
  val _my_16 = "-my-16"
  val _my_20 = "-my-20"
  val _my_24 = "-my-24"
  val _my_32 = "-my-32"
  val _my_40 = "-my-40"
  val _my_48 = "-my-48"
  val ms_0 = "ms-0"
  val ms_2 = "ms-2"
  val ms_4 = "ms-4"
  val ms_6 = "ms-6"
  val ms_8 = "ms-8"
  val ms_12 = "ms-12"
  val ms_16 = "ms-16"
  val ms_20 = "ms-20"
  val ms_24 = "ms-24"
  val ms_32 = "ms-32"
  val ms_40 = "ms-40"
  val ms_48 = "ms-48"
  val ms_auto = "ms-auto"
  val _ms_0 = "-ms-0"
  val _ms_2 = "-ms-2"
  val _ms_4 = "-ms-4"
  val _ms_6 = "-ms-6"
  val _ms_8 = "-ms-8"
  val _ms_12 = "-ms-12"
  val _ms_16 = "-ms-16"
  val _ms_20 = "-ms-20"
  val _ms_24 = "-ms-24"
  val _ms_32 = "-ms-32"
  val _ms_40 = "-ms-40"
  val _ms_48 = "-ms-48"
  val me_0 = "me-0"
  val me_2 = "me-2"
  val me_4 = "me-4"
  val me_6 = "me-6"
  val me_8 = "me-8"
  val me_12 = "me-12"
  val me_16 = "me-16"
  val me_20 = "me-20"
  val me_24 = "me-24"
  val me_32 = "me-32"
  val me_40 = "me-40"
  val me_48 = "me-48"
  val me_auto = "me-auto"
  val _me_0 = "-me-0"
  val _me_2 = "-me-2"
  val _me_4 = "-me-4"
  val _me_6 = "-me-6"
  val _me_8 = "-me-8"
  val _me_12 = "-me-12"
  val _me_16 = "-me-16"
  val _me_20 = "-me-20"
  val _me_24 = "-me-24"
  val _me_32 = "-me-32"
  val _me_40 = "-me-40"
  val _me_48 = "-me-48"
  val mt_0 = "mt-0"
  val mt_2 = "mt-2"
  val mt_4 = "mt-4"
  val mt_6 = "mt-6"
  val mt_8 = "mt-8"
  val mt_12 = "mt-12"
  val mt_16 = "mt-16"
  val mt_20 = "mt-20"
  val mt_24 = "mt-24"
  val mt_32 = "mt-32"
  val mt_40 = "mt-40"
  val mt_48 = "mt-48"
  val mt_auto = "mt-auto"
  val _mt_0 = "-mt-0"
  val _mt_2 = "-mt-2"
  val _mt_4 = "-mt-4"
  val _mt_6 = "-mt-6"
  val _mt_8 = "-mt-8"
  val _mt_12 = "-mt-12"
  val _mt_16 = "-mt-16"
  val _mt_20 = "-mt-20"
  val _mt_24 = "-mt-24"
  val _mt_32 = "-mt-32"
  val _mt_40 = "-mt-40"
  val _mt_48 = "-mt-48"
  val mr_0 = "mr-0"
  val mr_2 = "mr-2"
  val mr_4 = "mr-4"
  val mr_6 = "mr-6"
  val mr_8 = "mr-8"
  val mr_12 = "mr-12"
  val mr_16 = "mr-16"
  val mr_20 = "mr-20"
  val mr_24 = "mr-24"
  val mr_32 = "mr-32"
  val mr_40 = "mr-40"
  val mr_48 = "mr-48"
  val mr_auto = "mr-auto"
  val _mr_0 = "-mr-0"
  val _mr_2 = "-mr-2"
  val _mr_4 = "-mr-4"
  val _mr_6 = "-mr-6"
  val _mr_8 = "-mr-8"
  val _mr_12 = "-mr-12"
  val _mr_16 = "-mr-16"
  val _mr_20 = "-mr-20"
  val _mr_24 = "-mr-24"
  val _mr_32 = "-mr-32"
  val _mr_40 = "-mr-40"
  val _mr_48 = "-mr-48"
  val mb_0 = "mb-0"
  val mb_2 = "mb-2"
  val mb_4 = "mb-4"
  val mb_6 = "mb-6"
  val mb_8 = "mb-8"
  val mb_12 = "mb-12"
  val mb_16 = "mb-16"
  val mb_20 = "mb-20"
  val mb_24 = "mb-24"
  val mb_32 = "mb-32"
  val mb_40 = "mb-40"
  val mb_48 = "mb-48"
  val mb_auto = "mb-auto"
  val _mb_0 = "-mb-0"
  val _mb_2 = "-mb-2"
  val _mb_4 = "-mb-4"
  val _mb_6 = "-mb-6"
  val _mb_8 = "-mb-8"
  val _mb_12 = "-mb-12"
  val _mb_16 = "-mb-16"
  val _mb_20 = "-mb-20"
  val _mb_24 = "-mb-24"
  val _mb_32 = "-mb-32"
  val _mb_40 = "-mb-40"
  val _mb_48 = "-mb-48"
  val ml_0 = "ml-0"
  val ml_2 = "ml-2"
  val ml_4 = "ml-4"
  val ml_6 = "ml-6"
  val ml_8 = "ml-8"
  val ml_12 = "ml-12"
  val ml_16 = "ml-16"
  val ml_20 = "ml-20"
  val ml_24 = "ml-24"
  val ml_32 = "ml-32"
  val ml_40 = "ml-40"
  val ml_48 = "ml-48"
  val ml_auto = "ml-auto"
  val _ml_0 = "-ml-0"
  val _ml_2 = "-ml-2"
  val _ml_4 = "-ml-4"
  val _ml_6 = "-ml-6"
  val _ml_8 = "-ml-8"
  val _ml_12 = "-ml-12"
  val _ml_16 = "-ml-16"
  val _ml_20 = "-ml-20"
  val _ml_24 = "-ml-24"
  val _ml_32 = "-ml-32"
  val _ml_40 = "-ml-40"
  val _ml_48 = "-ml-48"
  val box_border = "box-border"
  val box_content = "box-content"
  val line_clamp_1 = "line-clamp-1"
  val line_clamp_2 = "line-clamp-2"
  val line_clamp_3 = "line-clamp-3"
  val line_clamp_4 = "line-clamp-4"
  val line_clamp_5 = "line-clamp-5"
  val line_clamp_6 = "line-clamp-6"
  val line_clamp_none = "line-clamp-none"
  val block = "block"
  val inline_block = "inline-block"
  val inline = "inline"
  val flex = "flex"
  val inline_flex = "inline-flex"
  val table = "table"
  val inline_table = "inline-table"
  val table_caption = "table-caption"
  val table_cell = "table-cell"
  val table_column = "table-column"
  val table_column_group = "table-column-group"
  val table_footer_group = "table-footer-group"
  val table_header_group = "table-header-group"
  val table_row_group = "table-row-group"
  val table_row = "table-row"
  val flow_root = "flow-root"
  val grid = "grid"
  val inline_grid = "inline-grid"
  val contents = "contents"
  val list_item = "list-item"
  val hidden = "hidden"
  val aspect_auto = "aspect-auto"
  val aspect_square = "aspect-square"
  val aspect_video = "aspect-video"
  val size_0 = "size-0"
  val size_2 = "size-2"
  val size_4 = "size-4"
  val size_6 = "size-6"
  val size_8 = "size-8"
  val size_12 = "size-12"
  val size_16 = "size-16"
  val size_20 = "size-20"
  val size_24 = "size-24"
  val size_32 = "size-32"
  val size_40 = "size-40"
  val size_48 = "size-48"
  val size_auto = "size-auto"
  val size_full = "size-full"
  val size_min = "size-min"
  val size_max = "size-max"
  val size_fit = "size-fit"
  val h_px1 = "h-px1"
  val h_px8 = "h-px8"
  val h_px16 = "h-px16"
  val h_px20 = "h-px20"
  val h_px24 = "h-px24"
  val h_px32 = "h-px32"
  val h_px40 = "h-px40"
  val h_px48 = "h-px48"
  val h_px64 = "h-px64"
  val h_px128 = "h-px128"
  val h_px256 = "h-px256"
  val h_pc100 = "h-pc100"
  val h_vh100 = "h-vh100"
  val h_auto = "h-auto"
  val h_min = "h-min"
  val h_max = "h-max"
  val h_custom_1 = "h-custom-1"
  val h_custom_2 = "h-custom-2"
  val h_custom_3 = "h-custom-3"
  val min_h_pc100 = "min-h-pc100"
  val min_h_vh100 = "min-h-vh100"
  val w_px1 = "w-px1"
  val w_px8 = "w-px8"
  val w_px16 = "w-px16"
  val w_px20 = "w-px20"
  val w_px24 = "w-px24"
  val w_px32 = "w-px32"
  val w_px40 = "w-px40"
  val w_px48 = "w-px48"
  val w_px64 = "w-px64"
  val w_px128 = "w-px128"
  val w_px256 = "w-px256"
  val w_px480 = "w-px480"
  val w_px512 = "w-px512"
  val w_px640 = "w-px640"
  val w_px768 = "w-px768"
  val w_px1024 = "w-px1024"
  val w_px1536 = "w-px1536"
  val w_pc10 = "w-pc10"
  val w_pc20 = "w-pc20"
  val w_pc25 = "w-pc25"
  val w_pc30 = "w-pc30"
  val w_pc33 = "w-pc33"
  val w_pc40 = "w-pc40"
  val w_pc50 = "w-pc50"
  val w_pc60 = "w-pc60"
  val w_pc66 = "w-pc66"
  val w_pc70 = "w-pc70"
  val w_pc75 = "w-pc75"
  val w_pc80 = "w-pc80"
  val w_pc90 = "w-pc90"
  val w_pc100 = "w-pc100"
  val w_auto = "w-auto"
  val w_min = "w-min"
  val w_max = "w-max"
  val w_fit = "w-fit"
  val w_custom_1 = "w-custom-1"
  val w_custom_2 = "w-custom-2"
  val w_custom_3 = "w-custom-3"
  val min_w_fit = "min-w-fit"
  val min_w_min = "min-w-min"
  val min_w_max = "min-w-max"
  val max_w_px128 = "max-w-px128"
  val max_w_px256 = "max-w-px256"
  val max_w_px480 = "max-w-px480"
  val max_w_px512 = "max-w-px512"
  val max_w_px640 = "max-w-px640"
  val max_w_px768 = "max-w-px768"
  val max_w_px1024 = "max-w-px1024"
  val max_w_pc100 = "max-w-pc100"
  val max_w_custom_1 = "max-w-custom-1"
  val max_w_custom_2 = "max-w-custom-2"
  val max_w_custom_3 = "max-w-custom-3"
  val flex_1 = "flex-1"
  val flex_auto = "flex-auto"
  val flex_initial = "flex-initial"
  val flex_none = "flex-none"
  val flex_shrink_0 = "flex-shrink-0"
  val flex_shrink = "flex-shrink"
  val shrink_0 = "shrink-0"
  val shrink = "shrink"
  val flex_grow_0 = "flex-grow-0"
  val flex_grow = "flex-grow"
  val grow_0 = "grow-0"
  val grow = "grow"
  val basis_0 = "basis-0"
  val basis_2 = "basis-2"
  val basis_4 = "basis-4"
  val basis_6 = "basis-6"
  val basis_8 = "basis-8"
  val basis_12 = "basis-12"
  val basis_16 = "basis-16"
  val basis_20 = "basis-20"
  val basis_24 = "basis-24"
  val basis_32 = "basis-32"
  val basis_40 = "basis-40"
  val basis_48 = "basis-48"
  val basis_auto = "basis-auto"
  val basis_full = "basis-full"
  val caption_top = "caption-top"
  val caption_bottom = "caption-bottom"
  val border_spacing_0 = "border-spacing-0"
  val border_spacing_2 = "border-spacing-2"
  val border_spacing_4 = "border-spacing-4"
  val border_spacing_6 = "border-spacing-6"
  val border_spacing_8 = "border-spacing-8"
  val border_spacing_12 = "border-spacing-12"
  val border_spacing_16 = "border-spacing-16"
  val border_spacing_20 = "border-spacing-20"
  val border_spacing_24 = "border-spacing-24"
  val border_spacing_32 = "border-spacing-32"
  val border_spacing_40 = "border-spacing-40"
  val border_spacing_48 = "border-spacing-48"
  val border_spacing_x_0 = "border-spacing-x-0"
  val border_spacing_x_2 = "border-spacing-x-2"
  val border_spacing_x_4 = "border-spacing-x-4"
  val border_spacing_x_6 = "border-spacing-x-6"
  val border_spacing_x_8 = "border-spacing-x-8"
  val border_spacing_x_12 = "border-spacing-x-12"
  val border_spacing_x_16 = "border-spacing-x-16"
  val border_spacing_x_20 = "border-spacing-x-20"
  val border_spacing_x_24 = "border-spacing-x-24"
  val border_spacing_x_32 = "border-spacing-x-32"
  val border_spacing_x_40 = "border-spacing-x-40"
  val border_spacing_x_48 = "border-spacing-x-48"
  val border_spacing_y_0 = "border-spacing-y-0"
  val border_spacing_y_2 = "border-spacing-y-2"
  val border_spacing_y_4 = "border-spacing-y-4"
  val border_spacing_y_6 = "border-spacing-y-6"
  val border_spacing_y_8 = "border-spacing-y-8"
  val border_spacing_y_12 = "border-spacing-y-12"
  val border_spacing_y_16 = "border-spacing-y-16"
  val border_spacing_y_20 = "border-spacing-y-20"
  val border_spacing_y_24 = "border-spacing-y-24"
  val border_spacing_y_32 = "border-spacing-y-32"
  val border_spacing_y_40 = "border-spacing-y-40"
  val border_spacing_y_48 = "border-spacing-y-48"
  val cursor_auto = "cursor-auto"
  val cursor_default = "cursor-default"
  val cursor_pointer = "cursor-pointer"
  val cursor_wait = "cursor-wait"
  val cursor_text = "cursor-text"
  val cursor_move = "cursor-move"
  val cursor_help = "cursor-help"
  val cursor_not_allowed = "cursor-not-allowed"
  val cursor_none = "cursor-none"
  val cursor_context_menu = "cursor-context-menu"
  val cursor_progress = "cursor-progress"
  val cursor_cell = "cursor-cell"
  val cursor_crosshair = "cursor-crosshair"
  val cursor_vertical_text = "cursor-vertical-text"
  val cursor_alias = "cursor-alias"
  val cursor_copy = "cursor-copy"
  val cursor_no_drop = "cursor-no-drop"
  val cursor_grab = "cursor-grab"
  val cursor_grabbing = "cursor-grabbing"
  val cursor_all_scroll = "cursor-all-scroll"
  val cursor_col_resize = "cursor-col-resize"
  val cursor_row_resize = "cursor-row-resize"
  val cursor_n_resize = "cursor-n-resize"
  val cursor_e_resize = "cursor-e-resize"
  val cursor_s_resize = "cursor-s-resize"
  val cursor_w_resize = "cursor-w-resize"
  val cursor_ne_resize = "cursor-ne-resize"
  val cursor_nw_resize = "cursor-nw-resize"
  val cursor_se_resize = "cursor-se-resize"
  val cursor_sw_resize = "cursor-sw-resize"
  val cursor_ew_resize = "cursor-ew-resize"
  val cursor_ns_resize = "cursor-ns-resize"
  val cursor_nesw_resize = "cursor-nesw-resize"
  val cursor_nwse_resize = "cursor-nwse-resize"
  val cursor_zoom_in = "cursor-zoom-in"
  val cursor_zoom_out = "cursor-zoom-out"
  val touch_auto = "touch-auto"
  val touch_none = "touch-none"
  val touch_pan_x = "touch-pan-x"
  val touch_pan_left = "touch-pan-left"
  val touch_pan_right = "touch-pan-right"
  val touch_pan_y = "touch-pan-y"
  val touch_pan_up = "touch-pan-up"
  val touch_pan_down = "touch-pan-down"
  val touch_pinch_zoom = "touch-pinch-zoom"
  val touch_manipulation = "touch-manipulation"
  val select_none = "select-none"
  val select_text = "select-text"
  val select_all = "select-all"
  val select_auto = "select-auto"
  val resize_none = "resize-none"
  val resize_y = "resize-y"
  val resize_x = "resize-x"
  val resize = "resize"
  val snap_none = "snap-none"
  val snap_x = "snap-x"
  val snap_y = "snap-y"
  val snap_both = "snap-both"
  val snap_mandatory = "snap-mandatory"
  val snap_proximity = "snap-proximity"
  val snap_start = "snap-start"
  val snap_end = "snap-end"
  val snap_center = "snap-center"
  val snap_align_none = "snap-align-none"
  val snap_normal = "snap-normal"
  val snap_always = "snap-always"
  val scroll_m_0 = "scroll-m-0"
  val scroll_m_2 = "scroll-m-2"
  val scroll_m_4 = "scroll-m-4"
  val scroll_m_6 = "scroll-m-6"
  val scroll_m_8 = "scroll-m-8"
  val scroll_m_12 = "scroll-m-12"
  val scroll_m_16 = "scroll-m-16"
  val scroll_m_20 = "scroll-m-20"
  val scroll_m_24 = "scroll-m-24"
  val scroll_m_32 = "scroll-m-32"
  val scroll_m_40 = "scroll-m-40"
  val scroll_m_48 = "scroll-m-48"
  val _scroll_m_0 = "-scroll-m-0"
  val _scroll_m_2 = "-scroll-m-2"
  val _scroll_m_4 = "-scroll-m-4"
  val _scroll_m_6 = "-scroll-m-6"
  val _scroll_m_8 = "-scroll-m-8"
  val _scroll_m_12 = "-scroll-m-12"
  val _scroll_m_16 = "-scroll-m-16"
  val _scroll_m_20 = "-scroll-m-20"
  val _scroll_m_24 = "-scroll-m-24"
  val _scroll_m_32 = "-scroll-m-32"
  val _scroll_m_40 = "-scroll-m-40"
  val _scroll_m_48 = "-scroll-m-48"
  val scroll_mx_0 = "scroll-mx-0"
  val scroll_mx_2 = "scroll-mx-2"
  val scroll_mx_4 = "scroll-mx-4"
  val scroll_mx_6 = "scroll-mx-6"
  val scroll_mx_8 = "scroll-mx-8"
  val scroll_mx_12 = "scroll-mx-12"
  val scroll_mx_16 = "scroll-mx-16"
  val scroll_mx_20 = "scroll-mx-20"
  val scroll_mx_24 = "scroll-mx-24"
  val scroll_mx_32 = "scroll-mx-32"
  val scroll_mx_40 = "scroll-mx-40"
  val scroll_mx_48 = "scroll-mx-48"
  val _scroll_mx_0 = "-scroll-mx-0"
  val _scroll_mx_2 = "-scroll-mx-2"
  val _scroll_mx_4 = "-scroll-mx-4"
  val _scroll_mx_6 = "-scroll-mx-6"
  val _scroll_mx_8 = "-scroll-mx-8"
  val _scroll_mx_12 = "-scroll-mx-12"
  val _scroll_mx_16 = "-scroll-mx-16"
  val _scroll_mx_20 = "-scroll-mx-20"
  val _scroll_mx_24 = "-scroll-mx-24"
  val _scroll_mx_32 = "-scroll-mx-32"
  val _scroll_mx_40 = "-scroll-mx-40"
  val _scroll_mx_48 = "-scroll-mx-48"
  val scroll_my_0 = "scroll-my-0"
  val scroll_my_2 = "scroll-my-2"
  val scroll_my_4 = "scroll-my-4"
  val scroll_my_6 = "scroll-my-6"
  val scroll_my_8 = "scroll-my-8"
  val scroll_my_12 = "scroll-my-12"
  val scroll_my_16 = "scroll-my-16"
  val scroll_my_20 = "scroll-my-20"
  val scroll_my_24 = "scroll-my-24"
  val scroll_my_32 = "scroll-my-32"
  val scroll_my_40 = "scroll-my-40"
  val scroll_my_48 = "scroll-my-48"
  val _scroll_my_0 = "-scroll-my-0"
  val _scroll_my_2 = "-scroll-my-2"
  val _scroll_my_4 = "-scroll-my-4"
  val _scroll_my_6 = "-scroll-my-6"
  val _scroll_my_8 = "-scroll-my-8"
  val _scroll_my_12 = "-scroll-my-12"
  val _scroll_my_16 = "-scroll-my-16"
  val _scroll_my_20 = "-scroll-my-20"
  val _scroll_my_24 = "-scroll-my-24"
  val _scroll_my_32 = "-scroll-my-32"
  val _scroll_my_40 = "-scroll-my-40"
  val _scroll_my_48 = "-scroll-my-48"
  val scroll_ms_0 = "scroll-ms-0"
  val scroll_ms_2 = "scroll-ms-2"
  val scroll_ms_4 = "scroll-ms-4"
  val scroll_ms_6 = "scroll-ms-6"
  val scroll_ms_8 = "scroll-ms-8"
  val scroll_ms_12 = "scroll-ms-12"
  val scroll_ms_16 = "scroll-ms-16"
  val scroll_ms_20 = "scroll-ms-20"
  val scroll_ms_24 = "scroll-ms-24"
  val scroll_ms_32 = "scroll-ms-32"
  val scroll_ms_40 = "scroll-ms-40"
  val scroll_ms_48 = "scroll-ms-48"
  val _scroll_ms_0 = "-scroll-ms-0"
  val _scroll_ms_2 = "-scroll-ms-2"
  val _scroll_ms_4 = "-scroll-ms-4"
  val _scroll_ms_6 = "-scroll-ms-6"
  val _scroll_ms_8 = "-scroll-ms-8"
  val _scroll_ms_12 = "-scroll-ms-12"
  val _scroll_ms_16 = "-scroll-ms-16"
  val _scroll_ms_20 = "-scroll-ms-20"
  val _scroll_ms_24 = "-scroll-ms-24"
  val _scroll_ms_32 = "-scroll-ms-32"
  val _scroll_ms_40 = "-scroll-ms-40"
  val _scroll_ms_48 = "-scroll-ms-48"
  val scroll_me_0 = "scroll-me-0"
  val scroll_me_2 = "scroll-me-2"
  val scroll_me_4 = "scroll-me-4"
  val scroll_me_6 = "scroll-me-6"
  val scroll_me_8 = "scroll-me-8"
  val scroll_me_12 = "scroll-me-12"
  val scroll_me_16 = "scroll-me-16"
  val scroll_me_20 = "scroll-me-20"
  val scroll_me_24 = "scroll-me-24"
  val scroll_me_32 = "scroll-me-32"
  val scroll_me_40 = "scroll-me-40"
  val scroll_me_48 = "scroll-me-48"
  val _scroll_me_0 = "-scroll-me-0"
  val _scroll_me_2 = "-scroll-me-2"
  val _scroll_me_4 = "-scroll-me-4"
  val _scroll_me_6 = "-scroll-me-6"
  val _scroll_me_8 = "-scroll-me-8"
  val _scroll_me_12 = "-scroll-me-12"
  val _scroll_me_16 = "-scroll-me-16"
  val _scroll_me_20 = "-scroll-me-20"
  val _scroll_me_24 = "-scroll-me-24"
  val _scroll_me_32 = "-scroll-me-32"
  val _scroll_me_40 = "-scroll-me-40"
  val _scroll_me_48 = "-scroll-me-48"
  val scroll_mt_0 = "scroll-mt-0"
  val scroll_mt_2 = "scroll-mt-2"
  val scroll_mt_4 = "scroll-mt-4"
  val scroll_mt_6 = "scroll-mt-6"
  val scroll_mt_8 = "scroll-mt-8"
  val scroll_mt_12 = "scroll-mt-12"
  val scroll_mt_16 = "scroll-mt-16"
  val scroll_mt_20 = "scroll-mt-20"
  val scroll_mt_24 = "scroll-mt-24"
  val scroll_mt_32 = "scroll-mt-32"
  val scroll_mt_40 = "scroll-mt-40"
  val scroll_mt_48 = "scroll-mt-48"
  val _scroll_mt_0 = "-scroll-mt-0"
  val _scroll_mt_2 = "-scroll-mt-2"
  val _scroll_mt_4 = "-scroll-mt-4"
  val _scroll_mt_6 = "-scroll-mt-6"
  val _scroll_mt_8 = "-scroll-mt-8"
  val _scroll_mt_12 = "-scroll-mt-12"
  val _scroll_mt_16 = "-scroll-mt-16"
  val _scroll_mt_20 = "-scroll-mt-20"
  val _scroll_mt_24 = "-scroll-mt-24"
  val _scroll_mt_32 = "-scroll-mt-32"
  val _scroll_mt_40 = "-scroll-mt-40"
  val _scroll_mt_48 = "-scroll-mt-48"
  val scroll_mr_0 = "scroll-mr-0"
  val scroll_mr_2 = "scroll-mr-2"
  val scroll_mr_4 = "scroll-mr-4"
  val scroll_mr_6 = "scroll-mr-6"
  val scroll_mr_8 = "scroll-mr-8"
  val scroll_mr_12 = "scroll-mr-12"
  val scroll_mr_16 = "scroll-mr-16"
  val scroll_mr_20 = "scroll-mr-20"
  val scroll_mr_24 = "scroll-mr-24"
  val scroll_mr_32 = "scroll-mr-32"
  val scroll_mr_40 = "scroll-mr-40"
  val scroll_mr_48 = "scroll-mr-48"
  val _scroll_mr_0 = "-scroll-mr-0"
  val _scroll_mr_2 = "-scroll-mr-2"
  val _scroll_mr_4 = "-scroll-mr-4"
  val _scroll_mr_6 = "-scroll-mr-6"
  val _scroll_mr_8 = "-scroll-mr-8"
  val _scroll_mr_12 = "-scroll-mr-12"
  val _scroll_mr_16 = "-scroll-mr-16"
  val _scroll_mr_20 = "-scroll-mr-20"
  val _scroll_mr_24 = "-scroll-mr-24"
  val _scroll_mr_32 = "-scroll-mr-32"
  val _scroll_mr_40 = "-scroll-mr-40"
  val _scroll_mr_48 = "-scroll-mr-48"
  val scroll_mb_0 = "scroll-mb-0"
  val scroll_mb_2 = "scroll-mb-2"
  val scroll_mb_4 = "scroll-mb-4"
  val scroll_mb_6 = "scroll-mb-6"
  val scroll_mb_8 = "scroll-mb-8"
  val scroll_mb_12 = "scroll-mb-12"
  val scroll_mb_16 = "scroll-mb-16"
  val scroll_mb_20 = "scroll-mb-20"
  val scroll_mb_24 = "scroll-mb-24"
  val scroll_mb_32 = "scroll-mb-32"
  val scroll_mb_40 = "scroll-mb-40"
  val scroll_mb_48 = "scroll-mb-48"
  val _scroll_mb_0 = "-scroll-mb-0"
  val _scroll_mb_2 = "-scroll-mb-2"
  val _scroll_mb_4 = "-scroll-mb-4"
  val _scroll_mb_6 = "-scroll-mb-6"
  val _scroll_mb_8 = "-scroll-mb-8"
  val _scroll_mb_12 = "-scroll-mb-12"
  val _scroll_mb_16 = "-scroll-mb-16"
  val _scroll_mb_20 = "-scroll-mb-20"
  val _scroll_mb_24 = "-scroll-mb-24"
  val _scroll_mb_32 = "-scroll-mb-32"
  val _scroll_mb_40 = "-scroll-mb-40"
  val _scroll_mb_48 = "-scroll-mb-48"
  val scroll_ml_0 = "scroll-ml-0"
  val scroll_ml_2 = "scroll-ml-2"
  val scroll_ml_4 = "scroll-ml-4"
  val scroll_ml_6 = "scroll-ml-6"
  val scroll_ml_8 = "scroll-ml-8"
  val scroll_ml_12 = "scroll-ml-12"
  val scroll_ml_16 = "scroll-ml-16"
  val scroll_ml_20 = "scroll-ml-20"
  val scroll_ml_24 = "scroll-ml-24"
  val scroll_ml_32 = "scroll-ml-32"
  val scroll_ml_40 = "scroll-ml-40"
  val scroll_ml_48 = "scroll-ml-48"
  val _scroll_ml_0 = "-scroll-ml-0"
  val _scroll_ml_2 = "-scroll-ml-2"
  val _scroll_ml_4 = "-scroll-ml-4"
  val _scroll_ml_6 = "-scroll-ml-6"
  val _scroll_ml_8 = "-scroll-ml-8"
  val _scroll_ml_12 = "-scroll-ml-12"
  val _scroll_ml_16 = "-scroll-ml-16"
  val _scroll_ml_20 = "-scroll-ml-20"
  val _scroll_ml_24 = "-scroll-ml-24"
  val _scroll_ml_32 = "-scroll-ml-32"
  val _scroll_ml_40 = "-scroll-ml-40"
  val _scroll_ml_48 = "-scroll-ml-48"
  val scroll_p_0 = "scroll-p-0"
  val scroll_p_2 = "scroll-p-2"
  val scroll_p_4 = "scroll-p-4"
  val scroll_p_6 = "scroll-p-6"
  val scroll_p_8 = "scroll-p-8"
  val scroll_p_12 = "scroll-p-12"
  val scroll_p_16 = "scroll-p-16"
  val scroll_p_20 = "scroll-p-20"
  val scroll_p_24 = "scroll-p-24"
  val scroll_p_32 = "scroll-p-32"
  val scroll_p_40 = "scroll-p-40"
  val scroll_p_48 = "scroll-p-48"
  val scroll_px_0 = "scroll-px-0"
  val scroll_px_2 = "scroll-px-2"
  val scroll_px_4 = "scroll-px-4"
  val scroll_px_6 = "scroll-px-6"
  val scroll_px_8 = "scroll-px-8"
  val scroll_px_12 = "scroll-px-12"
  val scroll_px_16 = "scroll-px-16"
  val scroll_px_20 = "scroll-px-20"
  val scroll_px_24 = "scroll-px-24"
  val scroll_px_32 = "scroll-px-32"
  val scroll_px_40 = "scroll-px-40"
  val scroll_px_48 = "scroll-px-48"
  val scroll_py_0 = "scroll-py-0"
  val scroll_py_2 = "scroll-py-2"
  val scroll_py_4 = "scroll-py-4"
  val scroll_py_6 = "scroll-py-6"
  val scroll_py_8 = "scroll-py-8"
  val scroll_py_12 = "scroll-py-12"
  val scroll_py_16 = "scroll-py-16"
  val scroll_py_20 = "scroll-py-20"
  val scroll_py_24 = "scroll-py-24"
  val scroll_py_32 = "scroll-py-32"
  val scroll_py_40 = "scroll-py-40"
  val scroll_py_48 = "scroll-py-48"
  val scroll_ps_0 = "scroll-ps-0"
  val scroll_ps_2 = "scroll-ps-2"
  val scroll_ps_4 = "scroll-ps-4"
  val scroll_ps_6 = "scroll-ps-6"
  val scroll_ps_8 = "scroll-ps-8"
  val scroll_ps_12 = "scroll-ps-12"
  val scroll_ps_16 = "scroll-ps-16"
  val scroll_ps_20 = "scroll-ps-20"
  val scroll_ps_24 = "scroll-ps-24"
  val scroll_ps_32 = "scroll-ps-32"
  val scroll_ps_40 = "scroll-ps-40"
  val scroll_ps_48 = "scroll-ps-48"
  val scroll_pe_0 = "scroll-pe-0"
  val scroll_pe_2 = "scroll-pe-2"
  val scroll_pe_4 = "scroll-pe-4"
  val scroll_pe_6 = "scroll-pe-6"
  val scroll_pe_8 = "scroll-pe-8"
  val scroll_pe_12 = "scroll-pe-12"
  val scroll_pe_16 = "scroll-pe-16"
  val scroll_pe_20 = "scroll-pe-20"
  val scroll_pe_24 = "scroll-pe-24"
  val scroll_pe_32 = "scroll-pe-32"
  val scroll_pe_40 = "scroll-pe-40"
  val scroll_pe_48 = "scroll-pe-48"
  val scroll_pt_0 = "scroll-pt-0"
  val scroll_pt_2 = "scroll-pt-2"
  val scroll_pt_4 = "scroll-pt-4"
  val scroll_pt_6 = "scroll-pt-6"
  val scroll_pt_8 = "scroll-pt-8"
  val scroll_pt_12 = "scroll-pt-12"
  val scroll_pt_16 = "scroll-pt-16"
  val scroll_pt_20 = "scroll-pt-20"
  val scroll_pt_24 = "scroll-pt-24"
  val scroll_pt_32 = "scroll-pt-32"
  val scroll_pt_40 = "scroll-pt-40"
  val scroll_pt_48 = "scroll-pt-48"
  val scroll_pr_0 = "scroll-pr-0"
  val scroll_pr_2 = "scroll-pr-2"
  val scroll_pr_4 = "scroll-pr-4"
  val scroll_pr_6 = "scroll-pr-6"
  val scroll_pr_8 = "scroll-pr-8"
  val scroll_pr_12 = "scroll-pr-12"
  val scroll_pr_16 = "scroll-pr-16"
  val scroll_pr_20 = "scroll-pr-20"
  val scroll_pr_24 = "scroll-pr-24"
  val scroll_pr_32 = "scroll-pr-32"
  val scroll_pr_40 = "scroll-pr-40"
  val scroll_pr_48 = "scroll-pr-48"
  val scroll_pb_0 = "scroll-pb-0"
  val scroll_pb_2 = "scroll-pb-2"
  val scroll_pb_4 = "scroll-pb-4"
  val scroll_pb_6 = "scroll-pb-6"
  val scroll_pb_8 = "scroll-pb-8"
  val scroll_pb_12 = "scroll-pb-12"
  val scroll_pb_16 = "scroll-pb-16"
  val scroll_pb_20 = "scroll-pb-20"
  val scroll_pb_24 = "scroll-pb-24"
  val scroll_pb_32 = "scroll-pb-32"
  val scroll_pb_40 = "scroll-pb-40"
  val scroll_pb_48 = "scroll-pb-48"
  val scroll_pl_0 = "scroll-pl-0"
  val scroll_pl_2 = "scroll-pl-2"
  val scroll_pl_4 = "scroll-pl-4"
  val scroll_pl_6 = "scroll-pl-6"
  val scroll_pl_8 = "scroll-pl-8"
  val scroll_pl_12 = "scroll-pl-12"
  val scroll_pl_16 = "scroll-pl-16"
  val scroll_pl_20 = "scroll-pl-20"
  val scroll_pl_24 = "scroll-pl-24"
  val scroll_pl_32 = "scroll-pl-32"
  val scroll_pl_40 = "scroll-pl-40"
  val scroll_pl_48 = "scroll-pl-48"
  val list_image_none = "list-image-none"
  val columns_1 = "columns-1"
  val columns_2 = "columns-2"
  val columns_3 = "columns-3"
  val columns_4 = "columns-4"
  val columns_5 = "columns-5"
  val columns_6 = "columns-6"
  val columns_7 = "columns-7"
  val columns_8 = "columns-8"
  val columns_9 = "columns-9"
  val columns_10 = "columns-10"
  val columns_11 = "columns-11"
  val columns_12 = "columns-12"
  val columns_auto = "columns-auto"
  val columns_3xs = "columns-3xs"
  val columns_2xs = "columns-2xs"
  val columns_xs = "columns-xs"
  val columns_sm = "columns-sm"
  val columns_md = "columns-md"
  val columns_lg = "columns-lg"
  val columns_xl = "columns-xl"
  val columns_2xl = "columns-2xl"
  val columns_3xl = "columns-3xl"
  val columns_4xl = "columns-4xl"
  val columns_5xl = "columns-5xl"
  val columns_6xl = "columns-6xl"
  val columns_7xl = "columns-7xl"
  val break_before_auto = "break-before-auto"
  val break_before_avoid = "break-before-avoid"
  val break_before_all = "break-before-all"
  val break_before_avoid_page = "break-before-avoid-page"
  val break_before_page = "break-before-page"
  val break_before_left = "break-before-left"
  val break_before_right = "break-before-right"
  val break_before_column = "break-before-column"
  val break_inside_auto = "break-inside-auto"
  val break_inside_avoid = "break-inside-avoid"
  val break_inside_avoid_page = "break-inside-avoid-page"
  val break_inside_avoid_column = "break-inside-avoid-column"
  val break_after_auto = "break-after-auto"
  val break_after_avoid = "break-after-avoid"
  val break_after_all = "break-after-all"
  val break_after_avoid_page = "break-after-avoid-page"
  val break_after_page = "break-after-page"
  val break_after_left = "break-after-left"
  val break_after_right = "break-after-right"
  val break_after_column = "break-after-column"
  val grid_cols_1 = "grid-cols-1"
  val grid_cols_2 = "grid-cols-2"
  val grid_cols_3 = "grid-cols-3"
  val grid_cols_4 = "grid-cols-4"
  val grid_cols_5 = "grid-cols-5"
  val grid_cols_6 = "grid-cols-6"
  val grid_cols_7 = "grid-cols-7"
  val grid_cols_8 = "grid-cols-8"
  val grid_cols_9 = "grid-cols-9"
  val grid_cols_10 = "grid-cols-10"
  val grid_cols_11 = "grid-cols-11"
  val grid_cols_12 = "grid-cols-12"
  val grid_cols_none = "grid-cols-none"
  val grid_cols_subgrid = "grid-cols-subgrid"
  val flex_row = "flex-row"
  val flex_row_reverse = "flex-row-reverse"
  val flex_col = "flex-col"
  val flex_col_reverse = "flex-col-reverse"
  val flex_wrap = "flex-wrap"
  val flex_wrap_reverse = "flex-wrap-reverse"
  val flex_nowrap = "flex-nowrap"
  val items_start = "items-start"
  val items_end = "items-end"
  val items_center = "items-center"
  val items_baseline = "items-baseline"
  val items_stretch = "items-stretch"
  val justify_normal = "justify-normal"
  val justify_start = "justify-start"
  val justify_end = "justify-end"
  val justify_center = "justify-center"
  val justify_between = "justify-between"
  val justify_around = "justify-around"
  val justify_evenly = "justify-evenly"
  val justify_stretch = "justify-stretch"
  val justify_items_start = "justify-items-start"
  val justify_items_end = "justify-items-end"
  val justify_items_center = "justify-items-center"
  val justify_items_stretch = "justify-items-stretch"
  val gap_0 = "gap-0"
  val gap_2 = "gap-2"
  val gap_4 = "gap-4"
  val gap_6 = "gap-6"
  val gap_8 = "gap-8"
  val gap_12 = "gap-12"
  val gap_16 = "gap-16"
  val gap_20 = "gap-20"
  val gap_24 = "gap-24"
  val gap_32 = "gap-32"
  val gap_40 = "gap-40"
  val gap_48 = "gap-48"
  val gap_x_0 = "gap-x-0"
  val gap_x_2 = "gap-x-2"
  val gap_x_4 = "gap-x-4"
  val gap_x_6 = "gap-x-6"
  val gap_x_8 = "gap-x-8"
  val gap_x_12 = "gap-x-12"
  val gap_x_16 = "gap-x-16"
  val gap_x_20 = "gap-x-20"
  val gap_x_24 = "gap-x-24"
  val gap_x_32 = "gap-x-32"
  val gap_x_40 = "gap-x-40"
  val gap_x_48 = "gap-x-48"
  val gap_y_0 = "gap-y-0"
  val gap_y_2 = "gap-y-2"
  val gap_y_4 = "gap-y-4"
  val gap_y_6 = "gap-y-6"
  val gap_y_8 = "gap-y-8"
  val gap_y_12 = "gap-y-12"
  val gap_y_16 = "gap-y-16"
  val gap_y_20 = "gap-y-20"
  val gap_y_24 = "gap-y-24"
  val gap_y_32 = "gap-y-32"
  val gap_y_40 = "gap-y-40"
  val gap_y_48 = "gap-y-48"
  val space_x_0 = "space-x-0"
  val space_x_2 = "space-x-2"
  val space_x_4 = "space-x-4"
  val space_x_6 = "space-x-6"
  val space_x_8 = "space-x-8"
  val space_x_12 = "space-x-12"
  val space_x_16 = "space-x-16"
  val space_x_20 = "space-x-20"
  val space_x_24 = "space-x-24"
  val space_x_32 = "space-x-32"
  val space_x_40 = "space-x-40"
  val space_x_48 = "space-x-48"
  val _space_x_0 = "-space-x-0"
  val _space_x_2 = "-space-x-2"
  val _space_x_4 = "-space-x-4"
  val _space_x_6 = "-space-x-6"
  val _space_x_8 = "-space-x-8"
  val _space_x_12 = "-space-x-12"
  val _space_x_16 = "-space-x-16"
  val _space_x_20 = "-space-x-20"
  val _space_x_24 = "-space-x-24"
  val _space_x_32 = "-space-x-32"
  val _space_x_40 = "-space-x-40"
  val _space_x_48 = "-space-x-48"
  val space_y_0 = "space-y-0"
  val space_y_2 = "space-y-2"
  val space_y_4 = "space-y-4"
  val space_y_6 = "space-y-6"
  val space_y_8 = "space-y-8"
  val space_y_12 = "space-y-12"
  val space_y_16 = "space-y-16"
  val space_y_20 = "space-y-20"
  val space_y_24 = "space-y-24"
  val space_y_32 = "space-y-32"
  val space_y_40 = "space-y-40"
  val space_y_48 = "space-y-48"
  val _space_y_0 = "-space-y-0"
  val _space_y_2 = "-space-y-2"
  val _space_y_4 = "-space-y-4"
  val _space_y_6 = "-space-y-6"
  val _space_y_8 = "-space-y-8"
  val _space_y_12 = "-space-y-12"
  val _space_y_16 = "-space-y-16"
  val _space_y_20 = "-space-y-20"
  val _space_y_24 = "-space-y-24"
  val _space_y_32 = "-space-y-32"
  val _space_y_40 = "-space-y-40"
  val _space_y_48 = "-space-y-48"
  val space_y_reverse = "space-y-reverse"
  val space_x_reverse = "space-x-reverse"
  val divide_x_3 = "divide-x-3"
  val divide_x_default = "divide-x-default"
  val divide_y_3 = "divide-y-3"
  val divide_y_default = "divide-y-default"
  val divide_y_reverse = "divide-y-reverse"
  val divide_x_reverse = "divide-x-reverse"
  val divide_solid = "divide-solid"
  val divide_dashed = "divide-dashed"
  val divide_dotted = "divide-dotted"
  val divide_double = "divide-double"
  val divide_none = "divide-none"
  val divide_gray_0 = "divide-gray-0"
  val divide_gray_1 = "divide-gray-1"
  val divide_gray_2 = "divide-gray-2"
  val divide_gray_3 = "divide-gray-3"
  val divide_gray_4 = "divide-gray-4"
  val divide_gray_5 = "divide-gray-5"
  val divide_gray_6 = "divide-gray-6"
  val divide_gray_7 = "divide-gray-7"
  val divide_gray_8 = "divide-gray-8"
  val divide_gray_9 = "divide-gray-9"
  val divide_danger_1 = "divide-danger-1"
  val divide_danger_2 = "divide-danger-2"
  val divide_danger_3 = "divide-danger-3"
  val divide_danger_4 = "divide-danger-4"
  val divide_danger_5 = "divide-danger-5"
  val divide_primary_1 = "divide-primary-1"
  val divide_primary_2 = "divide-primary-2"
  val divide_primary_3 = "divide-primary-3"
  val divide_primary_4 = "divide-primary-4"
  val divide_primary_5 = "divide-primary-5"
  val divide_success_1 = "divide-success-1"
  val divide_success_2 = "divide-success-2"
  val divide_success_3 = "divide-success-3"
  val divide_success_4 = "divide-success-4"
  val divide_success_5 = "divide-success-5"
  val divide_warning_1 = "divide-warning-1"
  val divide_warning_2 = "divide-warning-2"
  val divide_warning_3 = "divide-warning-3"
  val divide_warning_4 = "divide-warning-4"
  val divide_warning_5 = "divide-warning-5"
  val divide_transparent = "divide-transparent"
  val divide_current = "divide-current"
  val divide_inherit = "divide-inherit"
  val divide_custom_1 = "divide-custom-1"
  val divide_custom_2 = "divide-custom-2"
  val divide_custom_3 = "divide-custom-3"
  val divide_custom_4 = "divide-custom-4"
  val divide_opacity_0 = "divide-opacity-0"
  val divide_opacity_10 = "divide-opacity-10"
  val divide_opacity_20 = "divide-opacity-20"
  val divide_opacity_30 = "divide-opacity-30"
  val divide_opacity_40 = "divide-opacity-40"
  val divide_opacity_50 = "divide-opacity-50"
  val divide_opacity_60 = "divide-opacity-60"
  val divide_opacity_70 = "divide-opacity-70"
  val divide_opacity_80 = "divide-opacity-80"
  val divide_opacity_90 = "divide-opacity-90"
  val divide_opacity_100 = "divide-opacity-100"
  val overflow_auto = "overflow-auto"
  val overflow_hidden = "overflow-hidden"
  val overflow_clip = "overflow-clip"
  val overflow_visible = "overflow-visible"
  val overflow_scroll = "overflow-scroll"
  val overflow_x_auto = "overflow-x-auto"
  val overflow_y_auto = "overflow-y-auto"
  val overflow_x_hidden = "overflow-x-hidden"
  val overflow_y_hidden = "overflow-y-hidden"
  val overflow_x_clip = "overflow-x-clip"
  val overflow_y_clip = "overflow-y-clip"
  val overflow_x_visible = "overflow-x-visible"
  val overflow_y_visible = "overflow-y-visible"
  val overflow_x_scroll = "overflow-x-scroll"
  val overflow_y_scroll = "overflow-y-scroll"
  val scroll_auto = "scroll-auto"
  val scroll_smooth = "scroll-smooth"
  val truncate = "truncate"
  val overflow_ellipsis = "overflow-ellipsis"
  val text_ellipsis = "text-ellipsis"
  val text_clip = "text-clip"
  val hyphens_none = "hyphens-none"
  val hyphens_manual = "hyphens-manual"
  val hyphens_auto = "hyphens-auto"
  val whitespace_normal = "whitespace-normal"
  val whitespace_nowrap = "whitespace-nowrap"
  val whitespace_pre = "whitespace-pre"
  val whitespace_pre_line = "whitespace-pre-line"
  val whitespace_pre_wrap = "whitespace-pre-wrap"
  val whitespace_break_spaces = "whitespace-break-spaces"
  val text_wrap = "text-wrap"
  val text_nowrap = "text-nowrap"
  val text_balance = "text-balance"
  val text_pretty = "text-pretty"
  val break_normal = "break-normal"
  val break_words = "break-words"
  val break_all = "break-all"
  val break_keep = "break-keep"
  val rounded_0 = "rounded-0"
  val rounded_2 = "rounded-2"
  val rounded_3 = "rounded-3"
  val rounded_4 = "rounded-4"
  val rounded_6 = "rounded-6"
  val rounded_8 = "rounded-8"
  val rounded_full = "rounded-full"
  val rounded_s_0 = "rounded-s-0"
  val rounded_s_2 = "rounded-s-2"
  val rounded_s_3 = "rounded-s-3"
  val rounded_s_4 = "rounded-s-4"
  val rounded_s_6 = "rounded-s-6"
  val rounded_s_8 = "rounded-s-8"
  val rounded_s_full = "rounded-s-full"
  val rounded_e_0 = "rounded-e-0"
  val rounded_e_2 = "rounded-e-2"
  val rounded_e_3 = "rounded-e-3"
  val rounded_e_4 = "rounded-e-4"
  val rounded_e_6 = "rounded-e-6"
  val rounded_e_8 = "rounded-e-8"
  val rounded_e_full = "rounded-e-full"
  val rounded_t_0 = "rounded-t-0"
  val rounded_t_2 = "rounded-t-2"
  val rounded_t_3 = "rounded-t-3"
  val rounded_t_4 = "rounded-t-4"
  val rounded_t_6 = "rounded-t-6"
  val rounded_t_8 = "rounded-t-8"
  val rounded_t_full = "rounded-t-full"
  val rounded_r_0 = "rounded-r-0"
  val rounded_r_2 = "rounded-r-2"
  val rounded_r_3 = "rounded-r-3"
  val rounded_r_4 = "rounded-r-4"
  val rounded_r_6 = "rounded-r-6"
  val rounded_r_8 = "rounded-r-8"
  val rounded_r_full = "rounded-r-full"
  val rounded_b_0 = "rounded-b-0"
  val rounded_b_2 = "rounded-b-2"
  val rounded_b_3 = "rounded-b-3"
  val rounded_b_4 = "rounded-b-4"
  val rounded_b_6 = "rounded-b-6"
  val rounded_b_8 = "rounded-b-8"
  val rounded_b_full = "rounded-b-full"
  val rounded_l_0 = "rounded-l-0"
  val rounded_l_2 = "rounded-l-2"
  val rounded_l_3 = "rounded-l-3"
  val rounded_l_4 = "rounded-l-4"
  val rounded_l_6 = "rounded-l-6"
  val rounded_l_8 = "rounded-l-8"
  val rounded_l_full = "rounded-l-full"
  val rounded_ss_0 = "rounded-ss-0"
  val rounded_ss_2 = "rounded-ss-2"
  val rounded_ss_3 = "rounded-ss-3"
  val rounded_ss_4 = "rounded-ss-4"
  val rounded_ss_6 = "rounded-ss-6"
  val rounded_ss_8 = "rounded-ss-8"
  val rounded_ss_full = "rounded-ss-full"
  val rounded_se_0 = "rounded-se-0"
  val rounded_se_2 = "rounded-se-2"
  val rounded_se_3 = "rounded-se-3"
  val rounded_se_4 = "rounded-se-4"
  val rounded_se_6 = "rounded-se-6"
  val rounded_se_8 = "rounded-se-8"
  val rounded_se_full = "rounded-se-full"
  val rounded_ee_0 = "rounded-ee-0"
  val rounded_ee_2 = "rounded-ee-2"
  val rounded_ee_3 = "rounded-ee-3"
  val rounded_ee_4 = "rounded-ee-4"
  val rounded_ee_6 = "rounded-ee-6"
  val rounded_ee_8 = "rounded-ee-8"
  val rounded_ee_full = "rounded-ee-full"
  val rounded_es_0 = "rounded-es-0"
  val rounded_es_2 = "rounded-es-2"
  val rounded_es_3 = "rounded-es-3"
  val rounded_es_4 = "rounded-es-4"
  val rounded_es_6 = "rounded-es-6"
  val rounded_es_8 = "rounded-es-8"
  val rounded_es_full = "rounded-es-full"
  val rounded_tl_0 = "rounded-tl-0"
  val rounded_tl_2 = "rounded-tl-2"
  val rounded_tl_3 = "rounded-tl-3"
  val rounded_tl_4 = "rounded-tl-4"
  val rounded_tl_6 = "rounded-tl-6"
  val rounded_tl_8 = "rounded-tl-8"
  val rounded_tl_full = "rounded-tl-full"
  val rounded_tr_0 = "rounded-tr-0"
  val rounded_tr_2 = "rounded-tr-2"
  val rounded_tr_3 = "rounded-tr-3"
  val rounded_tr_4 = "rounded-tr-4"
  val rounded_tr_6 = "rounded-tr-6"
  val rounded_tr_8 = "rounded-tr-8"
  val rounded_tr_full = "rounded-tr-full"
  val rounded_br_0 = "rounded-br-0"
  val rounded_br_2 = "rounded-br-2"
  val rounded_br_3 = "rounded-br-3"
  val rounded_br_4 = "rounded-br-4"
  val rounded_br_6 = "rounded-br-6"
  val rounded_br_8 = "rounded-br-8"
  val rounded_br_full = "rounded-br-full"
  val rounded_bl_0 = "rounded-bl-0"
  val rounded_bl_2 = "rounded-bl-2"
  val rounded_bl_3 = "rounded-bl-3"
  val rounded_bl_4 = "rounded-bl-4"
  val rounded_bl_6 = "rounded-bl-6"
  val rounded_bl_8 = "rounded-bl-8"
  val rounded_bl_full = "rounded-bl-full"
  val border_3 = "border-3"
  val border_default = "border-default"
  val border_x_3 = "border-x-3"
  val border_x_default = "border-x-default"
  val border_y_3 = "border-y-3"
  val border_y_default = "border-y-default"
  val border_s_3 = "border-s-3"
  val border_s_default = "border-s-default"
  val border_e_3 = "border-e-3"
  val border_e_default = "border-e-default"
  val border_t_3 = "border-t-3"
  val border_t_default = "border-t-default"
  val border_r_3 = "border-r-3"
  val border_r_default = "border-r-default"
  val border_b_3 = "border-b-3"
  val border_b_default = "border-b-default"
  val border_l_3 = "border-l-3"
  val border_l_default = "border-l-default"
  val border_solid = "border-solid"
  val border_dashed = "border-dashed"
  val border_dotted = "border-dotted"
  val border_double = "border-double"
  val border_hidden = "border-hidden"
  val border_none = "border-none"
  val border_gray_0 = "border-gray-0"
  val border_gray_1 = "border-gray-1"
  val border_gray_2 = "border-gray-2"
  val border_gray_3 = "border-gray-3"
  val border_gray_4 = "border-gray-4"
  val border_gray_5 = "border-gray-5"
  val border_gray_6 = "border-gray-6"
  val border_gray_7 = "border-gray-7"
  val border_gray_8 = "border-gray-8"
  val border_gray_9 = "border-gray-9"
  val border_danger_1 = "border-danger-1"
  val border_danger_2 = "border-danger-2"
  val border_danger_3 = "border-danger-3"
  val border_danger_4 = "border-danger-4"
  val border_danger_5 = "border-danger-5"
  val border_primary_1 = "border-primary-1"
  val border_primary_2 = "border-primary-2"
  val border_primary_3 = "border-primary-3"
  val border_primary_4 = "border-primary-4"
  val border_primary_5 = "border-primary-5"
  val border_success_1 = "border-success-1"
  val border_success_2 = "border-success-2"
  val border_success_3 = "border-success-3"
  val border_success_4 = "border-success-4"
  val border_success_5 = "border-success-5"
  val border_warning_1 = "border-warning-1"
  val border_warning_2 = "border-warning-2"
  val border_warning_3 = "border-warning-3"
  val border_warning_4 = "border-warning-4"
  val border_warning_5 = "border-warning-5"
  val border_transparent = "border-transparent"
  val border_current = "border-current"
  val border_inherit = "border-inherit"
  val border_custom_1 = "border-custom-1"
  val border_custom_2 = "border-custom-2"
  val border_custom_3 = "border-custom-3"
  val border_custom_4 = "border-custom-4"
  val border_x_gray_0 = "border-x-gray-0"
  val border_x_gray_1 = "border-x-gray-1"
  val border_x_gray_2 = "border-x-gray-2"
  val border_x_gray_3 = "border-x-gray-3"
  val border_x_gray_4 = "border-x-gray-4"
  val border_x_gray_5 = "border-x-gray-5"
  val border_x_gray_6 = "border-x-gray-6"
  val border_x_gray_7 = "border-x-gray-7"
  val border_x_gray_8 = "border-x-gray-8"
  val border_x_gray_9 = "border-x-gray-9"
  val border_x_danger_1 = "border-x-danger-1"
  val border_x_danger_2 = "border-x-danger-2"
  val border_x_danger_3 = "border-x-danger-3"
  val border_x_danger_4 = "border-x-danger-4"
  val border_x_danger_5 = "border-x-danger-5"
  val border_x_primary_1 = "border-x-primary-1"
  val border_x_primary_2 = "border-x-primary-2"
  val border_x_primary_3 = "border-x-primary-3"
  val border_x_primary_4 = "border-x-primary-4"
  val border_x_primary_5 = "border-x-primary-5"
  val border_x_success_1 = "border-x-success-1"
  val border_x_success_2 = "border-x-success-2"
  val border_x_success_3 = "border-x-success-3"
  val border_x_success_4 = "border-x-success-4"
  val border_x_success_5 = "border-x-success-5"
  val border_x_warning_1 = "border-x-warning-1"
  val border_x_warning_2 = "border-x-warning-2"
  val border_x_warning_3 = "border-x-warning-3"
  val border_x_warning_4 = "border-x-warning-4"
  val border_x_warning_5 = "border-x-warning-5"
  val border_x_transparent = "border-x-transparent"
  val border_x_current = "border-x-current"
  val border_x_inherit = "border-x-inherit"
  val border_x_custom_1 = "border-x-custom-1"
  val border_x_custom_2 = "border-x-custom-2"
  val border_x_custom_3 = "border-x-custom-3"
  val border_x_custom_4 = "border-x-custom-4"
  val border_y_gray_0 = "border-y-gray-0"
  val border_y_gray_1 = "border-y-gray-1"
  val border_y_gray_2 = "border-y-gray-2"
  val border_y_gray_3 = "border-y-gray-3"
  val border_y_gray_4 = "border-y-gray-4"
  val border_y_gray_5 = "border-y-gray-5"
  val border_y_gray_6 = "border-y-gray-6"
  val border_y_gray_7 = "border-y-gray-7"
  val border_y_gray_8 = "border-y-gray-8"
  val border_y_gray_9 = "border-y-gray-9"
  val border_y_danger_1 = "border-y-danger-1"
  val border_y_danger_2 = "border-y-danger-2"
  val border_y_danger_3 = "border-y-danger-3"
  val border_y_danger_4 = "border-y-danger-4"
  val border_y_danger_5 = "border-y-danger-5"
  val border_y_primary_1 = "border-y-primary-1"
  val border_y_primary_2 = "border-y-primary-2"
  val border_y_primary_3 = "border-y-primary-3"
  val border_y_primary_4 = "border-y-primary-4"
  val border_y_primary_5 = "border-y-primary-5"
  val border_y_success_1 = "border-y-success-1"
  val border_y_success_2 = "border-y-success-2"
  val border_y_success_3 = "border-y-success-3"
  val border_y_success_4 = "border-y-success-4"
  val border_y_success_5 = "border-y-success-5"
  val border_y_warning_1 = "border-y-warning-1"
  val border_y_warning_2 = "border-y-warning-2"
  val border_y_warning_3 = "border-y-warning-3"
  val border_y_warning_4 = "border-y-warning-4"
  val border_y_warning_5 = "border-y-warning-5"
  val border_y_transparent = "border-y-transparent"
  val border_y_current = "border-y-current"
  val border_y_inherit = "border-y-inherit"
  val border_y_custom_1 = "border-y-custom-1"
  val border_y_custom_2 = "border-y-custom-2"
  val border_y_custom_3 = "border-y-custom-3"
  val border_y_custom_4 = "border-y-custom-4"
  val border_s_gray_0 = "border-s-gray-0"
  val border_s_gray_1 = "border-s-gray-1"
  val border_s_gray_2 = "border-s-gray-2"
  val border_s_gray_3 = "border-s-gray-3"
  val border_s_gray_4 = "border-s-gray-4"
  val border_s_gray_5 = "border-s-gray-5"
  val border_s_gray_6 = "border-s-gray-6"
  val border_s_gray_7 = "border-s-gray-7"
  val border_s_gray_8 = "border-s-gray-8"
  val border_s_gray_9 = "border-s-gray-9"
  val border_s_danger_1 = "border-s-danger-1"
  val border_s_danger_2 = "border-s-danger-2"
  val border_s_danger_3 = "border-s-danger-3"
  val border_s_danger_4 = "border-s-danger-4"
  val border_s_danger_5 = "border-s-danger-5"
  val border_s_primary_1 = "border-s-primary-1"
  val border_s_primary_2 = "border-s-primary-2"
  val border_s_primary_3 = "border-s-primary-3"
  val border_s_primary_4 = "border-s-primary-4"
  val border_s_primary_5 = "border-s-primary-5"
  val border_s_success_1 = "border-s-success-1"
  val border_s_success_2 = "border-s-success-2"
  val border_s_success_3 = "border-s-success-3"
  val border_s_success_4 = "border-s-success-4"
  val border_s_success_5 = "border-s-success-5"
  val border_s_warning_1 = "border-s-warning-1"
  val border_s_warning_2 = "border-s-warning-2"
  val border_s_warning_3 = "border-s-warning-3"
  val border_s_warning_4 = "border-s-warning-4"
  val border_s_warning_5 = "border-s-warning-5"
  val border_s_transparent = "border-s-transparent"
  val border_s_current = "border-s-current"
  val border_s_inherit = "border-s-inherit"
  val border_s_custom_1 = "border-s-custom-1"
  val border_s_custom_2 = "border-s-custom-2"
  val border_s_custom_3 = "border-s-custom-3"
  val border_s_custom_4 = "border-s-custom-4"
  val border_e_gray_0 = "border-e-gray-0"
  val border_e_gray_1 = "border-e-gray-1"
  val border_e_gray_2 = "border-e-gray-2"
  val border_e_gray_3 = "border-e-gray-3"
  val border_e_gray_4 = "border-e-gray-4"
  val border_e_gray_5 = "border-e-gray-5"
  val border_e_gray_6 = "border-e-gray-6"
  val border_e_gray_7 = "border-e-gray-7"
  val border_e_gray_8 = "border-e-gray-8"
  val border_e_gray_9 = "border-e-gray-9"
  val border_e_danger_1 = "border-e-danger-1"
  val border_e_danger_2 = "border-e-danger-2"
  val border_e_danger_3 = "border-e-danger-3"
  val border_e_danger_4 = "border-e-danger-4"
  val border_e_danger_5 = "border-e-danger-5"
  val border_e_primary_1 = "border-e-primary-1"
  val border_e_primary_2 = "border-e-primary-2"
  val border_e_primary_3 = "border-e-primary-3"
  val border_e_primary_4 = "border-e-primary-4"
  val border_e_primary_5 = "border-e-primary-5"
  val border_e_success_1 = "border-e-success-1"
  val border_e_success_2 = "border-e-success-2"
  val border_e_success_3 = "border-e-success-3"
  val border_e_success_4 = "border-e-success-4"
  val border_e_success_5 = "border-e-success-5"
  val border_e_warning_1 = "border-e-warning-1"
  val border_e_warning_2 = "border-e-warning-2"
  val border_e_warning_3 = "border-e-warning-3"
  val border_e_warning_4 = "border-e-warning-4"
  val border_e_warning_5 = "border-e-warning-5"
  val border_e_transparent = "border-e-transparent"
  val border_e_current = "border-e-current"
  val border_e_inherit = "border-e-inherit"
  val border_e_custom_1 = "border-e-custom-1"
  val border_e_custom_2 = "border-e-custom-2"
  val border_e_custom_3 = "border-e-custom-3"
  val border_e_custom_4 = "border-e-custom-4"
  val border_t_gray_0 = "border-t-gray-0"
  val border_t_gray_1 = "border-t-gray-1"
  val border_t_gray_2 = "border-t-gray-2"
  val border_t_gray_3 = "border-t-gray-3"
  val border_t_gray_4 = "border-t-gray-4"
  val border_t_gray_5 = "border-t-gray-5"
  val border_t_gray_6 = "border-t-gray-6"
  val border_t_gray_7 = "border-t-gray-7"
  val border_t_gray_8 = "border-t-gray-8"
  val border_t_gray_9 = "border-t-gray-9"
  val border_t_danger_1 = "border-t-danger-1"
  val border_t_danger_2 = "border-t-danger-2"
  val border_t_danger_3 = "border-t-danger-3"
  val border_t_danger_4 = "border-t-danger-4"
  val border_t_danger_5 = "border-t-danger-5"
  val border_t_primary_1 = "border-t-primary-1"
  val border_t_primary_2 = "border-t-primary-2"
  val border_t_primary_3 = "border-t-primary-3"
  val border_t_primary_4 = "border-t-primary-4"
  val border_t_primary_5 = "border-t-primary-5"
  val border_t_success_1 = "border-t-success-1"
  val border_t_success_2 = "border-t-success-2"
  val border_t_success_3 = "border-t-success-3"
  val border_t_success_4 = "border-t-success-4"
  val border_t_success_5 = "border-t-success-5"
  val border_t_warning_1 = "border-t-warning-1"
  val border_t_warning_2 = "border-t-warning-2"
  val border_t_warning_3 = "border-t-warning-3"
  val border_t_warning_4 = "border-t-warning-4"
  val border_t_warning_5 = "border-t-warning-5"
  val border_t_transparent = "border-t-transparent"
  val border_t_current = "border-t-current"
  val border_t_inherit = "border-t-inherit"
  val border_t_custom_1 = "border-t-custom-1"
  val border_t_custom_2 = "border-t-custom-2"
  val border_t_custom_3 = "border-t-custom-3"
  val border_t_custom_4 = "border-t-custom-4"
  val border_r_gray_0 = "border-r-gray-0"
  val border_r_gray_1 = "border-r-gray-1"
  val border_r_gray_2 = "border-r-gray-2"
  val border_r_gray_3 = "border-r-gray-3"
  val border_r_gray_4 = "border-r-gray-4"
  val border_r_gray_5 = "border-r-gray-5"
  val border_r_gray_6 = "border-r-gray-6"
  val border_r_gray_7 = "border-r-gray-7"
  val border_r_gray_8 = "border-r-gray-8"
  val border_r_gray_9 = "border-r-gray-9"
  val border_r_danger_1 = "border-r-danger-1"
  val border_r_danger_2 = "border-r-danger-2"
  val border_r_danger_3 = "border-r-danger-3"
  val border_r_danger_4 = "border-r-danger-4"
  val border_r_danger_5 = "border-r-danger-5"
  val border_r_primary_1 = "border-r-primary-1"
  val border_r_primary_2 = "border-r-primary-2"
  val border_r_primary_3 = "border-r-primary-3"
  val border_r_primary_4 = "border-r-primary-4"
  val border_r_primary_5 = "border-r-primary-5"
  val border_r_success_1 = "border-r-success-1"
  val border_r_success_2 = "border-r-success-2"
  val border_r_success_3 = "border-r-success-3"
  val border_r_success_4 = "border-r-success-4"
  val border_r_success_5 = "border-r-success-5"
  val border_r_warning_1 = "border-r-warning-1"
  val border_r_warning_2 = "border-r-warning-2"
  val border_r_warning_3 = "border-r-warning-3"
  val border_r_warning_4 = "border-r-warning-4"
  val border_r_warning_5 = "border-r-warning-5"
  val border_r_transparent = "border-r-transparent"
  val border_r_current = "border-r-current"
  val border_r_inherit = "border-r-inherit"
  val border_r_custom_1 = "border-r-custom-1"
  val border_r_custom_2 = "border-r-custom-2"
  val border_r_custom_3 = "border-r-custom-3"
  val border_r_custom_4 = "border-r-custom-4"
  val border_b_gray_0 = "border-b-gray-0"
  val border_b_gray_1 = "border-b-gray-1"
  val border_b_gray_2 = "border-b-gray-2"
  val border_b_gray_3 = "border-b-gray-3"
  val border_b_gray_4 = "border-b-gray-4"
  val border_b_gray_5 = "border-b-gray-5"
  val border_b_gray_6 = "border-b-gray-6"
  val border_b_gray_7 = "border-b-gray-7"
  val border_b_gray_8 = "border-b-gray-8"
  val border_b_gray_9 = "border-b-gray-9"
  val border_b_danger_1 = "border-b-danger-1"
  val border_b_danger_2 = "border-b-danger-2"
  val border_b_danger_3 = "border-b-danger-3"
  val border_b_danger_4 = "border-b-danger-4"
  val border_b_danger_5 = "border-b-danger-5"
  val border_b_primary_1 = "border-b-primary-1"
  val border_b_primary_2 = "border-b-primary-2"
  val border_b_primary_3 = "border-b-primary-3"
  val border_b_primary_4 = "border-b-primary-4"
  val border_b_primary_5 = "border-b-primary-5"
  val border_b_success_1 = "border-b-success-1"
  val border_b_success_2 = "border-b-success-2"
  val border_b_success_3 = "border-b-success-3"
  val border_b_success_4 = "border-b-success-4"
  val border_b_success_5 = "border-b-success-5"
  val border_b_warning_1 = "border-b-warning-1"
  val border_b_warning_2 = "border-b-warning-2"
  val border_b_warning_3 = "border-b-warning-3"
  val border_b_warning_4 = "border-b-warning-4"
  val border_b_warning_5 = "border-b-warning-5"
  val border_b_transparent = "border-b-transparent"
  val border_b_current = "border-b-current"
  val border_b_inherit = "border-b-inherit"
  val border_b_custom_1 = "border-b-custom-1"
  val border_b_custom_2 = "border-b-custom-2"
  val border_b_custom_3 = "border-b-custom-3"
  val border_b_custom_4 = "border-b-custom-4"
  val border_l_gray_0 = "border-l-gray-0"
  val border_l_gray_1 = "border-l-gray-1"
  val border_l_gray_2 = "border-l-gray-2"
  val border_l_gray_3 = "border-l-gray-3"
  val border_l_gray_4 = "border-l-gray-4"
  val border_l_gray_5 = "border-l-gray-5"
  val border_l_gray_6 = "border-l-gray-6"
  val border_l_gray_7 = "border-l-gray-7"
  val border_l_gray_8 = "border-l-gray-8"
  val border_l_gray_9 = "border-l-gray-9"
  val border_l_danger_1 = "border-l-danger-1"
  val border_l_danger_2 = "border-l-danger-2"
  val border_l_danger_3 = "border-l-danger-3"
  val border_l_danger_4 = "border-l-danger-4"
  val border_l_danger_5 = "border-l-danger-5"
  val border_l_primary_1 = "border-l-primary-1"
  val border_l_primary_2 = "border-l-primary-2"
  val border_l_primary_3 = "border-l-primary-3"
  val border_l_primary_4 = "border-l-primary-4"
  val border_l_primary_5 = "border-l-primary-5"
  val border_l_success_1 = "border-l-success-1"
  val border_l_success_2 = "border-l-success-2"
  val border_l_success_3 = "border-l-success-3"
  val border_l_success_4 = "border-l-success-4"
  val border_l_success_5 = "border-l-success-5"
  val border_l_warning_1 = "border-l-warning-1"
  val border_l_warning_2 = "border-l-warning-2"
  val border_l_warning_3 = "border-l-warning-3"
  val border_l_warning_4 = "border-l-warning-4"
  val border_l_warning_5 = "border-l-warning-5"
  val border_l_transparent = "border-l-transparent"
  val border_l_current = "border-l-current"
  val border_l_inherit = "border-l-inherit"
  val border_l_custom_1 = "border-l-custom-1"
  val border_l_custom_2 = "border-l-custom-2"
  val border_l_custom_3 = "border-l-custom-3"
  val border_l_custom_4 = "border-l-custom-4"
  val border_opacity_0 = "border-opacity-0"
  val border_opacity_10 = "border-opacity-10"
  val border_opacity_20 = "border-opacity-20"
  val border_opacity_30 = "border-opacity-30"
  val border_opacity_40 = "border-opacity-40"
  val border_opacity_50 = "border-opacity-50"
  val border_opacity_60 = "border-opacity-60"
  val border_opacity_70 = "border-opacity-70"
  val border_opacity_80 = "border-opacity-80"
  val border_opacity_90 = "border-opacity-90"
  val border_opacity_100 = "border-opacity-100"
  val bg_gray_0 = "bg-gray-0"
  val bg_gray_1 = "bg-gray-1"
  val bg_gray_2 = "bg-gray-2"
  val bg_gray_3 = "bg-gray-3"
  val bg_gray_4 = "bg-gray-4"
  val bg_gray_5 = "bg-gray-5"
  val bg_gray_6 = "bg-gray-6"
  val bg_gray_7 = "bg-gray-7"
  val bg_gray_8 = "bg-gray-8"
  val bg_gray_9 = "bg-gray-9"
  val bg_danger_1 = "bg-danger-1"
  val bg_danger_2 = "bg-danger-2"
  val bg_danger_3 = "bg-danger-3"
  val bg_danger_4 = "bg-danger-4"
  val bg_danger_5 = "bg-danger-5"
  val bg_primary_1 = "bg-primary-1"
  val bg_primary_2 = "bg-primary-2"
  val bg_primary_3 = "bg-primary-3"
  val bg_primary_4 = "bg-primary-4"
  val bg_primary_5 = "bg-primary-5"
  val bg_success_1 = "bg-success-1"
  val bg_success_2 = "bg-success-2"
  val bg_success_3 = "bg-success-3"
  val bg_success_4 = "bg-success-4"
  val bg_success_5 = "bg-success-5"
  val bg_warning_1 = "bg-warning-1"
  val bg_warning_2 = "bg-warning-2"
  val bg_warning_3 = "bg-warning-3"
  val bg_warning_4 = "bg-warning-4"
  val bg_warning_5 = "bg-warning-5"
  val bg_transparent = "bg-transparent"
  val bg_current = "bg-current"
  val bg_inherit = "bg-inherit"
  val bg_custom_1 = "bg-custom-1"
  val bg_custom_2 = "bg-custom-2"
  val bg_custom_3 = "bg-custom-3"
  val bg_custom_4 = "bg-custom-4"
  val bg_opacity_0 = "bg-opacity-0"
  val bg_opacity_10 = "bg-opacity-10"
  val bg_opacity_20 = "bg-opacity-20"
  val bg_opacity_30 = "bg-opacity-30"
  val bg_opacity_40 = "bg-opacity-40"
  val bg_opacity_50 = "bg-opacity-50"
  val bg_opacity_60 = "bg-opacity-60"
  val bg_opacity_70 = "bg-opacity-70"
  val bg_opacity_80 = "bg-opacity-80"
  val bg_opacity_90 = "bg-opacity-90"
  val bg_opacity_100 = "bg-opacity-100"
  val bg_clip_border = "bg-clip-border"
  val bg_clip_padding = "bg-clip-padding"
  val bg_clip_content = "bg-clip-content"
  val bg_clip_text = "bg-clip-text"
  val bg_origin_border = "bg-origin-border"
  val bg_origin_padding = "bg-origin-padding"
  val bg_origin_content = "bg-origin-content"
  val p_0 = "p-0"
  val p_2 = "p-2"
  val p_4 = "p-4"
  val p_6 = "p-6"
  val p_8 = "p-8"
  val p_12 = "p-12"
  val p_16 = "p-16"
  val p_20 = "p-20"
  val p_24 = "p-24"
  val p_32 = "p-32"
  val p_40 = "p-40"
  val p_48 = "p-48"
  val px_0 = "px-0"
  val px_2 = "px-2"
  val px_4 = "px-4"
  val px_6 = "px-6"
  val px_8 = "px-8"
  val px_12 = "px-12"
  val px_16 = "px-16"
  val px_20 = "px-20"
  val px_24 = "px-24"
  val px_32 = "px-32"
  val px_40 = "px-40"
  val px_48 = "px-48"
  val py_0 = "py-0"
  val py_2 = "py-2"
  val py_4 = "py-4"
  val py_6 = "py-6"
  val py_8 = "py-8"
  val py_12 = "py-12"
  val py_16 = "py-16"
  val py_20 = "py-20"
  val py_24 = "py-24"
  val py_32 = "py-32"
  val py_40 = "py-40"
  val py_48 = "py-48"
  val ps_0 = "ps-0"
  val ps_2 = "ps-2"
  val ps_4 = "ps-4"
  val ps_6 = "ps-6"
  val ps_8 = "ps-8"
  val ps_12 = "ps-12"
  val ps_16 = "ps-16"
  val ps_20 = "ps-20"
  val ps_24 = "ps-24"
  val ps_32 = "ps-32"
  val ps_40 = "ps-40"
  val ps_48 = "ps-48"
  val pe_0 = "pe-0"
  val pe_2 = "pe-2"
  val pe_4 = "pe-4"
  val pe_6 = "pe-6"
  val pe_8 = "pe-8"
  val pe_12 = "pe-12"
  val pe_16 = "pe-16"
  val pe_20 = "pe-20"
  val pe_24 = "pe-24"
  val pe_32 = "pe-32"
  val pe_40 = "pe-40"
  val pe_48 = "pe-48"
  val pt_0 = "pt-0"
  val pt_2 = "pt-2"
  val pt_4 = "pt-4"
  val pt_6 = "pt-6"
  val pt_8 = "pt-8"
  val pt_12 = "pt-12"
  val pt_16 = "pt-16"
  val pt_20 = "pt-20"
  val pt_24 = "pt-24"
  val pt_32 = "pt-32"
  val pt_40 = "pt-40"
  val pt_48 = "pt-48"
  val pr_0 = "pr-0"
  val pr_2 = "pr-2"
  val pr_4 = "pr-4"
  val pr_6 = "pr-6"
  val pr_8 = "pr-8"
  val pr_12 = "pr-12"
  val pr_16 = "pr-16"
  val pr_20 = "pr-20"
  val pr_24 = "pr-24"
  val pr_32 = "pr-32"
  val pr_40 = "pr-40"
  val pr_48 = "pr-48"
  val pb_0 = "pb-0"
  val pb_2 = "pb-2"
  val pb_4 = "pb-4"
  val pb_6 = "pb-6"
  val pb_8 = "pb-8"
  val pb_12 = "pb-12"
  val pb_16 = "pb-16"
  val pb_20 = "pb-20"
  val pb_24 = "pb-24"
  val pb_32 = "pb-32"
  val pb_40 = "pb-40"
  val pb_48 = "pb-48"
  val pl_0 = "pl-0"
  val pl_2 = "pl-2"
  val pl_4 = "pl-4"
  val pl_6 = "pl-6"
  val pl_8 = "pl-8"
  val pl_12 = "pl-12"
  val pl_16 = "pl-16"
  val pl_20 = "pl-20"
  val pl_24 = "pl-24"
  val pl_32 = "pl-32"
  val pl_40 = "pl-40"
  val pl_48 = "pl-48"
  val text_left = "text-left"
  val text_center = "text-center"
  val text_right = "text-right"
  val text_justify = "text-justify"
  val text_start = "text-start"
  val text_end = "text-end"
  val indent_0 = "indent-0"
  val indent_2 = "indent-2"
  val indent_4 = "indent-4"
  val indent_6 = "indent-6"
  val indent_8 = "indent-8"
  val indent_12 = "indent-12"
  val indent_16 = "indent-16"
  val indent_20 = "indent-20"
  val indent_24 = "indent-24"
  val indent_32 = "indent-32"
  val indent_40 = "indent-40"
  val indent_48 = "indent-48"
  val _indent_0 = "-indent-0"
  val _indent_2 = "-indent-2"
  val _indent_4 = "-indent-4"
  val _indent_6 = "-indent-6"
  val _indent_8 = "-indent-8"
  val _indent_12 = "-indent-12"
  val _indent_16 = "-indent-16"
  val _indent_20 = "-indent-20"
  val _indent_24 = "-indent-24"
  val _indent_32 = "-indent-32"
  val _indent_40 = "-indent-40"
  val _indent_48 = "-indent-48"
  val align_baseline = "align-baseline"
  val align_top = "align-top"
  val align_middle = "align-middle"
  val align_bottom = "align-bottom"
  val align_text_top = "align-text-top"
  val align_text_bottom = "align-text-bottom"
  val align_sub = "align-sub"
  val align_super = "align-super"
  val font_sans = "font-sans"
  val font_mono = "font-mono"
  val text_9 = "text-9"
  val text_10 = "text-10"
  val text_11 = "text-11"
  val text_13 = "text-13"
  val text_15 = "text-15"
  val text_17 = "text-17"
  val text_20 = "text-20"
  val text_23 = "text-23"
  val text_26 = "text-26"
  val text_30 = "text-30"
  val text_35 = "text-35"
  val text_custom_1 = "text-custom-1"
  val font_normal = "font-normal"
  val font_medium = "font-medium"
  val font_semi_bold = "font-semi-bold"
  val font_bold = "font-bold"
  val uppercase = "uppercase"
  val lowercase = "lowercase"
  val capitalize = "capitalize"
  val normal_case = "normal-case"
  val italic = "italic"
  val not_italic = "not-italic"
  val normal_nums = "normal-nums"
  val ordinal = "ordinal"
  val slashed_zero = "slashed-zero"
  val lining_nums = "lining-nums"
  val oldstyle_nums = "oldstyle-nums"
  val proportional_nums = "proportional-nums"
  val tabular_nums = "tabular-nums"
  val diagonal_fractions = "diagonal-fractions"
  val stacked_fractions = "stacked-fractions"
  val leading_16 = "leading-16"
  val leading_20 = "leading-20"
  val leading_24 = "leading-24"
  val leading_28 = "leading-28"
  val leading_32 = "leading-32"
  val leading_40 = "leading-40"
  val leading_44 = "leading-44"
  val leading_r1p5 = "leading-r1p5"
  val text_gray_0 = "text-gray-0"
  val text_gray_1 = "text-gray-1"
  val text_gray_2 = "text-gray-2"
  val text_gray_3 = "text-gray-3"
  val text_gray_4 = "text-gray-4"
  val text_gray_5 = "text-gray-5"
  val text_gray_6 = "text-gray-6"
  val text_gray_7 = "text-gray-7"
  val text_gray_8 = "text-gray-8"
  val text_gray_9 = "text-gray-9"
  val text_danger_1 = "text-danger-1"
  val text_danger_2 = "text-danger-2"
  val text_danger_3 = "text-danger-3"
  val text_danger_4 = "text-danger-4"
  val text_danger_5 = "text-danger-5"
  val text_primary_1 = "text-primary-1"
  val text_primary_2 = "text-primary-2"
  val text_primary_3 = "text-primary-3"
  val text_primary_4 = "text-primary-4"
  val text_primary_5 = "text-primary-5"
  val text_success_1 = "text-success-1"
  val text_success_2 = "text-success-2"
  val text_success_3 = "text-success-3"
  val text_success_4 = "text-success-4"
  val text_success_5 = "text-success-5"
  val text_warning_1 = "text-warning-1"
  val text_warning_2 = "text-warning-2"
  val text_warning_3 = "text-warning-3"
  val text_warning_4 = "text-warning-4"
  val text_warning_5 = "text-warning-5"
  val text_transparent = "text-transparent"
  val text_current = "text-current"
  val text_inherit = "text-inherit"
  val text_custom_1 = "text-custom-1"
  val text_custom_2 = "text-custom-2"
  val text_custom_3 = "text-custom-3"
  val text_custom_4 = "text-custom-4"
  val text_opacity_0 = "text-opacity-0"
  val text_opacity_10 = "text-opacity-10"
  val text_opacity_20 = "text-opacity-20"
  val text_opacity_30 = "text-opacity-30"
  val text_opacity_40 = "text-opacity-40"
  val text_opacity_50 = "text-opacity-50"
  val text_opacity_60 = "text-opacity-60"
  val text_opacity_70 = "text-opacity-70"
  val text_opacity_80 = "text-opacity-80"
  val text_opacity_90 = "text-opacity-90"
  val text_opacity_100 = "text-opacity-100"
  val underline = "underline"
  val overline = "overline"
  val line_through = "line-through"
  val no_underline = "no-underline"
  val decoration_gray_0 = "decoration-gray-0"
  val decoration_gray_1 = "decoration-gray-1"
  val decoration_gray_2 = "decoration-gray-2"
  val decoration_gray_3 = "decoration-gray-3"
  val decoration_gray_4 = "decoration-gray-4"
  val decoration_gray_5 = "decoration-gray-5"
  val decoration_gray_6 = "decoration-gray-6"
  val decoration_gray_7 = "decoration-gray-7"
  val decoration_gray_8 = "decoration-gray-8"
  val decoration_gray_9 = "decoration-gray-9"
  val decoration_danger_1 = "decoration-danger-1"
  val decoration_danger_2 = "decoration-danger-2"
  val decoration_danger_3 = "decoration-danger-3"
  val decoration_danger_4 = "decoration-danger-4"
  val decoration_danger_5 = "decoration-danger-5"
  val decoration_primary_1 = "decoration-primary-1"
  val decoration_primary_2 = "decoration-primary-2"
  val decoration_primary_3 = "decoration-primary-3"
  val decoration_primary_4 = "decoration-primary-4"
  val decoration_primary_5 = "decoration-primary-5"
  val decoration_success_1 = "decoration-success-1"
  val decoration_success_2 = "decoration-success-2"
  val decoration_success_3 = "decoration-success-3"
  val decoration_success_4 = "decoration-success-4"
  val decoration_success_5 = "decoration-success-5"
  val decoration_warning_1 = "decoration-warning-1"
  val decoration_warning_2 = "decoration-warning-2"
  val decoration_warning_3 = "decoration-warning-3"
  val decoration_warning_4 = "decoration-warning-4"
  val decoration_warning_5 = "decoration-warning-5"
  val decoration_transparent = "decoration-transparent"
  val decoration_current = "decoration-current"
  val decoration_inherit = "decoration-inherit"
  val decoration_custom_1 = "decoration-custom-1"
  val decoration_custom_2 = "decoration-custom-2"
  val decoration_custom_3 = "decoration-custom-3"
  val decoration_custom_4 = "decoration-custom-4"
  val decoration_solid = "decoration-solid"
  val decoration_double = "decoration-double"
  val decoration_dotted = "decoration-dotted"
  val decoration_dashed = "decoration-dashed"
  val decoration_wavy = "decoration-wavy"
  val decoration_0 = "decoration-0"
  val decoration_1 = "decoration-1"
  val decoration_2 = "decoration-2"
  val decoration_4 = "decoration-4"
  val decoration_8 = "decoration-8"
  val decoration_auto = "decoration-auto"
  val decoration_from_font = "decoration-from-font"
  val underline_offset_0 = "underline-offset-0"
  val underline_offset_1 = "underline-offset-1"
  val underline_offset_2 = "underline-offset-2"
  val underline_offset_4 = "underline-offset-4"
  val underline_offset_8 = "underline-offset-8"
  val underline_offset_auto = "underline-offset-auto"
  val antialiased = "antialiased"
  val subpixel_antialiased = "subpixel-antialiased"
  val caret_gray_0 = "caret-gray-0"
  val caret_gray_1 = "caret-gray-1"
  val caret_gray_2 = "caret-gray-2"
  val caret_gray_3 = "caret-gray-3"
  val caret_gray_4 = "caret-gray-4"
  val caret_gray_5 = "caret-gray-5"
  val caret_gray_6 = "caret-gray-6"
  val caret_gray_7 = "caret-gray-7"
  val caret_gray_8 = "caret-gray-8"
  val caret_gray_9 = "caret-gray-9"
  val caret_danger_1 = "caret-danger-1"
  val caret_danger_2 = "caret-danger-2"
  val caret_danger_3 = "caret-danger-3"
  val caret_danger_4 = "caret-danger-4"
  val caret_danger_5 = "caret-danger-5"
  val caret_primary_1 = "caret-primary-1"
  val caret_primary_2 = "caret-primary-2"
  val caret_primary_3 = "caret-primary-3"
  val caret_primary_4 = "caret-primary-4"
  val caret_primary_5 = "caret-primary-5"
  val caret_success_1 = "caret-success-1"
  val caret_success_2 = "caret-success-2"
  val caret_success_3 = "caret-success-3"
  val caret_success_4 = "caret-success-4"
  val caret_success_5 = "caret-success-5"
  val caret_warning_1 = "caret-warning-1"
  val caret_warning_2 = "caret-warning-2"
  val caret_warning_3 = "caret-warning-3"
  val caret_warning_4 = "caret-warning-4"
  val caret_warning_5 = "caret-warning-5"
  val caret_transparent = "caret-transparent"
  val caret_current = "caret-current"
  val caret_inherit = "caret-inherit"
  val caret_custom_1 = "caret-custom-1"
  val caret_custom_2 = "caret-custom-2"
  val caret_custom_3 = "caret-custom-3"
  val caret_custom_4 = "caret-custom-4"
  val accent_gray_0 = "accent-gray-0"
  val accent_gray_1 = "accent-gray-1"
  val accent_gray_2 = "accent-gray-2"
  val accent_gray_3 = "accent-gray-3"
  val accent_gray_4 = "accent-gray-4"
  val accent_gray_5 = "accent-gray-5"
  val accent_gray_6 = "accent-gray-6"
  val accent_gray_7 = "accent-gray-7"
  val accent_gray_8 = "accent-gray-8"
  val accent_gray_9 = "accent-gray-9"
  val accent_danger_1 = "accent-danger-1"
  val accent_danger_2 = "accent-danger-2"
  val accent_danger_3 = "accent-danger-3"
  val accent_danger_4 = "accent-danger-4"
  val accent_danger_5 = "accent-danger-5"
  val accent_primary_1 = "accent-primary-1"
  val accent_primary_2 = "accent-primary-2"
  val accent_primary_3 = "accent-primary-3"
  val accent_primary_4 = "accent-primary-4"
  val accent_primary_5 = "accent-primary-5"
  val accent_success_1 = "accent-success-1"
  val accent_success_2 = "accent-success-2"
  val accent_success_3 = "accent-success-3"
  val accent_success_4 = "accent-success-4"
  val accent_success_5 = "accent-success-5"
  val accent_warning_1 = "accent-warning-1"
  val accent_warning_2 = "accent-warning-2"
  val accent_warning_3 = "accent-warning-3"
  val accent_warning_4 = "accent-warning-4"
  val accent_warning_5 = "accent-warning-5"
  val accent_transparent = "accent-transparent"
  val accent_current = "accent-current"
  val accent_inherit = "accent-inherit"
  val accent_custom_1 = "accent-custom-1"
  val accent_custom_2 = "accent-custom-2"
  val accent_custom_3 = "accent-custom-3"
  val accent_custom_4 = "accent-custom-4"
  val accent_auto = "accent-auto"
  val opacity_0 = "opacity-0"
  val opacity_10 = "opacity-10"
  val opacity_20 = "opacity-20"
  val opacity_30 = "opacity-30"
  val opacity_40 = "opacity-40"
  val opacity_50 = "opacity-50"
  val opacity_60 = "opacity-60"
  val opacity_70 = "opacity-70"
  val opacity_80 = "opacity-80"
  val opacity_90 = "opacity-90"
  val opacity_100 = "opacity-100"
  val shadow_1 = "shadow-1"
  val shadow_2 = "shadow-2"
  val shadow_3 = "shadow-3"
  val shadow_4 = "shadow-4"
  val shadow_gray_0 = "shadow-gray-0"
  val shadow_gray_1 = "shadow-gray-1"
  val shadow_gray_2 = "shadow-gray-2"
  val shadow_gray_3 = "shadow-gray-3"
  val shadow_gray_4 = "shadow-gray-4"
  val shadow_gray_5 = "shadow-gray-5"
  val shadow_gray_6 = "shadow-gray-6"
  val shadow_gray_7 = "shadow-gray-7"
  val shadow_gray_8 = "shadow-gray-8"
  val shadow_gray_9 = "shadow-gray-9"
  val shadow_danger_1 = "shadow-danger-1"
  val shadow_danger_2 = "shadow-danger-2"
  val shadow_danger_3 = "shadow-danger-3"
  val shadow_danger_4 = "shadow-danger-4"
  val shadow_danger_5 = "shadow-danger-5"
  val shadow_primary_1 = "shadow-primary-1"
  val shadow_primary_2 = "shadow-primary-2"
  val shadow_primary_3 = "shadow-primary-3"
  val shadow_primary_4 = "shadow-primary-4"
  val shadow_primary_5 = "shadow-primary-5"
  val shadow_success_1 = "shadow-success-1"
  val shadow_success_2 = "shadow-success-2"
  val shadow_success_3 = "shadow-success-3"
  val shadow_success_4 = "shadow-success-4"
  val shadow_success_5 = "shadow-success-5"
  val shadow_warning_1 = "shadow-warning-1"
  val shadow_warning_2 = "shadow-warning-2"
  val shadow_warning_3 = "shadow-warning-3"
  val shadow_warning_4 = "shadow-warning-4"
  val shadow_warning_5 = "shadow-warning-5"
  val shadow_transparent = "shadow-transparent"
  val shadow_current = "shadow-current"
  val shadow_inherit = "shadow-inherit"
  val shadow_custom_1 = "shadow-custom-1"
  val shadow_custom_2 = "shadow-custom-2"
  val shadow_custom_3 = "shadow-custom-3"
  val shadow_custom_4 = "shadow-custom-4"
  val outline_none = "outline-none"
  val outline = "outline"
  val outline_dashed = "outline-dashed"
  val outline_dotted = "outline-dotted"
  val outline_double = "outline-double"
  val outline_0 = "outline-0"
  val outline_1 = "outline-1"
  val outline_2 = "outline-2"
  val outline_4 = "outline-4"
  val outline_8 = "outline-8"
  val outline_offset_0 = "outline-offset-0"
  val outline_offset_1 = "outline-offset-1"
  val outline_offset_2 = "outline-offset-2"
  val outline_offset_4 = "outline-offset-4"
  val outline_offset_8 = "outline-offset-8"
  val _outline_offset_0 = "-outline-offset-0"
  val _outline_offset_1 = "-outline-offset-1"
  val _outline_offset_2 = "-outline-offset-2"
  val _outline_offset_4 = "-outline-offset-4"
  val _outline_offset_8 = "-outline-offset-8"
  val outline_gray_0 = "outline-gray-0"
  val outline_gray_1 = "outline-gray-1"
  val outline_gray_2 = "outline-gray-2"
  val outline_gray_3 = "outline-gray-3"
  val outline_gray_4 = "outline-gray-4"
  val outline_gray_5 = "outline-gray-5"
  val outline_gray_6 = "outline-gray-6"
  val outline_gray_7 = "outline-gray-7"
  val outline_gray_8 = "outline-gray-8"
  val outline_gray_9 = "outline-gray-9"
  val outline_danger_1 = "outline-danger-1"
  val outline_danger_2 = "outline-danger-2"
  val outline_danger_3 = "outline-danger-3"
  val outline_danger_4 = "outline-danger-4"
  val outline_danger_5 = "outline-danger-5"
  val outline_primary_1 = "outline-primary-1"
  val outline_primary_2 = "outline-primary-2"
  val outline_primary_3 = "outline-primary-3"
  val outline_primary_4 = "outline-primary-4"
  val outline_primary_5 = "outline-primary-5"
  val outline_success_1 = "outline-success-1"
  val outline_success_2 = "outline-success-2"
  val outline_success_3 = "outline-success-3"
  val outline_success_4 = "outline-success-4"
  val outline_success_5 = "outline-success-5"
  val outline_warning_1 = "outline-warning-1"
  val outline_warning_2 = "outline-warning-2"
  val outline_warning_3 = "outline-warning-3"
  val outline_warning_4 = "outline-warning-4"
  val outline_warning_5 = "outline-warning-5"
  val outline_transparent = "outline-transparent"
  val outline_current = "outline-current"
  val outline_inherit = "outline-inherit"
  val outline_custom_1 = "outline-custom-1"
  val outline_custom_2 = "outline-custom-2"
  val outline_custom_3 = "outline-custom-3"
  val outline_custom_4 = "outline-custom-4"
  val brightness_0 = "brightness-0"
  val brightness_50 = "brightness-50"
  val brightness_75 = "brightness-75"
  val brightness_90 = "brightness-90"
  val brightness_95 = "brightness-95"
  val brightness_100 = "brightness-100"
  val brightness_105 = "brightness-105"
  val brightness_110 = "brightness-110"
  val brightness_125 = "brightness-125"
  val brightness_150 = "brightness-150"
  val brightness_200 = "brightness-200"
  val ease_linear = "ease-linear"
  val ease_in = "ease-in"
  val ease_out = "ease-out"
  val ease_in_out = "ease-in-out"
  val will_change_auto = "will-change-auto"
  val will_change_scroll = "will-change-scroll"
  val will_change_contents = "will-change-contents"
  val will_change_transform = "will-change-transform"
  val contain_none = "contain-none"
  val contain_content = "contain-content"
  val contain_strict = "contain-strict"
  val contain_size = "contain-size"
  val contain_inline_size = "contain-inline-size"
  val contain_layout = "contain-layout"
  val contain_paint = "contain-paint"
  val contain_style = "contain-style"
  val content_none = "content-none"
  val forced_color_adjust_auto = "forced-color-adjust-auto"
  val forced_color_adjust_none = "forced-color-adjust-none"
}

case class SwStyle(style: String = "") {
  def addClasses(classNames: String): SwStyle = {
    val newStyle = s"$style ${classNames}".trim
    SwStyle(newStyle)
  }
  def addClass(className: String): SwStyle = addClasses(className)

  def first_letter(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first_letter:$cls").mkString(" ")
    addClasses(classes)
  }
  def first_line(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first_line:$cls").mkString(" ")
    addClasses(classes)
  }
  def marker(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"marker:$cls").mkString(" ")
    addClasses(classes)
  }
  def selection(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"selection:$cls").mkString(" ")
    addClasses(classes)
  }
  def file(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"file:$cls").mkString(" ")
    addClasses(classes)
  }
  def placeholder(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"placeholder:$cls").mkString(" ")
    addClasses(classes)
  }
  def backdrop(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"backdrop:$cls").mkString(" ")
    addClasses(classes)
  }
  def before(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"before:$cls").mkString(" ")
    addClasses(classes)
  }
  def after(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"after:$cls").mkString(" ")
    addClasses(classes)
  }
  def first(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first:$cls").mkString(" ")
    addClasses(classes)
  }
  def last(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"last:$cls").mkString(" ")
    addClasses(classes)
  }
  def only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"only:$cls").mkString(" ")
    addClasses(classes)
  }
  def odd(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"odd:$cls").mkString(" ")
    addClasses(classes)
  }
  def even(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"even:$cls").mkString(" ")
    addClasses(classes)
  }
  def first_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"first_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def last_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"last_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def only_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"only_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def visited(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"visited:$cls").mkString(" ")
    addClasses(classes)
  }
  def target(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"target:$cls").mkString(" ")
    addClasses(classes)
  }
  def open(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"open:$cls").mkString(" ")
    addClasses(classes)
  }
  def default(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"default:$cls").mkString(" ")
    addClasses(classes)
  }
  def checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def indeterminate(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"indeterminate:$cls").mkString(" ")
    addClasses(classes)
  }
  def placeholder_shown(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"placeholder_shown:$cls").mkString(" ")
    addClasses(classes)
  }
  def autofill(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"autofill:$cls").mkString(" ")
    addClasses(classes)
  }
  def optional(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"optional:$cls").mkString(" ")
    addClasses(classes)
  }
  def required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"required:$cls").mkString(" ")
    addClasses(classes)
  }
  def valid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"valid:$cls").mkString(" ")
    addClasses(classes)
  }
  def invalid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"invalid:$cls").mkString(" ")
    addClasses(classes)
  }
  def in_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"in_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def out_of_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"out_of_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def read_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"read_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def empty(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"empty:$cls").mkString(" ")
    addClasses(classes)
  }
  def focus_within(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"focus_within:$cls").mkString(" ")
    addClasses(classes)
  }
  def hover(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"hover:$cls").mkString(" ")
    addClasses(classes)
  }
  def focus(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"focus:$cls").mkString(" ")
    addClasses(classes)
  }
  def focus_visible(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"focus_visible:$cls").mkString(" ")
    addClasses(classes)
  }
  def active(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"active:$cls").mkString(" ")
    addClasses(classes)
  }
  def enabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"enabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_first(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_first:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_last(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_last:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_odd(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_odd:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_even(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_even:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_first_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_first_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_last_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_last_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_only_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_only_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_visited(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_visited:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_target(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_target:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_open(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_open:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_default(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_default:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_indeterminate(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_indeterminate:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_placeholder_shown(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_placeholder_shown:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_autofill(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_autofill:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_optional(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_optional:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_valid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_valid:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_invalid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_invalid:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_in_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_in_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_out_of_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_out_of_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_read_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_read_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_empty(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_empty:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_focus_within(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_focus_within:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_hover(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_hover:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_focus(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_focus:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_focus_visible(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_focus_visible:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_active(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_active:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_enabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_enabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_first(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_first:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_last(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_last:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_odd(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_odd:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_even(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_even:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_first_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_first_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_last_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_last_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_only_of_type(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_only_of_type:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_visited(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_visited:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_target(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_target:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_open(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_open:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_default(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_default:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_indeterminate(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_indeterminate:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_placeholder_shown(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_placeholder_shown:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_autofill(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_autofill:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_optional(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_optional:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_valid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_valid:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_invalid(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_invalid:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_in_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_in_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_out_of_range(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_out_of_range:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_read_only(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_read_only:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_empty(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_empty:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_focus_within(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_focus_within:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_hover(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_hover:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_focus(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_focus:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_focus_visible(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_focus_visible:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_active(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_active:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_enabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_enabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer:$cls").mkString(" ")
    addClasses(classes)
  }
  def has(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"has:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_has(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_has:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_has(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_has:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_busy(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_busy:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_expanded(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_expanded:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_hidden(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_hidden:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_pressed(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_pressed:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_readonly(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_readonly:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria_selected(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria_selected:$cls").mkString(" ")
    addClasses(classes)
  }
  def aria(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"aria:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_busy(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_busy:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_expanded(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_expanded:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_hidden(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_hidden:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_pressed(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_pressed:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_readonly(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_readonly:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria_selected(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria_selected:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_aria(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_aria:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_busy(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_busy:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_checked(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_checked:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_disabled(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_disabled:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_expanded(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_expanded:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_hidden(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_hidden:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_pressed(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_pressed:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_readonly(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_readonly:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_required(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_required:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria_selected(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria_selected:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_aria(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_aria:$cls").mkString(" ")
    addClasses(classes)
  }
  def data(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"data:$cls").mkString(" ")
    addClasses(classes)
  }
  def group_data(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"group_data:$cls").mkString(" ")
    addClasses(classes)
  }
  def peer_data(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"peer_data:$cls").mkString(" ")
    addClasses(classes)
  }
  def supports(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"supports:$cls").mkString(" ")
    addClasses(classes)
  }
  def motion_safe(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"motion_safe:$cls").mkString(" ")
    addClasses(classes)
  }
  def motion_reduce(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"motion_reduce:$cls").mkString(" ")
    addClasses(classes)
  }
  def contrast_more(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"contrast_more:$cls").mkString(" ")
    addClasses(classes)
  }
  def contrast_less(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"contrast_less:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_sm(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_sm:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_md(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_md:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_lg(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_lg:$cls").mkString(" ")
    addClasses(classes)
  }
  def max_xl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max_xl:$cls").mkString(" ")
    addClasses(classes)
  }
  def max(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"max:$cls").mkString(" ")
    addClasses(classes)
  }
  def sm(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"sm:$cls").mkString(" ")
    addClasses(classes)
  }
  def md(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"md:$cls").mkString(" ")
    addClasses(classes)
  }
  def lg(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"lg:$cls").mkString(" ")
    addClasses(classes)
  }
  def xl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"xl:$cls").mkString(" ")
    addClasses(classes)
  }
  def min(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"min:$cls").mkString(" ")
    addClasses(classes)
  }
  def portrait(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"portrait:$cls").mkString(" ")
    addClasses(classes)
  }
  def landscape(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"landscape:$cls").mkString(" ")
    addClasses(classes)
  }
  def ltr(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"ltr:$cls").mkString(" ")
    addClasses(classes)
  }
  def rtl(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"rtl:$cls").mkString(" ")
    addClasses(classes)
  }
  def dark(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"dark:$cls").mkString(" ")
    addClasses(classes)
  }
  def forced_colors(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"forced_colors:$cls").mkString(" ")
    addClasses(classes)
  }
  def print(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"print:$cls").mkString(" ")
    addClasses(classes)
  }
  def important(styles: SwStyle): SwStyle = {
    val classes = styles.style.split("\\s+").map(cls => s"important:$cls").mkString(" ")
    addClasses(classes)
  }

  override def toString: String = style
}

given Conversion[SwStyle, String] with
  def apply(swStyle: SwStyle): String = swStyle.style

extension (swStyle: SwStyle)
  def container: SwStyle = swStyle.addClass(cls.container)
  def pointer_events_none: SwStyle = swStyle.addClass(cls.pointer_events_none)
  def pointer_events_auto: SwStyle = swStyle.addClass(cls.pointer_events_auto)
  def visible: SwStyle = swStyle.addClass(cls.visible)
  def invisible: SwStyle = swStyle.addClass(cls.invisible)
  def collapse: SwStyle = swStyle.addClass(cls.collapse)
  def static: SwStyle = swStyle.addClass(cls.static)
  def fixed: SwStyle = swStyle.addClass(cls.fixed)
  def absolute: SwStyle = swStyle.addClass(cls.absolute)
  def relative: SwStyle = swStyle.addClass(cls.relative)
  def sticky: SwStyle = swStyle.addClass(cls.sticky)
  def inset_0: SwStyle = swStyle.addClass(cls.inset_0)
  def _inset_0: SwStyle = swStyle.addClass(cls._inset_0)
  def inset_x_0: SwStyle = swStyle.addClass(cls.inset_x_0)
  def _inset_x_0: SwStyle = swStyle.addClass(cls._inset_x_0)
  def inset_y_0: SwStyle = swStyle.addClass(cls.inset_y_0)
  def _inset_y_0: SwStyle = swStyle.addClass(cls._inset_y_0)
  def start_0: SwStyle = swStyle.addClass(cls.start_0)
  def _start_0: SwStyle = swStyle.addClass(cls._start_0)
  def end_0: SwStyle = swStyle.addClass(cls.end_0)
  def _end_0: SwStyle = swStyle.addClass(cls._end_0)
  def top_0: SwStyle = swStyle.addClass(cls.top_0)
  def _top_0: SwStyle = swStyle.addClass(cls._top_0)
  def right_0: SwStyle = swStyle.addClass(cls.right_0)
  def _right_0: SwStyle = swStyle.addClass(cls._right_0)
  def bottom_0: SwStyle = swStyle.addClass(cls.bottom_0)
  def _bottom_0: SwStyle = swStyle.addClass(cls._bottom_0)
  def left_0: SwStyle = swStyle.addClass(cls.left_0)
  def _left_0: SwStyle = swStyle.addClass(cls._left_0)
  def isolate: SwStyle = swStyle.addClass(cls.isolate)
  def isolation_auto: SwStyle = swStyle.addClass(cls.isolation_auto)
  def z_0: SwStyle = swStyle.addClass(cls.z_0)
  def z_1: SwStyle = swStyle.addClass(cls.z_1)
  def z_2: SwStyle = swStyle.addClass(cls.z_2)
  def z_3: SwStyle = swStyle.addClass(cls.z_3)
  def z_4: SwStyle = swStyle.addClass(cls.z_4)
  def z_5: SwStyle = swStyle.addClass(cls.z_5)
  def z_999: SwStyle = swStyle.addClass(cls.z_999)
  def z_9999: SwStyle = swStyle.addClass(cls.z_9999)
  def z_auto: SwStyle = swStyle.addClass(cls.z_auto)
  def _z_0: SwStyle = swStyle.addClass(cls._z_0)
  def _z_1: SwStyle = swStyle.addClass(cls._z_1)
  def _z_2: SwStyle = swStyle.addClass(cls._z_2)
  def _z_3: SwStyle = swStyle.addClass(cls._z_3)
  def _z_4: SwStyle = swStyle.addClass(cls._z_4)
  def _z_5: SwStyle = swStyle.addClass(cls._z_5)
  def _z_999: SwStyle = swStyle.addClass(cls._z_999)
  def _z_9999: SwStyle = swStyle.addClass(cls._z_9999)
  def m_0: SwStyle = swStyle.addClass(cls.m_0)
  def m_2: SwStyle = swStyle.addClass(cls.m_2)
  def m_4: SwStyle = swStyle.addClass(cls.m_4)
  def m_6: SwStyle = swStyle.addClass(cls.m_6)
  def m_8: SwStyle = swStyle.addClass(cls.m_8)
  def m_12: SwStyle = swStyle.addClass(cls.m_12)
  def m_16: SwStyle = swStyle.addClass(cls.m_16)
  def m_20: SwStyle = swStyle.addClass(cls.m_20)
  def m_24: SwStyle = swStyle.addClass(cls.m_24)
  def m_32: SwStyle = swStyle.addClass(cls.m_32)
  def m_40: SwStyle = swStyle.addClass(cls.m_40)
  def m_48: SwStyle = swStyle.addClass(cls.m_48)
  def m_auto: SwStyle = swStyle.addClass(cls.m_auto)
  def _m_0: SwStyle = swStyle.addClass(cls._m_0)
  def _m_2: SwStyle = swStyle.addClass(cls._m_2)
  def _m_4: SwStyle = swStyle.addClass(cls._m_4)
  def _m_6: SwStyle = swStyle.addClass(cls._m_6)
  def _m_8: SwStyle = swStyle.addClass(cls._m_8)
  def _m_12: SwStyle = swStyle.addClass(cls._m_12)
  def _m_16: SwStyle = swStyle.addClass(cls._m_16)
  def _m_20: SwStyle = swStyle.addClass(cls._m_20)
  def _m_24: SwStyle = swStyle.addClass(cls._m_24)
  def _m_32: SwStyle = swStyle.addClass(cls._m_32)
  def _m_40: SwStyle = swStyle.addClass(cls._m_40)
  def _m_48: SwStyle = swStyle.addClass(cls._m_48)
  def mx_0: SwStyle = swStyle.addClass(cls.mx_0)
  def mx_2: SwStyle = swStyle.addClass(cls.mx_2)
  def mx_4: SwStyle = swStyle.addClass(cls.mx_4)
  def mx_6: SwStyle = swStyle.addClass(cls.mx_6)
  def mx_8: SwStyle = swStyle.addClass(cls.mx_8)
  def mx_12: SwStyle = swStyle.addClass(cls.mx_12)
  def mx_16: SwStyle = swStyle.addClass(cls.mx_16)
  def mx_20: SwStyle = swStyle.addClass(cls.mx_20)
  def mx_24: SwStyle = swStyle.addClass(cls.mx_24)
  def mx_32: SwStyle = swStyle.addClass(cls.mx_32)
  def mx_40: SwStyle = swStyle.addClass(cls.mx_40)
  def mx_48: SwStyle = swStyle.addClass(cls.mx_48)
  def mx_auto: SwStyle = swStyle.addClass(cls.mx_auto)
  def _mx_0: SwStyle = swStyle.addClass(cls._mx_0)
  def _mx_2: SwStyle = swStyle.addClass(cls._mx_2)
  def _mx_4: SwStyle = swStyle.addClass(cls._mx_4)
  def _mx_6: SwStyle = swStyle.addClass(cls._mx_6)
  def _mx_8: SwStyle = swStyle.addClass(cls._mx_8)
  def _mx_12: SwStyle = swStyle.addClass(cls._mx_12)
  def _mx_16: SwStyle = swStyle.addClass(cls._mx_16)
  def _mx_20: SwStyle = swStyle.addClass(cls._mx_20)
  def _mx_24: SwStyle = swStyle.addClass(cls._mx_24)
  def _mx_32: SwStyle = swStyle.addClass(cls._mx_32)
  def _mx_40: SwStyle = swStyle.addClass(cls._mx_40)
  def _mx_48: SwStyle = swStyle.addClass(cls._mx_48)
  def my_0: SwStyle = swStyle.addClass(cls.my_0)
  def my_2: SwStyle = swStyle.addClass(cls.my_2)
  def my_4: SwStyle = swStyle.addClass(cls.my_4)
  def my_6: SwStyle = swStyle.addClass(cls.my_6)
  def my_8: SwStyle = swStyle.addClass(cls.my_8)
  def my_12: SwStyle = swStyle.addClass(cls.my_12)
  def my_16: SwStyle = swStyle.addClass(cls.my_16)
  def my_20: SwStyle = swStyle.addClass(cls.my_20)
  def my_24: SwStyle = swStyle.addClass(cls.my_24)
  def my_32: SwStyle = swStyle.addClass(cls.my_32)
  def my_40: SwStyle = swStyle.addClass(cls.my_40)
  def my_48: SwStyle = swStyle.addClass(cls.my_48)
  def my_auto: SwStyle = swStyle.addClass(cls.my_auto)
  def _my_0: SwStyle = swStyle.addClass(cls._my_0)
  def _my_2: SwStyle = swStyle.addClass(cls._my_2)
  def _my_4: SwStyle = swStyle.addClass(cls._my_4)
  def _my_6: SwStyle = swStyle.addClass(cls._my_6)
  def _my_8: SwStyle = swStyle.addClass(cls._my_8)
  def _my_12: SwStyle = swStyle.addClass(cls._my_12)
  def _my_16: SwStyle = swStyle.addClass(cls._my_16)
  def _my_20: SwStyle = swStyle.addClass(cls._my_20)
  def _my_24: SwStyle = swStyle.addClass(cls._my_24)
  def _my_32: SwStyle = swStyle.addClass(cls._my_32)
  def _my_40: SwStyle = swStyle.addClass(cls._my_40)
  def _my_48: SwStyle = swStyle.addClass(cls._my_48)
  def ms_0: SwStyle = swStyle.addClass(cls.ms_0)
  def ms_2: SwStyle = swStyle.addClass(cls.ms_2)
  def ms_4: SwStyle = swStyle.addClass(cls.ms_4)
  def ms_6: SwStyle = swStyle.addClass(cls.ms_6)
  def ms_8: SwStyle = swStyle.addClass(cls.ms_8)
  def ms_12: SwStyle = swStyle.addClass(cls.ms_12)
  def ms_16: SwStyle = swStyle.addClass(cls.ms_16)
  def ms_20: SwStyle = swStyle.addClass(cls.ms_20)
  def ms_24: SwStyle = swStyle.addClass(cls.ms_24)
  def ms_32: SwStyle = swStyle.addClass(cls.ms_32)
  def ms_40: SwStyle = swStyle.addClass(cls.ms_40)
  def ms_48: SwStyle = swStyle.addClass(cls.ms_48)
  def ms_auto: SwStyle = swStyle.addClass(cls.ms_auto)
  def _ms_0: SwStyle = swStyle.addClass(cls._ms_0)
  def _ms_2: SwStyle = swStyle.addClass(cls._ms_2)
  def _ms_4: SwStyle = swStyle.addClass(cls._ms_4)
  def _ms_6: SwStyle = swStyle.addClass(cls._ms_6)
  def _ms_8: SwStyle = swStyle.addClass(cls._ms_8)
  def _ms_12: SwStyle = swStyle.addClass(cls._ms_12)
  def _ms_16: SwStyle = swStyle.addClass(cls._ms_16)
  def _ms_20: SwStyle = swStyle.addClass(cls._ms_20)
  def _ms_24: SwStyle = swStyle.addClass(cls._ms_24)
  def _ms_32: SwStyle = swStyle.addClass(cls._ms_32)
  def _ms_40: SwStyle = swStyle.addClass(cls._ms_40)
  def _ms_48: SwStyle = swStyle.addClass(cls._ms_48)
  def me_0: SwStyle = swStyle.addClass(cls.me_0)
  def me_2: SwStyle = swStyle.addClass(cls.me_2)
  def me_4: SwStyle = swStyle.addClass(cls.me_4)
  def me_6: SwStyle = swStyle.addClass(cls.me_6)
  def me_8: SwStyle = swStyle.addClass(cls.me_8)
  def me_12: SwStyle = swStyle.addClass(cls.me_12)
  def me_16: SwStyle = swStyle.addClass(cls.me_16)
  def me_20: SwStyle = swStyle.addClass(cls.me_20)
  def me_24: SwStyle = swStyle.addClass(cls.me_24)
  def me_32: SwStyle = swStyle.addClass(cls.me_32)
  def me_40: SwStyle = swStyle.addClass(cls.me_40)
  def me_48: SwStyle = swStyle.addClass(cls.me_48)
  def me_auto: SwStyle = swStyle.addClass(cls.me_auto)
  def _me_0: SwStyle = swStyle.addClass(cls._me_0)
  def _me_2: SwStyle = swStyle.addClass(cls._me_2)
  def _me_4: SwStyle = swStyle.addClass(cls._me_4)
  def _me_6: SwStyle = swStyle.addClass(cls._me_6)
  def _me_8: SwStyle = swStyle.addClass(cls._me_8)
  def _me_12: SwStyle = swStyle.addClass(cls._me_12)
  def _me_16: SwStyle = swStyle.addClass(cls._me_16)
  def _me_20: SwStyle = swStyle.addClass(cls._me_20)
  def _me_24: SwStyle = swStyle.addClass(cls._me_24)
  def _me_32: SwStyle = swStyle.addClass(cls._me_32)
  def _me_40: SwStyle = swStyle.addClass(cls._me_40)
  def _me_48: SwStyle = swStyle.addClass(cls._me_48)
  def mt_0: SwStyle = swStyle.addClass(cls.mt_0)
  def mt_2: SwStyle = swStyle.addClass(cls.mt_2)
  def mt_4: SwStyle = swStyle.addClass(cls.mt_4)
  def mt_6: SwStyle = swStyle.addClass(cls.mt_6)
  def mt_8: SwStyle = swStyle.addClass(cls.mt_8)
  def mt_12: SwStyle = swStyle.addClass(cls.mt_12)
  def mt_16: SwStyle = swStyle.addClass(cls.mt_16)
  def mt_20: SwStyle = swStyle.addClass(cls.mt_20)
  def mt_24: SwStyle = swStyle.addClass(cls.mt_24)
  def mt_32: SwStyle = swStyle.addClass(cls.mt_32)
  def mt_40: SwStyle = swStyle.addClass(cls.mt_40)
  def mt_48: SwStyle = swStyle.addClass(cls.mt_48)
  def mt_auto: SwStyle = swStyle.addClass(cls.mt_auto)
  def _mt_0: SwStyle = swStyle.addClass(cls._mt_0)
  def _mt_2: SwStyle = swStyle.addClass(cls._mt_2)
  def _mt_4: SwStyle = swStyle.addClass(cls._mt_4)
  def _mt_6: SwStyle = swStyle.addClass(cls._mt_6)
  def _mt_8: SwStyle = swStyle.addClass(cls._mt_8)
  def _mt_12: SwStyle = swStyle.addClass(cls._mt_12)
  def _mt_16: SwStyle = swStyle.addClass(cls._mt_16)
  def _mt_20: SwStyle = swStyle.addClass(cls._mt_20)
  def _mt_24: SwStyle = swStyle.addClass(cls._mt_24)
  def _mt_32: SwStyle = swStyle.addClass(cls._mt_32)
  def _mt_40: SwStyle = swStyle.addClass(cls._mt_40)
  def _mt_48: SwStyle = swStyle.addClass(cls._mt_48)
  def mr_0: SwStyle = swStyle.addClass(cls.mr_0)
  def mr_2: SwStyle = swStyle.addClass(cls.mr_2)
  def mr_4: SwStyle = swStyle.addClass(cls.mr_4)
  def mr_6: SwStyle = swStyle.addClass(cls.mr_6)
  def mr_8: SwStyle = swStyle.addClass(cls.mr_8)
  def mr_12: SwStyle = swStyle.addClass(cls.mr_12)
  def mr_16: SwStyle = swStyle.addClass(cls.mr_16)
  def mr_20: SwStyle = swStyle.addClass(cls.mr_20)
  def mr_24: SwStyle = swStyle.addClass(cls.mr_24)
  def mr_32: SwStyle = swStyle.addClass(cls.mr_32)
  def mr_40: SwStyle = swStyle.addClass(cls.mr_40)
  def mr_48: SwStyle = swStyle.addClass(cls.mr_48)
  def mr_auto: SwStyle = swStyle.addClass(cls.mr_auto)
  def _mr_0: SwStyle = swStyle.addClass(cls._mr_0)
  def _mr_2: SwStyle = swStyle.addClass(cls._mr_2)
  def _mr_4: SwStyle = swStyle.addClass(cls._mr_4)
  def _mr_6: SwStyle = swStyle.addClass(cls._mr_6)
  def _mr_8: SwStyle = swStyle.addClass(cls._mr_8)
  def _mr_12: SwStyle = swStyle.addClass(cls._mr_12)
  def _mr_16: SwStyle = swStyle.addClass(cls._mr_16)
  def _mr_20: SwStyle = swStyle.addClass(cls._mr_20)
  def _mr_24: SwStyle = swStyle.addClass(cls._mr_24)
  def _mr_32: SwStyle = swStyle.addClass(cls._mr_32)
  def _mr_40: SwStyle = swStyle.addClass(cls._mr_40)
  def _mr_48: SwStyle = swStyle.addClass(cls._mr_48)
  def mb_0: SwStyle = swStyle.addClass(cls.mb_0)
  def mb_2: SwStyle = swStyle.addClass(cls.mb_2)
  def mb_4: SwStyle = swStyle.addClass(cls.mb_4)
  def mb_6: SwStyle = swStyle.addClass(cls.mb_6)
  def mb_8: SwStyle = swStyle.addClass(cls.mb_8)
  def mb_12: SwStyle = swStyle.addClass(cls.mb_12)
  def mb_16: SwStyle = swStyle.addClass(cls.mb_16)
  def mb_20: SwStyle = swStyle.addClass(cls.mb_20)
  def mb_24: SwStyle = swStyle.addClass(cls.mb_24)
  def mb_32: SwStyle = swStyle.addClass(cls.mb_32)
  def mb_40: SwStyle = swStyle.addClass(cls.mb_40)
  def mb_48: SwStyle = swStyle.addClass(cls.mb_48)
  def mb_auto: SwStyle = swStyle.addClass(cls.mb_auto)
  def _mb_0: SwStyle = swStyle.addClass(cls._mb_0)
  def _mb_2: SwStyle = swStyle.addClass(cls._mb_2)
  def _mb_4: SwStyle = swStyle.addClass(cls._mb_4)
  def _mb_6: SwStyle = swStyle.addClass(cls._mb_6)
  def _mb_8: SwStyle = swStyle.addClass(cls._mb_8)
  def _mb_12: SwStyle = swStyle.addClass(cls._mb_12)
  def _mb_16: SwStyle = swStyle.addClass(cls._mb_16)
  def _mb_20: SwStyle = swStyle.addClass(cls._mb_20)
  def _mb_24: SwStyle = swStyle.addClass(cls._mb_24)
  def _mb_32: SwStyle = swStyle.addClass(cls._mb_32)
  def _mb_40: SwStyle = swStyle.addClass(cls._mb_40)
  def _mb_48: SwStyle = swStyle.addClass(cls._mb_48)
  def ml_0: SwStyle = swStyle.addClass(cls.ml_0)
  def ml_2: SwStyle = swStyle.addClass(cls.ml_2)
  def ml_4: SwStyle = swStyle.addClass(cls.ml_4)
  def ml_6: SwStyle = swStyle.addClass(cls.ml_6)
  def ml_8: SwStyle = swStyle.addClass(cls.ml_8)
  def ml_12: SwStyle = swStyle.addClass(cls.ml_12)
  def ml_16: SwStyle = swStyle.addClass(cls.ml_16)
  def ml_20: SwStyle = swStyle.addClass(cls.ml_20)
  def ml_24: SwStyle = swStyle.addClass(cls.ml_24)
  def ml_32: SwStyle = swStyle.addClass(cls.ml_32)
  def ml_40: SwStyle = swStyle.addClass(cls.ml_40)
  def ml_48: SwStyle = swStyle.addClass(cls.ml_48)
  def ml_auto: SwStyle = swStyle.addClass(cls.ml_auto)
  def _ml_0: SwStyle = swStyle.addClass(cls._ml_0)
  def _ml_2: SwStyle = swStyle.addClass(cls._ml_2)
  def _ml_4: SwStyle = swStyle.addClass(cls._ml_4)
  def _ml_6: SwStyle = swStyle.addClass(cls._ml_6)
  def _ml_8: SwStyle = swStyle.addClass(cls._ml_8)
  def _ml_12: SwStyle = swStyle.addClass(cls._ml_12)
  def _ml_16: SwStyle = swStyle.addClass(cls._ml_16)
  def _ml_20: SwStyle = swStyle.addClass(cls._ml_20)
  def _ml_24: SwStyle = swStyle.addClass(cls._ml_24)
  def _ml_32: SwStyle = swStyle.addClass(cls._ml_32)
  def _ml_40: SwStyle = swStyle.addClass(cls._ml_40)
  def _ml_48: SwStyle = swStyle.addClass(cls._ml_48)
  def box_border: SwStyle = swStyle.addClass(cls.box_border)
  def box_content: SwStyle = swStyle.addClass(cls.box_content)
  def line_clamp_1: SwStyle = swStyle.addClass(cls.line_clamp_1)
  def line_clamp_2: SwStyle = swStyle.addClass(cls.line_clamp_2)
  def line_clamp_3: SwStyle = swStyle.addClass(cls.line_clamp_3)
  def line_clamp_4: SwStyle = swStyle.addClass(cls.line_clamp_4)
  def line_clamp_5: SwStyle = swStyle.addClass(cls.line_clamp_5)
  def line_clamp_6: SwStyle = swStyle.addClass(cls.line_clamp_6)
  def line_clamp_none: SwStyle = swStyle.addClass(cls.line_clamp_none)
  def block: SwStyle = swStyle.addClass(cls.block)
  def inline_block: SwStyle = swStyle.addClass(cls.inline_block)
  def inline: SwStyle = swStyle.addClass(cls.inline)
  def flex: SwStyle = swStyle.addClass(cls.flex)
  def inline_flex: SwStyle = swStyle.addClass(cls.inline_flex)
  def table: SwStyle = swStyle.addClass(cls.table)
  def inline_table: SwStyle = swStyle.addClass(cls.inline_table)
  def table_caption: SwStyle = swStyle.addClass(cls.table_caption)
  def table_cell: SwStyle = swStyle.addClass(cls.table_cell)
  def table_column: SwStyle = swStyle.addClass(cls.table_column)
  def table_column_group: SwStyle = swStyle.addClass(cls.table_column_group)
  def table_footer_group: SwStyle = swStyle.addClass(cls.table_footer_group)
  def table_header_group: SwStyle = swStyle.addClass(cls.table_header_group)
  def table_row_group: SwStyle = swStyle.addClass(cls.table_row_group)
  def table_row: SwStyle = swStyle.addClass(cls.table_row)
  def flow_root: SwStyle = swStyle.addClass(cls.flow_root)
  def grid: SwStyle = swStyle.addClass(cls.grid)
  def inline_grid: SwStyle = swStyle.addClass(cls.inline_grid)
  def contents: SwStyle = swStyle.addClass(cls.contents)
  def list_item: SwStyle = swStyle.addClass(cls.list_item)
  def hidden: SwStyle = swStyle.addClass(cls.hidden)
  def aspect_auto: SwStyle = swStyle.addClass(cls.aspect_auto)
  def aspect_square: SwStyle = swStyle.addClass(cls.aspect_square)
  def aspect_video: SwStyle = swStyle.addClass(cls.aspect_video)
  def size_0: SwStyle = swStyle.addClass(cls.size_0)
  def size_2: SwStyle = swStyle.addClass(cls.size_2)
  def size_4: SwStyle = swStyle.addClass(cls.size_4)
  def size_6: SwStyle = swStyle.addClass(cls.size_6)
  def size_8: SwStyle = swStyle.addClass(cls.size_8)
  def size_12: SwStyle = swStyle.addClass(cls.size_12)
  def size_16: SwStyle = swStyle.addClass(cls.size_16)
  def size_20: SwStyle = swStyle.addClass(cls.size_20)
  def size_24: SwStyle = swStyle.addClass(cls.size_24)
  def size_32: SwStyle = swStyle.addClass(cls.size_32)
  def size_40: SwStyle = swStyle.addClass(cls.size_40)
  def size_48: SwStyle = swStyle.addClass(cls.size_48)
  def size_auto: SwStyle = swStyle.addClass(cls.size_auto)
  def size_full: SwStyle = swStyle.addClass(cls.size_full)
  def size_min: SwStyle = swStyle.addClass(cls.size_min)
  def size_max: SwStyle = swStyle.addClass(cls.size_max)
  def size_fit: SwStyle = swStyle.addClass(cls.size_fit)
  def h_px1: SwStyle = swStyle.addClass(cls.h_px1)
  def h_px8: SwStyle = swStyle.addClass(cls.h_px8)
  def h_px16: SwStyle = swStyle.addClass(cls.h_px16)
  def h_px20: SwStyle = swStyle.addClass(cls.h_px20)
  def h_px24: SwStyle = swStyle.addClass(cls.h_px24)
  def h_px32: SwStyle = swStyle.addClass(cls.h_px32)
  def h_px40: SwStyle = swStyle.addClass(cls.h_px40)
  def h_px48: SwStyle = swStyle.addClass(cls.h_px48)
  def h_px64: SwStyle = swStyle.addClass(cls.h_px64)
  def h_px128: SwStyle = swStyle.addClass(cls.h_px128)
  def h_px256: SwStyle = swStyle.addClass(cls.h_px256)
  def h_pc100: SwStyle = swStyle.addClass(cls.h_pc100)
  def h_vh100: SwStyle = swStyle.addClass(cls.h_vh100)
  def h_auto: SwStyle = swStyle.addClass(cls.h_auto)
  def h_min: SwStyle = swStyle.addClass(cls.h_min)
  def h_max: SwStyle = swStyle.addClass(cls.h_max)
  def h_custom_1: SwStyle = swStyle.addClass(cls.h_custom_1)
  def h_custom_2: SwStyle = swStyle.addClass(cls.h_custom_2)
  def h_custom_3: SwStyle = swStyle.addClass(cls.h_custom_3)
  def min_h_pc100: SwStyle = swStyle.addClass(cls.min_h_pc100)
  def min_h_vh100: SwStyle = swStyle.addClass(cls.min_h_vh100)
  def w_px1: SwStyle = swStyle.addClass(cls.w_px1)
  def w_px8: SwStyle = swStyle.addClass(cls.w_px8)
  def w_px16: SwStyle = swStyle.addClass(cls.w_px16)
  def w_px20: SwStyle = swStyle.addClass(cls.w_px20)
  def w_px24: SwStyle = swStyle.addClass(cls.w_px24)
  def w_px32: SwStyle = swStyle.addClass(cls.w_px32)
  def w_px40: SwStyle = swStyle.addClass(cls.w_px40)
  def w_px48: SwStyle = swStyle.addClass(cls.w_px48)
  def w_px64: SwStyle = swStyle.addClass(cls.w_px64)
  def w_px128: SwStyle = swStyle.addClass(cls.w_px128)
  def w_px256: SwStyle = swStyle.addClass(cls.w_px256)
  def w_px480: SwStyle = swStyle.addClass(cls.w_px480)
  def w_px512: SwStyle = swStyle.addClass(cls.w_px512)
  def w_px640: SwStyle = swStyle.addClass(cls.w_px640)
  def w_px768: SwStyle = swStyle.addClass(cls.w_px768)
  def w_px1024: SwStyle = swStyle.addClass(cls.w_px1024)
  def w_px1536: SwStyle = swStyle.addClass(cls.w_px1536)
  def w_pc10: SwStyle = swStyle.addClass(cls.w_pc10)
  def w_pc20: SwStyle = swStyle.addClass(cls.w_pc20)
  def w_pc25: SwStyle = swStyle.addClass(cls.w_pc25)
  def w_pc30: SwStyle = swStyle.addClass(cls.w_pc30)
  def w_pc33: SwStyle = swStyle.addClass(cls.w_pc33)
  def w_pc40: SwStyle = swStyle.addClass(cls.w_pc40)
  def w_pc50: SwStyle = swStyle.addClass(cls.w_pc50)
  def w_pc60: SwStyle = swStyle.addClass(cls.w_pc60)
  def w_pc66: SwStyle = swStyle.addClass(cls.w_pc66)
  def w_pc70: SwStyle = swStyle.addClass(cls.w_pc70)
  def w_pc75: SwStyle = swStyle.addClass(cls.w_pc75)
  def w_pc80: SwStyle = swStyle.addClass(cls.w_pc80)
  def w_pc90: SwStyle = swStyle.addClass(cls.w_pc90)
  def w_pc100: SwStyle = swStyle.addClass(cls.w_pc100)
  def w_auto: SwStyle = swStyle.addClass(cls.w_auto)
  def w_min: SwStyle = swStyle.addClass(cls.w_min)
  def w_max: SwStyle = swStyle.addClass(cls.w_max)
  def w_fit: SwStyle = swStyle.addClass(cls.w_fit)
  def w_custom_1: SwStyle = swStyle.addClass(cls.w_custom_1)
  def w_custom_2: SwStyle = swStyle.addClass(cls.w_custom_2)
  def w_custom_3: SwStyle = swStyle.addClass(cls.w_custom_3)
  def min_w_fit: SwStyle = swStyle.addClass(cls.min_w_fit)
  def min_w_min: SwStyle = swStyle.addClass(cls.min_w_min)
  def min_w_max: SwStyle = swStyle.addClass(cls.min_w_max)
  def max_w_px128: SwStyle = swStyle.addClass(cls.max_w_px128)
  def max_w_px256: SwStyle = swStyle.addClass(cls.max_w_px256)
  def max_w_px480: SwStyle = swStyle.addClass(cls.max_w_px480)
  def max_w_px512: SwStyle = swStyle.addClass(cls.max_w_px512)
  def max_w_px640: SwStyle = swStyle.addClass(cls.max_w_px640)
  def max_w_px768: SwStyle = swStyle.addClass(cls.max_w_px768)
  def max_w_px1024: SwStyle = swStyle.addClass(cls.max_w_px1024)
  def max_w_pc100: SwStyle = swStyle.addClass(cls.max_w_pc100)
  def max_w_custom_1: SwStyle = swStyle.addClass(cls.max_w_custom_1)
  def max_w_custom_2: SwStyle = swStyle.addClass(cls.max_w_custom_2)
  def max_w_custom_3: SwStyle = swStyle.addClass(cls.max_w_custom_3)
  def flex_1: SwStyle = swStyle.addClass(cls.flex_1)
  def flex_auto: SwStyle = swStyle.addClass(cls.flex_auto)
  def flex_initial: SwStyle = swStyle.addClass(cls.flex_initial)
  def flex_none: SwStyle = swStyle.addClass(cls.flex_none)
  def flex_shrink_0: SwStyle = swStyle.addClass(cls.flex_shrink_0)
  def flex_shrink: SwStyle = swStyle.addClass(cls.flex_shrink)
  def shrink_0: SwStyle = swStyle.addClass(cls.shrink_0)
  def shrink: SwStyle = swStyle.addClass(cls.shrink)
  def flex_grow_0: SwStyle = swStyle.addClass(cls.flex_grow_0)
  def flex_grow: SwStyle = swStyle.addClass(cls.flex_grow)
  def grow_0: SwStyle = swStyle.addClass(cls.grow_0)
  def grow: SwStyle = swStyle.addClass(cls.grow)
  def basis_0: SwStyle = swStyle.addClass(cls.basis_0)
  def basis_2: SwStyle = swStyle.addClass(cls.basis_2)
  def basis_4: SwStyle = swStyle.addClass(cls.basis_4)
  def basis_6: SwStyle = swStyle.addClass(cls.basis_6)
  def basis_8: SwStyle = swStyle.addClass(cls.basis_8)
  def basis_12: SwStyle = swStyle.addClass(cls.basis_12)
  def basis_16: SwStyle = swStyle.addClass(cls.basis_16)
  def basis_20: SwStyle = swStyle.addClass(cls.basis_20)
  def basis_24: SwStyle = swStyle.addClass(cls.basis_24)
  def basis_32: SwStyle = swStyle.addClass(cls.basis_32)
  def basis_40: SwStyle = swStyle.addClass(cls.basis_40)
  def basis_48: SwStyle = swStyle.addClass(cls.basis_48)
  def basis_auto: SwStyle = swStyle.addClass(cls.basis_auto)
  def basis_full: SwStyle = swStyle.addClass(cls.basis_full)
  def caption_top: SwStyle = swStyle.addClass(cls.caption_top)
  def caption_bottom: SwStyle = swStyle.addClass(cls.caption_bottom)
  def border_spacing_0: SwStyle = swStyle.addClass(cls.border_spacing_0)
  def border_spacing_2: SwStyle = swStyle.addClass(cls.border_spacing_2)
  def border_spacing_4: SwStyle = swStyle.addClass(cls.border_spacing_4)
  def border_spacing_6: SwStyle = swStyle.addClass(cls.border_spacing_6)
  def border_spacing_8: SwStyle = swStyle.addClass(cls.border_spacing_8)
  def border_spacing_12: SwStyle = swStyle.addClass(cls.border_spacing_12)
  def border_spacing_16: SwStyle = swStyle.addClass(cls.border_spacing_16)
  def border_spacing_20: SwStyle = swStyle.addClass(cls.border_spacing_20)
  def border_spacing_24: SwStyle = swStyle.addClass(cls.border_spacing_24)
  def border_spacing_32: SwStyle = swStyle.addClass(cls.border_spacing_32)
  def border_spacing_40: SwStyle = swStyle.addClass(cls.border_spacing_40)
  def border_spacing_48: SwStyle = swStyle.addClass(cls.border_spacing_48)
  def border_spacing_x_0: SwStyle = swStyle.addClass(cls.border_spacing_x_0)
  def border_spacing_x_2: SwStyle = swStyle.addClass(cls.border_spacing_x_2)
  def border_spacing_x_4: SwStyle = swStyle.addClass(cls.border_spacing_x_4)
  def border_spacing_x_6: SwStyle = swStyle.addClass(cls.border_spacing_x_6)
  def border_spacing_x_8: SwStyle = swStyle.addClass(cls.border_spacing_x_8)
  def border_spacing_x_12: SwStyle = swStyle.addClass(cls.border_spacing_x_12)
  def border_spacing_x_16: SwStyle = swStyle.addClass(cls.border_spacing_x_16)
  def border_spacing_x_20: SwStyle = swStyle.addClass(cls.border_spacing_x_20)
  def border_spacing_x_24: SwStyle = swStyle.addClass(cls.border_spacing_x_24)
  def border_spacing_x_32: SwStyle = swStyle.addClass(cls.border_spacing_x_32)
  def border_spacing_x_40: SwStyle = swStyle.addClass(cls.border_spacing_x_40)
  def border_spacing_x_48: SwStyle = swStyle.addClass(cls.border_spacing_x_48)
  def border_spacing_y_0: SwStyle = swStyle.addClass(cls.border_spacing_y_0)
  def border_spacing_y_2: SwStyle = swStyle.addClass(cls.border_spacing_y_2)
  def border_spacing_y_4: SwStyle = swStyle.addClass(cls.border_spacing_y_4)
  def border_spacing_y_6: SwStyle = swStyle.addClass(cls.border_spacing_y_6)
  def border_spacing_y_8: SwStyle = swStyle.addClass(cls.border_spacing_y_8)
  def border_spacing_y_12: SwStyle = swStyle.addClass(cls.border_spacing_y_12)
  def border_spacing_y_16: SwStyle = swStyle.addClass(cls.border_spacing_y_16)
  def border_spacing_y_20: SwStyle = swStyle.addClass(cls.border_spacing_y_20)
  def border_spacing_y_24: SwStyle = swStyle.addClass(cls.border_spacing_y_24)
  def border_spacing_y_32: SwStyle = swStyle.addClass(cls.border_spacing_y_32)
  def border_spacing_y_40: SwStyle = swStyle.addClass(cls.border_spacing_y_40)
  def border_spacing_y_48: SwStyle = swStyle.addClass(cls.border_spacing_y_48)
  def cursor_auto: SwStyle = swStyle.addClass(cls.cursor_auto)
  def cursor_default: SwStyle = swStyle.addClass(cls.cursor_default)
  def cursor_pointer: SwStyle = swStyle.addClass(cls.cursor_pointer)
  def cursor_wait: SwStyle = swStyle.addClass(cls.cursor_wait)
  def cursor_text: SwStyle = swStyle.addClass(cls.cursor_text)
  def cursor_move: SwStyle = swStyle.addClass(cls.cursor_move)
  def cursor_help: SwStyle = swStyle.addClass(cls.cursor_help)
  def cursor_not_allowed: SwStyle = swStyle.addClass(cls.cursor_not_allowed)
  def cursor_none: SwStyle = swStyle.addClass(cls.cursor_none)
  def cursor_context_menu: SwStyle = swStyle.addClass(cls.cursor_context_menu)
  def cursor_progress: SwStyle = swStyle.addClass(cls.cursor_progress)
  def cursor_cell: SwStyle = swStyle.addClass(cls.cursor_cell)
  def cursor_crosshair: SwStyle = swStyle.addClass(cls.cursor_crosshair)
  def cursor_vertical_text: SwStyle = swStyle.addClass(cls.cursor_vertical_text)
  def cursor_alias: SwStyle = swStyle.addClass(cls.cursor_alias)
  def cursor_copy: SwStyle = swStyle.addClass(cls.cursor_copy)
  def cursor_no_drop: SwStyle = swStyle.addClass(cls.cursor_no_drop)
  def cursor_grab: SwStyle = swStyle.addClass(cls.cursor_grab)
  def cursor_grabbing: SwStyle = swStyle.addClass(cls.cursor_grabbing)
  def cursor_all_scroll: SwStyle = swStyle.addClass(cls.cursor_all_scroll)
  def cursor_col_resize: SwStyle = swStyle.addClass(cls.cursor_col_resize)
  def cursor_row_resize: SwStyle = swStyle.addClass(cls.cursor_row_resize)
  def cursor_n_resize: SwStyle = swStyle.addClass(cls.cursor_n_resize)
  def cursor_e_resize: SwStyle = swStyle.addClass(cls.cursor_e_resize)
  def cursor_s_resize: SwStyle = swStyle.addClass(cls.cursor_s_resize)
  def cursor_w_resize: SwStyle = swStyle.addClass(cls.cursor_w_resize)
  def cursor_ne_resize: SwStyle = swStyle.addClass(cls.cursor_ne_resize)
  def cursor_nw_resize: SwStyle = swStyle.addClass(cls.cursor_nw_resize)
  def cursor_se_resize: SwStyle = swStyle.addClass(cls.cursor_se_resize)
  def cursor_sw_resize: SwStyle = swStyle.addClass(cls.cursor_sw_resize)
  def cursor_ew_resize: SwStyle = swStyle.addClass(cls.cursor_ew_resize)
  def cursor_ns_resize: SwStyle = swStyle.addClass(cls.cursor_ns_resize)
  def cursor_nesw_resize: SwStyle = swStyle.addClass(cls.cursor_nesw_resize)
  def cursor_nwse_resize: SwStyle = swStyle.addClass(cls.cursor_nwse_resize)
  def cursor_zoom_in: SwStyle = swStyle.addClass(cls.cursor_zoom_in)
  def cursor_zoom_out: SwStyle = swStyle.addClass(cls.cursor_zoom_out)
  def touch_auto: SwStyle = swStyle.addClass(cls.touch_auto)
  def touch_none: SwStyle = swStyle.addClass(cls.touch_none)
  def touch_pan_x: SwStyle = swStyle.addClass(cls.touch_pan_x)
  def touch_pan_left: SwStyle = swStyle.addClass(cls.touch_pan_left)
  def touch_pan_right: SwStyle = swStyle.addClass(cls.touch_pan_right)
  def touch_pan_y: SwStyle = swStyle.addClass(cls.touch_pan_y)
  def touch_pan_up: SwStyle = swStyle.addClass(cls.touch_pan_up)
  def touch_pan_down: SwStyle = swStyle.addClass(cls.touch_pan_down)
  def touch_pinch_zoom: SwStyle = swStyle.addClass(cls.touch_pinch_zoom)
  def touch_manipulation: SwStyle = swStyle.addClass(cls.touch_manipulation)
  def select_none: SwStyle = swStyle.addClass(cls.select_none)
  def select_text: SwStyle = swStyle.addClass(cls.select_text)
  def select_all: SwStyle = swStyle.addClass(cls.select_all)
  def select_auto: SwStyle = swStyle.addClass(cls.select_auto)
  def resize_none: SwStyle = swStyle.addClass(cls.resize_none)
  def resize_y: SwStyle = swStyle.addClass(cls.resize_y)
  def resize_x: SwStyle = swStyle.addClass(cls.resize_x)
  def resize: SwStyle = swStyle.addClass(cls.resize)
  def snap_none: SwStyle = swStyle.addClass(cls.snap_none)
  def snap_x: SwStyle = swStyle.addClass(cls.snap_x)
  def snap_y: SwStyle = swStyle.addClass(cls.snap_y)
  def snap_both: SwStyle = swStyle.addClass(cls.snap_both)
  def snap_mandatory: SwStyle = swStyle.addClass(cls.snap_mandatory)
  def snap_proximity: SwStyle = swStyle.addClass(cls.snap_proximity)
  def snap_start: SwStyle = swStyle.addClass(cls.snap_start)
  def snap_end: SwStyle = swStyle.addClass(cls.snap_end)
  def snap_center: SwStyle = swStyle.addClass(cls.snap_center)
  def snap_align_none: SwStyle = swStyle.addClass(cls.snap_align_none)
  def snap_normal: SwStyle = swStyle.addClass(cls.snap_normal)
  def snap_always: SwStyle = swStyle.addClass(cls.snap_always)
  def scroll_m_0: SwStyle = swStyle.addClass(cls.scroll_m_0)
  def scroll_m_2: SwStyle = swStyle.addClass(cls.scroll_m_2)
  def scroll_m_4: SwStyle = swStyle.addClass(cls.scroll_m_4)
  def scroll_m_6: SwStyle = swStyle.addClass(cls.scroll_m_6)
  def scroll_m_8: SwStyle = swStyle.addClass(cls.scroll_m_8)
  def scroll_m_12: SwStyle = swStyle.addClass(cls.scroll_m_12)
  def scroll_m_16: SwStyle = swStyle.addClass(cls.scroll_m_16)
  def scroll_m_20: SwStyle = swStyle.addClass(cls.scroll_m_20)
  def scroll_m_24: SwStyle = swStyle.addClass(cls.scroll_m_24)
  def scroll_m_32: SwStyle = swStyle.addClass(cls.scroll_m_32)
  def scroll_m_40: SwStyle = swStyle.addClass(cls.scroll_m_40)
  def scroll_m_48: SwStyle = swStyle.addClass(cls.scroll_m_48)
  def _scroll_m_0: SwStyle = swStyle.addClass(cls._scroll_m_0)
  def _scroll_m_2: SwStyle = swStyle.addClass(cls._scroll_m_2)
  def _scroll_m_4: SwStyle = swStyle.addClass(cls._scroll_m_4)
  def _scroll_m_6: SwStyle = swStyle.addClass(cls._scroll_m_6)
  def _scroll_m_8: SwStyle = swStyle.addClass(cls._scroll_m_8)
  def _scroll_m_12: SwStyle = swStyle.addClass(cls._scroll_m_12)
  def _scroll_m_16: SwStyle = swStyle.addClass(cls._scroll_m_16)
  def _scroll_m_20: SwStyle = swStyle.addClass(cls._scroll_m_20)
  def _scroll_m_24: SwStyle = swStyle.addClass(cls._scroll_m_24)
  def _scroll_m_32: SwStyle = swStyle.addClass(cls._scroll_m_32)
  def _scroll_m_40: SwStyle = swStyle.addClass(cls._scroll_m_40)
  def _scroll_m_48: SwStyle = swStyle.addClass(cls._scroll_m_48)
  def scroll_mx_0: SwStyle = swStyle.addClass(cls.scroll_mx_0)
  def scroll_mx_2: SwStyle = swStyle.addClass(cls.scroll_mx_2)
  def scroll_mx_4: SwStyle = swStyle.addClass(cls.scroll_mx_4)
  def scroll_mx_6: SwStyle = swStyle.addClass(cls.scroll_mx_6)
  def scroll_mx_8: SwStyle = swStyle.addClass(cls.scroll_mx_8)
  def scroll_mx_12: SwStyle = swStyle.addClass(cls.scroll_mx_12)
  def scroll_mx_16: SwStyle = swStyle.addClass(cls.scroll_mx_16)
  def scroll_mx_20: SwStyle = swStyle.addClass(cls.scroll_mx_20)
  def scroll_mx_24: SwStyle = swStyle.addClass(cls.scroll_mx_24)
  def scroll_mx_32: SwStyle = swStyle.addClass(cls.scroll_mx_32)
  def scroll_mx_40: SwStyle = swStyle.addClass(cls.scroll_mx_40)
  def scroll_mx_48: SwStyle = swStyle.addClass(cls.scroll_mx_48)
  def _scroll_mx_0: SwStyle = swStyle.addClass(cls._scroll_mx_0)
  def _scroll_mx_2: SwStyle = swStyle.addClass(cls._scroll_mx_2)
  def _scroll_mx_4: SwStyle = swStyle.addClass(cls._scroll_mx_4)
  def _scroll_mx_6: SwStyle = swStyle.addClass(cls._scroll_mx_6)
  def _scroll_mx_8: SwStyle = swStyle.addClass(cls._scroll_mx_8)
  def _scroll_mx_12: SwStyle = swStyle.addClass(cls._scroll_mx_12)
  def _scroll_mx_16: SwStyle = swStyle.addClass(cls._scroll_mx_16)
  def _scroll_mx_20: SwStyle = swStyle.addClass(cls._scroll_mx_20)
  def _scroll_mx_24: SwStyle = swStyle.addClass(cls._scroll_mx_24)
  def _scroll_mx_32: SwStyle = swStyle.addClass(cls._scroll_mx_32)
  def _scroll_mx_40: SwStyle = swStyle.addClass(cls._scroll_mx_40)
  def _scroll_mx_48: SwStyle = swStyle.addClass(cls._scroll_mx_48)
  def scroll_my_0: SwStyle = swStyle.addClass(cls.scroll_my_0)
  def scroll_my_2: SwStyle = swStyle.addClass(cls.scroll_my_2)
  def scroll_my_4: SwStyle = swStyle.addClass(cls.scroll_my_4)
  def scroll_my_6: SwStyle = swStyle.addClass(cls.scroll_my_6)
  def scroll_my_8: SwStyle = swStyle.addClass(cls.scroll_my_8)
  def scroll_my_12: SwStyle = swStyle.addClass(cls.scroll_my_12)
  def scroll_my_16: SwStyle = swStyle.addClass(cls.scroll_my_16)
  def scroll_my_20: SwStyle = swStyle.addClass(cls.scroll_my_20)
  def scroll_my_24: SwStyle = swStyle.addClass(cls.scroll_my_24)
  def scroll_my_32: SwStyle = swStyle.addClass(cls.scroll_my_32)
  def scroll_my_40: SwStyle = swStyle.addClass(cls.scroll_my_40)
  def scroll_my_48: SwStyle = swStyle.addClass(cls.scroll_my_48)
  def _scroll_my_0: SwStyle = swStyle.addClass(cls._scroll_my_0)
  def _scroll_my_2: SwStyle = swStyle.addClass(cls._scroll_my_2)
  def _scroll_my_4: SwStyle = swStyle.addClass(cls._scroll_my_4)
  def _scroll_my_6: SwStyle = swStyle.addClass(cls._scroll_my_6)
  def _scroll_my_8: SwStyle = swStyle.addClass(cls._scroll_my_8)
  def _scroll_my_12: SwStyle = swStyle.addClass(cls._scroll_my_12)
  def _scroll_my_16: SwStyle = swStyle.addClass(cls._scroll_my_16)
  def _scroll_my_20: SwStyle = swStyle.addClass(cls._scroll_my_20)
  def _scroll_my_24: SwStyle = swStyle.addClass(cls._scroll_my_24)
  def _scroll_my_32: SwStyle = swStyle.addClass(cls._scroll_my_32)
  def _scroll_my_40: SwStyle = swStyle.addClass(cls._scroll_my_40)
  def _scroll_my_48: SwStyle = swStyle.addClass(cls._scroll_my_48)
  def scroll_ms_0: SwStyle = swStyle.addClass(cls.scroll_ms_0)
  def scroll_ms_2: SwStyle = swStyle.addClass(cls.scroll_ms_2)
  def scroll_ms_4: SwStyle = swStyle.addClass(cls.scroll_ms_4)
  def scroll_ms_6: SwStyle = swStyle.addClass(cls.scroll_ms_6)
  def scroll_ms_8: SwStyle = swStyle.addClass(cls.scroll_ms_8)
  def scroll_ms_12: SwStyle = swStyle.addClass(cls.scroll_ms_12)
  def scroll_ms_16: SwStyle = swStyle.addClass(cls.scroll_ms_16)
  def scroll_ms_20: SwStyle = swStyle.addClass(cls.scroll_ms_20)
  def scroll_ms_24: SwStyle = swStyle.addClass(cls.scroll_ms_24)
  def scroll_ms_32: SwStyle = swStyle.addClass(cls.scroll_ms_32)
  def scroll_ms_40: SwStyle = swStyle.addClass(cls.scroll_ms_40)
  def scroll_ms_48: SwStyle = swStyle.addClass(cls.scroll_ms_48)
  def _scroll_ms_0: SwStyle = swStyle.addClass(cls._scroll_ms_0)
  def _scroll_ms_2: SwStyle = swStyle.addClass(cls._scroll_ms_2)
  def _scroll_ms_4: SwStyle = swStyle.addClass(cls._scroll_ms_4)
  def _scroll_ms_6: SwStyle = swStyle.addClass(cls._scroll_ms_6)
  def _scroll_ms_8: SwStyle = swStyle.addClass(cls._scroll_ms_8)
  def _scroll_ms_12: SwStyle = swStyle.addClass(cls._scroll_ms_12)
  def _scroll_ms_16: SwStyle = swStyle.addClass(cls._scroll_ms_16)
  def _scroll_ms_20: SwStyle = swStyle.addClass(cls._scroll_ms_20)
  def _scroll_ms_24: SwStyle = swStyle.addClass(cls._scroll_ms_24)
  def _scroll_ms_32: SwStyle = swStyle.addClass(cls._scroll_ms_32)
  def _scroll_ms_40: SwStyle = swStyle.addClass(cls._scroll_ms_40)
  def _scroll_ms_48: SwStyle = swStyle.addClass(cls._scroll_ms_48)
  def scroll_me_0: SwStyle = swStyle.addClass(cls.scroll_me_0)
  def scroll_me_2: SwStyle = swStyle.addClass(cls.scroll_me_2)
  def scroll_me_4: SwStyle = swStyle.addClass(cls.scroll_me_4)
  def scroll_me_6: SwStyle = swStyle.addClass(cls.scroll_me_6)
  def scroll_me_8: SwStyle = swStyle.addClass(cls.scroll_me_8)
  def scroll_me_12: SwStyle = swStyle.addClass(cls.scroll_me_12)
  def scroll_me_16: SwStyle = swStyle.addClass(cls.scroll_me_16)
  def scroll_me_20: SwStyle = swStyle.addClass(cls.scroll_me_20)
  def scroll_me_24: SwStyle = swStyle.addClass(cls.scroll_me_24)
  def scroll_me_32: SwStyle = swStyle.addClass(cls.scroll_me_32)
  def scroll_me_40: SwStyle = swStyle.addClass(cls.scroll_me_40)
  def scroll_me_48: SwStyle = swStyle.addClass(cls.scroll_me_48)
  def _scroll_me_0: SwStyle = swStyle.addClass(cls._scroll_me_0)
  def _scroll_me_2: SwStyle = swStyle.addClass(cls._scroll_me_2)
  def _scroll_me_4: SwStyle = swStyle.addClass(cls._scroll_me_4)
  def _scroll_me_6: SwStyle = swStyle.addClass(cls._scroll_me_6)
  def _scroll_me_8: SwStyle = swStyle.addClass(cls._scroll_me_8)
  def _scroll_me_12: SwStyle = swStyle.addClass(cls._scroll_me_12)
  def _scroll_me_16: SwStyle = swStyle.addClass(cls._scroll_me_16)
  def _scroll_me_20: SwStyle = swStyle.addClass(cls._scroll_me_20)
  def _scroll_me_24: SwStyle = swStyle.addClass(cls._scroll_me_24)
  def _scroll_me_32: SwStyle = swStyle.addClass(cls._scroll_me_32)
  def _scroll_me_40: SwStyle = swStyle.addClass(cls._scroll_me_40)
  def _scroll_me_48: SwStyle = swStyle.addClass(cls._scroll_me_48)
  def scroll_mt_0: SwStyle = swStyle.addClass(cls.scroll_mt_0)
  def scroll_mt_2: SwStyle = swStyle.addClass(cls.scroll_mt_2)
  def scroll_mt_4: SwStyle = swStyle.addClass(cls.scroll_mt_4)
  def scroll_mt_6: SwStyle = swStyle.addClass(cls.scroll_mt_6)
  def scroll_mt_8: SwStyle = swStyle.addClass(cls.scroll_mt_8)
  def scroll_mt_12: SwStyle = swStyle.addClass(cls.scroll_mt_12)
  def scroll_mt_16: SwStyle = swStyle.addClass(cls.scroll_mt_16)
  def scroll_mt_20: SwStyle = swStyle.addClass(cls.scroll_mt_20)
  def scroll_mt_24: SwStyle = swStyle.addClass(cls.scroll_mt_24)
  def scroll_mt_32: SwStyle = swStyle.addClass(cls.scroll_mt_32)
  def scroll_mt_40: SwStyle = swStyle.addClass(cls.scroll_mt_40)
  def scroll_mt_48: SwStyle = swStyle.addClass(cls.scroll_mt_48)
  def _scroll_mt_0: SwStyle = swStyle.addClass(cls._scroll_mt_0)
  def _scroll_mt_2: SwStyle = swStyle.addClass(cls._scroll_mt_2)
  def _scroll_mt_4: SwStyle = swStyle.addClass(cls._scroll_mt_4)
  def _scroll_mt_6: SwStyle = swStyle.addClass(cls._scroll_mt_6)
  def _scroll_mt_8: SwStyle = swStyle.addClass(cls._scroll_mt_8)
  def _scroll_mt_12: SwStyle = swStyle.addClass(cls._scroll_mt_12)
  def _scroll_mt_16: SwStyle = swStyle.addClass(cls._scroll_mt_16)
  def _scroll_mt_20: SwStyle = swStyle.addClass(cls._scroll_mt_20)
  def _scroll_mt_24: SwStyle = swStyle.addClass(cls._scroll_mt_24)
  def _scroll_mt_32: SwStyle = swStyle.addClass(cls._scroll_mt_32)
  def _scroll_mt_40: SwStyle = swStyle.addClass(cls._scroll_mt_40)
  def _scroll_mt_48: SwStyle = swStyle.addClass(cls._scroll_mt_48)
  def scroll_mr_0: SwStyle = swStyle.addClass(cls.scroll_mr_0)
  def scroll_mr_2: SwStyle = swStyle.addClass(cls.scroll_mr_2)
  def scroll_mr_4: SwStyle = swStyle.addClass(cls.scroll_mr_4)
  def scroll_mr_6: SwStyle = swStyle.addClass(cls.scroll_mr_6)
  def scroll_mr_8: SwStyle = swStyle.addClass(cls.scroll_mr_8)
  def scroll_mr_12: SwStyle = swStyle.addClass(cls.scroll_mr_12)
  def scroll_mr_16: SwStyle = swStyle.addClass(cls.scroll_mr_16)
  def scroll_mr_20: SwStyle = swStyle.addClass(cls.scroll_mr_20)
  def scroll_mr_24: SwStyle = swStyle.addClass(cls.scroll_mr_24)
  def scroll_mr_32: SwStyle = swStyle.addClass(cls.scroll_mr_32)
  def scroll_mr_40: SwStyle = swStyle.addClass(cls.scroll_mr_40)
  def scroll_mr_48: SwStyle = swStyle.addClass(cls.scroll_mr_48)
  def _scroll_mr_0: SwStyle = swStyle.addClass(cls._scroll_mr_0)
  def _scroll_mr_2: SwStyle = swStyle.addClass(cls._scroll_mr_2)
  def _scroll_mr_4: SwStyle = swStyle.addClass(cls._scroll_mr_4)
  def _scroll_mr_6: SwStyle = swStyle.addClass(cls._scroll_mr_6)
  def _scroll_mr_8: SwStyle = swStyle.addClass(cls._scroll_mr_8)
  def _scroll_mr_12: SwStyle = swStyle.addClass(cls._scroll_mr_12)
  def _scroll_mr_16: SwStyle = swStyle.addClass(cls._scroll_mr_16)
  def _scroll_mr_20: SwStyle = swStyle.addClass(cls._scroll_mr_20)
  def _scroll_mr_24: SwStyle = swStyle.addClass(cls._scroll_mr_24)
  def _scroll_mr_32: SwStyle = swStyle.addClass(cls._scroll_mr_32)
  def _scroll_mr_40: SwStyle = swStyle.addClass(cls._scroll_mr_40)
  def _scroll_mr_48: SwStyle = swStyle.addClass(cls._scroll_mr_48)
  def scroll_mb_0: SwStyle = swStyle.addClass(cls.scroll_mb_0)
  def scroll_mb_2: SwStyle = swStyle.addClass(cls.scroll_mb_2)
  def scroll_mb_4: SwStyle = swStyle.addClass(cls.scroll_mb_4)
  def scroll_mb_6: SwStyle = swStyle.addClass(cls.scroll_mb_6)
  def scroll_mb_8: SwStyle = swStyle.addClass(cls.scroll_mb_8)
  def scroll_mb_12: SwStyle = swStyle.addClass(cls.scroll_mb_12)
  def scroll_mb_16: SwStyle = swStyle.addClass(cls.scroll_mb_16)
  def scroll_mb_20: SwStyle = swStyle.addClass(cls.scroll_mb_20)
  def scroll_mb_24: SwStyle = swStyle.addClass(cls.scroll_mb_24)
  def scroll_mb_32: SwStyle = swStyle.addClass(cls.scroll_mb_32)
  def scroll_mb_40: SwStyle = swStyle.addClass(cls.scroll_mb_40)
  def scroll_mb_48: SwStyle = swStyle.addClass(cls.scroll_mb_48)
  def _scroll_mb_0: SwStyle = swStyle.addClass(cls._scroll_mb_0)
  def _scroll_mb_2: SwStyle = swStyle.addClass(cls._scroll_mb_2)
  def _scroll_mb_4: SwStyle = swStyle.addClass(cls._scroll_mb_4)
  def _scroll_mb_6: SwStyle = swStyle.addClass(cls._scroll_mb_6)
  def _scroll_mb_8: SwStyle = swStyle.addClass(cls._scroll_mb_8)
  def _scroll_mb_12: SwStyle = swStyle.addClass(cls._scroll_mb_12)
  def _scroll_mb_16: SwStyle = swStyle.addClass(cls._scroll_mb_16)
  def _scroll_mb_20: SwStyle = swStyle.addClass(cls._scroll_mb_20)
  def _scroll_mb_24: SwStyle = swStyle.addClass(cls._scroll_mb_24)
  def _scroll_mb_32: SwStyle = swStyle.addClass(cls._scroll_mb_32)
  def _scroll_mb_40: SwStyle = swStyle.addClass(cls._scroll_mb_40)
  def _scroll_mb_48: SwStyle = swStyle.addClass(cls._scroll_mb_48)
  def scroll_ml_0: SwStyle = swStyle.addClass(cls.scroll_ml_0)
  def scroll_ml_2: SwStyle = swStyle.addClass(cls.scroll_ml_2)
  def scroll_ml_4: SwStyle = swStyle.addClass(cls.scroll_ml_4)
  def scroll_ml_6: SwStyle = swStyle.addClass(cls.scroll_ml_6)
  def scroll_ml_8: SwStyle = swStyle.addClass(cls.scroll_ml_8)
  def scroll_ml_12: SwStyle = swStyle.addClass(cls.scroll_ml_12)
  def scroll_ml_16: SwStyle = swStyle.addClass(cls.scroll_ml_16)
  def scroll_ml_20: SwStyle = swStyle.addClass(cls.scroll_ml_20)
  def scroll_ml_24: SwStyle = swStyle.addClass(cls.scroll_ml_24)
  def scroll_ml_32: SwStyle = swStyle.addClass(cls.scroll_ml_32)
  def scroll_ml_40: SwStyle = swStyle.addClass(cls.scroll_ml_40)
  def scroll_ml_48: SwStyle = swStyle.addClass(cls.scroll_ml_48)
  def _scroll_ml_0: SwStyle = swStyle.addClass(cls._scroll_ml_0)
  def _scroll_ml_2: SwStyle = swStyle.addClass(cls._scroll_ml_2)
  def _scroll_ml_4: SwStyle = swStyle.addClass(cls._scroll_ml_4)
  def _scroll_ml_6: SwStyle = swStyle.addClass(cls._scroll_ml_6)
  def _scroll_ml_8: SwStyle = swStyle.addClass(cls._scroll_ml_8)
  def _scroll_ml_12: SwStyle = swStyle.addClass(cls._scroll_ml_12)
  def _scroll_ml_16: SwStyle = swStyle.addClass(cls._scroll_ml_16)
  def _scroll_ml_20: SwStyle = swStyle.addClass(cls._scroll_ml_20)
  def _scroll_ml_24: SwStyle = swStyle.addClass(cls._scroll_ml_24)
  def _scroll_ml_32: SwStyle = swStyle.addClass(cls._scroll_ml_32)
  def _scroll_ml_40: SwStyle = swStyle.addClass(cls._scroll_ml_40)
  def _scroll_ml_48: SwStyle = swStyle.addClass(cls._scroll_ml_48)
  def scroll_p_0: SwStyle = swStyle.addClass(cls.scroll_p_0)
  def scroll_p_2: SwStyle = swStyle.addClass(cls.scroll_p_2)
  def scroll_p_4: SwStyle = swStyle.addClass(cls.scroll_p_4)
  def scroll_p_6: SwStyle = swStyle.addClass(cls.scroll_p_6)
  def scroll_p_8: SwStyle = swStyle.addClass(cls.scroll_p_8)
  def scroll_p_12: SwStyle = swStyle.addClass(cls.scroll_p_12)
  def scroll_p_16: SwStyle = swStyle.addClass(cls.scroll_p_16)
  def scroll_p_20: SwStyle = swStyle.addClass(cls.scroll_p_20)
  def scroll_p_24: SwStyle = swStyle.addClass(cls.scroll_p_24)
  def scroll_p_32: SwStyle = swStyle.addClass(cls.scroll_p_32)
  def scroll_p_40: SwStyle = swStyle.addClass(cls.scroll_p_40)
  def scroll_p_48: SwStyle = swStyle.addClass(cls.scroll_p_48)
  def scroll_px_0: SwStyle = swStyle.addClass(cls.scroll_px_0)
  def scroll_px_2: SwStyle = swStyle.addClass(cls.scroll_px_2)
  def scroll_px_4: SwStyle = swStyle.addClass(cls.scroll_px_4)
  def scroll_px_6: SwStyle = swStyle.addClass(cls.scroll_px_6)
  def scroll_px_8: SwStyle = swStyle.addClass(cls.scroll_px_8)
  def scroll_px_12: SwStyle = swStyle.addClass(cls.scroll_px_12)
  def scroll_px_16: SwStyle = swStyle.addClass(cls.scroll_px_16)
  def scroll_px_20: SwStyle = swStyle.addClass(cls.scroll_px_20)
  def scroll_px_24: SwStyle = swStyle.addClass(cls.scroll_px_24)
  def scroll_px_32: SwStyle = swStyle.addClass(cls.scroll_px_32)
  def scroll_px_40: SwStyle = swStyle.addClass(cls.scroll_px_40)
  def scroll_px_48: SwStyle = swStyle.addClass(cls.scroll_px_48)
  def scroll_py_0: SwStyle = swStyle.addClass(cls.scroll_py_0)
  def scroll_py_2: SwStyle = swStyle.addClass(cls.scroll_py_2)
  def scroll_py_4: SwStyle = swStyle.addClass(cls.scroll_py_4)
  def scroll_py_6: SwStyle = swStyle.addClass(cls.scroll_py_6)
  def scroll_py_8: SwStyle = swStyle.addClass(cls.scroll_py_8)
  def scroll_py_12: SwStyle = swStyle.addClass(cls.scroll_py_12)
  def scroll_py_16: SwStyle = swStyle.addClass(cls.scroll_py_16)
  def scroll_py_20: SwStyle = swStyle.addClass(cls.scroll_py_20)
  def scroll_py_24: SwStyle = swStyle.addClass(cls.scroll_py_24)
  def scroll_py_32: SwStyle = swStyle.addClass(cls.scroll_py_32)
  def scroll_py_40: SwStyle = swStyle.addClass(cls.scroll_py_40)
  def scroll_py_48: SwStyle = swStyle.addClass(cls.scroll_py_48)
  def scroll_ps_0: SwStyle = swStyle.addClass(cls.scroll_ps_0)
  def scroll_ps_2: SwStyle = swStyle.addClass(cls.scroll_ps_2)
  def scroll_ps_4: SwStyle = swStyle.addClass(cls.scroll_ps_4)
  def scroll_ps_6: SwStyle = swStyle.addClass(cls.scroll_ps_6)
  def scroll_ps_8: SwStyle = swStyle.addClass(cls.scroll_ps_8)
  def scroll_ps_12: SwStyle = swStyle.addClass(cls.scroll_ps_12)
  def scroll_ps_16: SwStyle = swStyle.addClass(cls.scroll_ps_16)
  def scroll_ps_20: SwStyle = swStyle.addClass(cls.scroll_ps_20)
  def scroll_ps_24: SwStyle = swStyle.addClass(cls.scroll_ps_24)
  def scroll_ps_32: SwStyle = swStyle.addClass(cls.scroll_ps_32)
  def scroll_ps_40: SwStyle = swStyle.addClass(cls.scroll_ps_40)
  def scroll_ps_48: SwStyle = swStyle.addClass(cls.scroll_ps_48)
  def scroll_pe_0: SwStyle = swStyle.addClass(cls.scroll_pe_0)
  def scroll_pe_2: SwStyle = swStyle.addClass(cls.scroll_pe_2)
  def scroll_pe_4: SwStyle = swStyle.addClass(cls.scroll_pe_4)
  def scroll_pe_6: SwStyle = swStyle.addClass(cls.scroll_pe_6)
  def scroll_pe_8: SwStyle = swStyle.addClass(cls.scroll_pe_8)
  def scroll_pe_12: SwStyle = swStyle.addClass(cls.scroll_pe_12)
  def scroll_pe_16: SwStyle = swStyle.addClass(cls.scroll_pe_16)
  def scroll_pe_20: SwStyle = swStyle.addClass(cls.scroll_pe_20)
  def scroll_pe_24: SwStyle = swStyle.addClass(cls.scroll_pe_24)
  def scroll_pe_32: SwStyle = swStyle.addClass(cls.scroll_pe_32)
  def scroll_pe_40: SwStyle = swStyle.addClass(cls.scroll_pe_40)
  def scroll_pe_48: SwStyle = swStyle.addClass(cls.scroll_pe_48)
  def scroll_pt_0: SwStyle = swStyle.addClass(cls.scroll_pt_0)
  def scroll_pt_2: SwStyle = swStyle.addClass(cls.scroll_pt_2)
  def scroll_pt_4: SwStyle = swStyle.addClass(cls.scroll_pt_4)
  def scroll_pt_6: SwStyle = swStyle.addClass(cls.scroll_pt_6)
  def scroll_pt_8: SwStyle = swStyle.addClass(cls.scroll_pt_8)
  def scroll_pt_12: SwStyle = swStyle.addClass(cls.scroll_pt_12)
  def scroll_pt_16: SwStyle = swStyle.addClass(cls.scroll_pt_16)
  def scroll_pt_20: SwStyle = swStyle.addClass(cls.scroll_pt_20)
  def scroll_pt_24: SwStyle = swStyle.addClass(cls.scroll_pt_24)
  def scroll_pt_32: SwStyle = swStyle.addClass(cls.scroll_pt_32)
  def scroll_pt_40: SwStyle = swStyle.addClass(cls.scroll_pt_40)
  def scroll_pt_48: SwStyle = swStyle.addClass(cls.scroll_pt_48)
  def scroll_pr_0: SwStyle = swStyle.addClass(cls.scroll_pr_0)
  def scroll_pr_2: SwStyle = swStyle.addClass(cls.scroll_pr_2)
  def scroll_pr_4: SwStyle = swStyle.addClass(cls.scroll_pr_4)
  def scroll_pr_6: SwStyle = swStyle.addClass(cls.scroll_pr_6)
  def scroll_pr_8: SwStyle = swStyle.addClass(cls.scroll_pr_8)
  def scroll_pr_12: SwStyle = swStyle.addClass(cls.scroll_pr_12)
  def scroll_pr_16: SwStyle = swStyle.addClass(cls.scroll_pr_16)
  def scroll_pr_20: SwStyle = swStyle.addClass(cls.scroll_pr_20)
  def scroll_pr_24: SwStyle = swStyle.addClass(cls.scroll_pr_24)
  def scroll_pr_32: SwStyle = swStyle.addClass(cls.scroll_pr_32)
  def scroll_pr_40: SwStyle = swStyle.addClass(cls.scroll_pr_40)
  def scroll_pr_48: SwStyle = swStyle.addClass(cls.scroll_pr_48)
  def scroll_pb_0: SwStyle = swStyle.addClass(cls.scroll_pb_0)
  def scroll_pb_2: SwStyle = swStyle.addClass(cls.scroll_pb_2)
  def scroll_pb_4: SwStyle = swStyle.addClass(cls.scroll_pb_4)
  def scroll_pb_6: SwStyle = swStyle.addClass(cls.scroll_pb_6)
  def scroll_pb_8: SwStyle = swStyle.addClass(cls.scroll_pb_8)
  def scroll_pb_12: SwStyle = swStyle.addClass(cls.scroll_pb_12)
  def scroll_pb_16: SwStyle = swStyle.addClass(cls.scroll_pb_16)
  def scroll_pb_20: SwStyle = swStyle.addClass(cls.scroll_pb_20)
  def scroll_pb_24: SwStyle = swStyle.addClass(cls.scroll_pb_24)
  def scroll_pb_32: SwStyle = swStyle.addClass(cls.scroll_pb_32)
  def scroll_pb_40: SwStyle = swStyle.addClass(cls.scroll_pb_40)
  def scroll_pb_48: SwStyle = swStyle.addClass(cls.scroll_pb_48)
  def scroll_pl_0: SwStyle = swStyle.addClass(cls.scroll_pl_0)
  def scroll_pl_2: SwStyle = swStyle.addClass(cls.scroll_pl_2)
  def scroll_pl_4: SwStyle = swStyle.addClass(cls.scroll_pl_4)
  def scroll_pl_6: SwStyle = swStyle.addClass(cls.scroll_pl_6)
  def scroll_pl_8: SwStyle = swStyle.addClass(cls.scroll_pl_8)
  def scroll_pl_12: SwStyle = swStyle.addClass(cls.scroll_pl_12)
  def scroll_pl_16: SwStyle = swStyle.addClass(cls.scroll_pl_16)
  def scroll_pl_20: SwStyle = swStyle.addClass(cls.scroll_pl_20)
  def scroll_pl_24: SwStyle = swStyle.addClass(cls.scroll_pl_24)
  def scroll_pl_32: SwStyle = swStyle.addClass(cls.scroll_pl_32)
  def scroll_pl_40: SwStyle = swStyle.addClass(cls.scroll_pl_40)
  def scroll_pl_48: SwStyle = swStyle.addClass(cls.scroll_pl_48)
  def list_image_none: SwStyle = swStyle.addClass(cls.list_image_none)
  def columns_1: SwStyle = swStyle.addClass(cls.columns_1)
  def columns_2: SwStyle = swStyle.addClass(cls.columns_2)
  def columns_3: SwStyle = swStyle.addClass(cls.columns_3)
  def columns_4: SwStyle = swStyle.addClass(cls.columns_4)
  def columns_5: SwStyle = swStyle.addClass(cls.columns_5)
  def columns_6: SwStyle = swStyle.addClass(cls.columns_6)
  def columns_7: SwStyle = swStyle.addClass(cls.columns_7)
  def columns_8: SwStyle = swStyle.addClass(cls.columns_8)
  def columns_9: SwStyle = swStyle.addClass(cls.columns_9)
  def columns_10: SwStyle = swStyle.addClass(cls.columns_10)
  def columns_11: SwStyle = swStyle.addClass(cls.columns_11)
  def columns_12: SwStyle = swStyle.addClass(cls.columns_12)
  def columns_auto: SwStyle = swStyle.addClass(cls.columns_auto)
  def columns_3xs: SwStyle = swStyle.addClass(cls.columns_3xs)
  def columns_2xs: SwStyle = swStyle.addClass(cls.columns_2xs)
  def columns_xs: SwStyle = swStyle.addClass(cls.columns_xs)
  def columns_sm: SwStyle = swStyle.addClass(cls.columns_sm)
  def columns_md: SwStyle = swStyle.addClass(cls.columns_md)
  def columns_lg: SwStyle = swStyle.addClass(cls.columns_lg)
  def columns_xl: SwStyle = swStyle.addClass(cls.columns_xl)
  def columns_2xl: SwStyle = swStyle.addClass(cls.columns_2xl)
  def columns_3xl: SwStyle = swStyle.addClass(cls.columns_3xl)
  def columns_4xl: SwStyle = swStyle.addClass(cls.columns_4xl)
  def columns_5xl: SwStyle = swStyle.addClass(cls.columns_5xl)
  def columns_6xl: SwStyle = swStyle.addClass(cls.columns_6xl)
  def columns_7xl: SwStyle = swStyle.addClass(cls.columns_7xl)
  def break_before_auto: SwStyle = swStyle.addClass(cls.break_before_auto)
  def break_before_avoid: SwStyle = swStyle.addClass(cls.break_before_avoid)
  def break_before_all: SwStyle = swStyle.addClass(cls.break_before_all)
  def break_before_avoid_page: SwStyle = swStyle.addClass(cls.break_before_avoid_page)
  def break_before_page: SwStyle = swStyle.addClass(cls.break_before_page)
  def break_before_left: SwStyle = swStyle.addClass(cls.break_before_left)
  def break_before_right: SwStyle = swStyle.addClass(cls.break_before_right)
  def break_before_column: SwStyle = swStyle.addClass(cls.break_before_column)
  def break_inside_auto: SwStyle = swStyle.addClass(cls.break_inside_auto)
  def break_inside_avoid: SwStyle = swStyle.addClass(cls.break_inside_avoid)
  def break_inside_avoid_page: SwStyle = swStyle.addClass(cls.break_inside_avoid_page)
  def break_inside_avoid_column: SwStyle = swStyle.addClass(cls.break_inside_avoid_column)
  def break_after_auto: SwStyle = swStyle.addClass(cls.break_after_auto)
  def break_after_avoid: SwStyle = swStyle.addClass(cls.break_after_avoid)
  def break_after_all: SwStyle = swStyle.addClass(cls.break_after_all)
  def break_after_avoid_page: SwStyle = swStyle.addClass(cls.break_after_avoid_page)
  def break_after_page: SwStyle = swStyle.addClass(cls.break_after_page)
  def break_after_left: SwStyle = swStyle.addClass(cls.break_after_left)
  def break_after_right: SwStyle = swStyle.addClass(cls.break_after_right)
  def break_after_column: SwStyle = swStyle.addClass(cls.break_after_column)
  def grid_cols_1: SwStyle = swStyle.addClass(cls.grid_cols_1)
  def grid_cols_2: SwStyle = swStyle.addClass(cls.grid_cols_2)
  def grid_cols_3: SwStyle = swStyle.addClass(cls.grid_cols_3)
  def grid_cols_4: SwStyle = swStyle.addClass(cls.grid_cols_4)
  def grid_cols_5: SwStyle = swStyle.addClass(cls.grid_cols_5)
  def grid_cols_6: SwStyle = swStyle.addClass(cls.grid_cols_6)
  def grid_cols_7: SwStyle = swStyle.addClass(cls.grid_cols_7)
  def grid_cols_8: SwStyle = swStyle.addClass(cls.grid_cols_8)
  def grid_cols_9: SwStyle = swStyle.addClass(cls.grid_cols_9)
  def grid_cols_10: SwStyle = swStyle.addClass(cls.grid_cols_10)
  def grid_cols_11: SwStyle = swStyle.addClass(cls.grid_cols_11)
  def grid_cols_12: SwStyle = swStyle.addClass(cls.grid_cols_12)
  def grid_cols_none: SwStyle = swStyle.addClass(cls.grid_cols_none)
  def grid_cols_subgrid: SwStyle = swStyle.addClass(cls.grid_cols_subgrid)
  def flex_row: SwStyle = swStyle.addClass(cls.flex_row)
  def flex_row_reverse: SwStyle = swStyle.addClass(cls.flex_row_reverse)
  def flex_col: SwStyle = swStyle.addClass(cls.flex_col)
  def flex_col_reverse: SwStyle = swStyle.addClass(cls.flex_col_reverse)
  def flex_wrap: SwStyle = swStyle.addClass(cls.flex_wrap)
  def flex_wrap_reverse: SwStyle = swStyle.addClass(cls.flex_wrap_reverse)
  def flex_nowrap: SwStyle = swStyle.addClass(cls.flex_nowrap)
  def items_start: SwStyle = swStyle.addClass(cls.items_start)
  def items_end: SwStyle = swStyle.addClass(cls.items_end)
  def items_center: SwStyle = swStyle.addClass(cls.items_center)
  def items_baseline: SwStyle = swStyle.addClass(cls.items_baseline)
  def items_stretch: SwStyle = swStyle.addClass(cls.items_stretch)
  def justify_normal: SwStyle = swStyle.addClass(cls.justify_normal)
  def justify_start: SwStyle = swStyle.addClass(cls.justify_start)
  def justify_end: SwStyle = swStyle.addClass(cls.justify_end)
  def justify_center: SwStyle = swStyle.addClass(cls.justify_center)
  def justify_between: SwStyle = swStyle.addClass(cls.justify_between)
  def justify_around: SwStyle = swStyle.addClass(cls.justify_around)
  def justify_evenly: SwStyle = swStyle.addClass(cls.justify_evenly)
  def justify_stretch: SwStyle = swStyle.addClass(cls.justify_stretch)
  def justify_items_start: SwStyle = swStyle.addClass(cls.justify_items_start)
  def justify_items_end: SwStyle = swStyle.addClass(cls.justify_items_end)
  def justify_items_center: SwStyle = swStyle.addClass(cls.justify_items_center)
  def justify_items_stretch: SwStyle = swStyle.addClass(cls.justify_items_stretch)
  def gap_0: SwStyle = swStyle.addClass(cls.gap_0)
  def gap_2: SwStyle = swStyle.addClass(cls.gap_2)
  def gap_4: SwStyle = swStyle.addClass(cls.gap_4)
  def gap_6: SwStyle = swStyle.addClass(cls.gap_6)
  def gap_8: SwStyle = swStyle.addClass(cls.gap_8)
  def gap_12: SwStyle = swStyle.addClass(cls.gap_12)
  def gap_16: SwStyle = swStyle.addClass(cls.gap_16)
  def gap_20: SwStyle = swStyle.addClass(cls.gap_20)
  def gap_24: SwStyle = swStyle.addClass(cls.gap_24)
  def gap_32: SwStyle = swStyle.addClass(cls.gap_32)
  def gap_40: SwStyle = swStyle.addClass(cls.gap_40)
  def gap_48: SwStyle = swStyle.addClass(cls.gap_48)
  def gap_x_0: SwStyle = swStyle.addClass(cls.gap_x_0)
  def gap_x_2: SwStyle = swStyle.addClass(cls.gap_x_2)
  def gap_x_4: SwStyle = swStyle.addClass(cls.gap_x_4)
  def gap_x_6: SwStyle = swStyle.addClass(cls.gap_x_6)
  def gap_x_8: SwStyle = swStyle.addClass(cls.gap_x_8)
  def gap_x_12: SwStyle = swStyle.addClass(cls.gap_x_12)
  def gap_x_16: SwStyle = swStyle.addClass(cls.gap_x_16)
  def gap_x_20: SwStyle = swStyle.addClass(cls.gap_x_20)
  def gap_x_24: SwStyle = swStyle.addClass(cls.gap_x_24)
  def gap_x_32: SwStyle = swStyle.addClass(cls.gap_x_32)
  def gap_x_40: SwStyle = swStyle.addClass(cls.gap_x_40)
  def gap_x_48: SwStyle = swStyle.addClass(cls.gap_x_48)
  def gap_y_0: SwStyle = swStyle.addClass(cls.gap_y_0)
  def gap_y_2: SwStyle = swStyle.addClass(cls.gap_y_2)
  def gap_y_4: SwStyle = swStyle.addClass(cls.gap_y_4)
  def gap_y_6: SwStyle = swStyle.addClass(cls.gap_y_6)
  def gap_y_8: SwStyle = swStyle.addClass(cls.gap_y_8)
  def gap_y_12: SwStyle = swStyle.addClass(cls.gap_y_12)
  def gap_y_16: SwStyle = swStyle.addClass(cls.gap_y_16)
  def gap_y_20: SwStyle = swStyle.addClass(cls.gap_y_20)
  def gap_y_24: SwStyle = swStyle.addClass(cls.gap_y_24)
  def gap_y_32: SwStyle = swStyle.addClass(cls.gap_y_32)
  def gap_y_40: SwStyle = swStyle.addClass(cls.gap_y_40)
  def gap_y_48: SwStyle = swStyle.addClass(cls.gap_y_48)
  def space_x_0: SwStyle = swStyle.addClass(cls.space_x_0)
  def space_x_2: SwStyle = swStyle.addClass(cls.space_x_2)
  def space_x_4: SwStyle = swStyle.addClass(cls.space_x_4)
  def space_x_6: SwStyle = swStyle.addClass(cls.space_x_6)
  def space_x_8: SwStyle = swStyle.addClass(cls.space_x_8)
  def space_x_12: SwStyle = swStyle.addClass(cls.space_x_12)
  def space_x_16: SwStyle = swStyle.addClass(cls.space_x_16)
  def space_x_20: SwStyle = swStyle.addClass(cls.space_x_20)
  def space_x_24: SwStyle = swStyle.addClass(cls.space_x_24)
  def space_x_32: SwStyle = swStyle.addClass(cls.space_x_32)
  def space_x_40: SwStyle = swStyle.addClass(cls.space_x_40)
  def space_x_48: SwStyle = swStyle.addClass(cls.space_x_48)
  def _space_x_0: SwStyle = swStyle.addClass(cls._space_x_0)
  def _space_x_2: SwStyle = swStyle.addClass(cls._space_x_2)
  def _space_x_4: SwStyle = swStyle.addClass(cls._space_x_4)
  def _space_x_6: SwStyle = swStyle.addClass(cls._space_x_6)
  def _space_x_8: SwStyle = swStyle.addClass(cls._space_x_8)
  def _space_x_12: SwStyle = swStyle.addClass(cls._space_x_12)
  def _space_x_16: SwStyle = swStyle.addClass(cls._space_x_16)
  def _space_x_20: SwStyle = swStyle.addClass(cls._space_x_20)
  def _space_x_24: SwStyle = swStyle.addClass(cls._space_x_24)
  def _space_x_32: SwStyle = swStyle.addClass(cls._space_x_32)
  def _space_x_40: SwStyle = swStyle.addClass(cls._space_x_40)
  def _space_x_48: SwStyle = swStyle.addClass(cls._space_x_48)
  def space_y_0: SwStyle = swStyle.addClass(cls.space_y_0)
  def space_y_2: SwStyle = swStyle.addClass(cls.space_y_2)
  def space_y_4: SwStyle = swStyle.addClass(cls.space_y_4)
  def space_y_6: SwStyle = swStyle.addClass(cls.space_y_6)
  def space_y_8: SwStyle = swStyle.addClass(cls.space_y_8)
  def space_y_12: SwStyle = swStyle.addClass(cls.space_y_12)
  def space_y_16: SwStyle = swStyle.addClass(cls.space_y_16)
  def space_y_20: SwStyle = swStyle.addClass(cls.space_y_20)
  def space_y_24: SwStyle = swStyle.addClass(cls.space_y_24)
  def space_y_32: SwStyle = swStyle.addClass(cls.space_y_32)
  def space_y_40: SwStyle = swStyle.addClass(cls.space_y_40)
  def space_y_48: SwStyle = swStyle.addClass(cls.space_y_48)
  def _space_y_0: SwStyle = swStyle.addClass(cls._space_y_0)
  def _space_y_2: SwStyle = swStyle.addClass(cls._space_y_2)
  def _space_y_4: SwStyle = swStyle.addClass(cls._space_y_4)
  def _space_y_6: SwStyle = swStyle.addClass(cls._space_y_6)
  def _space_y_8: SwStyle = swStyle.addClass(cls._space_y_8)
  def _space_y_12: SwStyle = swStyle.addClass(cls._space_y_12)
  def _space_y_16: SwStyle = swStyle.addClass(cls._space_y_16)
  def _space_y_20: SwStyle = swStyle.addClass(cls._space_y_20)
  def _space_y_24: SwStyle = swStyle.addClass(cls._space_y_24)
  def _space_y_32: SwStyle = swStyle.addClass(cls._space_y_32)
  def _space_y_40: SwStyle = swStyle.addClass(cls._space_y_40)
  def _space_y_48: SwStyle = swStyle.addClass(cls._space_y_48)
  def space_y_reverse: SwStyle = swStyle.addClass(cls.space_y_reverse)
  def space_x_reverse: SwStyle = swStyle.addClass(cls.space_x_reverse)
  def divide_x_3: SwStyle = swStyle.addClass(cls.divide_x_3)
  def divide_x_default: SwStyle = swStyle.addClass(cls.divide_x_default)
  def divide_y_3: SwStyle = swStyle.addClass(cls.divide_y_3)
  def divide_y_default: SwStyle = swStyle.addClass(cls.divide_y_default)
  def divide_y_reverse: SwStyle = swStyle.addClass(cls.divide_y_reverse)
  def divide_x_reverse: SwStyle = swStyle.addClass(cls.divide_x_reverse)
  def divide_solid: SwStyle = swStyle.addClass(cls.divide_solid)
  def divide_dashed: SwStyle = swStyle.addClass(cls.divide_dashed)
  def divide_dotted: SwStyle = swStyle.addClass(cls.divide_dotted)
  def divide_double: SwStyle = swStyle.addClass(cls.divide_double)
  def divide_none: SwStyle = swStyle.addClass(cls.divide_none)
  def divide_gray_0: SwStyle = swStyle.addClass(cls.divide_gray_0)
  def divide_gray_1: SwStyle = swStyle.addClass(cls.divide_gray_1)
  def divide_gray_2: SwStyle = swStyle.addClass(cls.divide_gray_2)
  def divide_gray_3: SwStyle = swStyle.addClass(cls.divide_gray_3)
  def divide_gray_4: SwStyle = swStyle.addClass(cls.divide_gray_4)
  def divide_gray_5: SwStyle = swStyle.addClass(cls.divide_gray_5)
  def divide_gray_6: SwStyle = swStyle.addClass(cls.divide_gray_6)
  def divide_gray_7: SwStyle = swStyle.addClass(cls.divide_gray_7)
  def divide_gray_8: SwStyle = swStyle.addClass(cls.divide_gray_8)
  def divide_gray_9: SwStyle = swStyle.addClass(cls.divide_gray_9)
  def divide_danger_1: SwStyle = swStyle.addClass(cls.divide_danger_1)
  def divide_danger_2: SwStyle = swStyle.addClass(cls.divide_danger_2)
  def divide_danger_3: SwStyle = swStyle.addClass(cls.divide_danger_3)
  def divide_danger_4: SwStyle = swStyle.addClass(cls.divide_danger_4)
  def divide_danger_5: SwStyle = swStyle.addClass(cls.divide_danger_5)
  def divide_primary_1: SwStyle = swStyle.addClass(cls.divide_primary_1)
  def divide_primary_2: SwStyle = swStyle.addClass(cls.divide_primary_2)
  def divide_primary_3: SwStyle = swStyle.addClass(cls.divide_primary_3)
  def divide_primary_4: SwStyle = swStyle.addClass(cls.divide_primary_4)
  def divide_primary_5: SwStyle = swStyle.addClass(cls.divide_primary_5)
  def divide_success_1: SwStyle = swStyle.addClass(cls.divide_success_1)
  def divide_success_2: SwStyle = swStyle.addClass(cls.divide_success_2)
  def divide_success_3: SwStyle = swStyle.addClass(cls.divide_success_3)
  def divide_success_4: SwStyle = swStyle.addClass(cls.divide_success_4)
  def divide_success_5: SwStyle = swStyle.addClass(cls.divide_success_5)
  def divide_warning_1: SwStyle = swStyle.addClass(cls.divide_warning_1)
  def divide_warning_2: SwStyle = swStyle.addClass(cls.divide_warning_2)
  def divide_warning_3: SwStyle = swStyle.addClass(cls.divide_warning_3)
  def divide_warning_4: SwStyle = swStyle.addClass(cls.divide_warning_4)
  def divide_warning_5: SwStyle = swStyle.addClass(cls.divide_warning_5)
  def divide_transparent: SwStyle = swStyle.addClass(cls.divide_transparent)
  def divide_current: SwStyle = swStyle.addClass(cls.divide_current)
  def divide_inherit: SwStyle = swStyle.addClass(cls.divide_inherit)
  def divide_custom_1: SwStyle = swStyle.addClass(cls.divide_custom_1)
  def divide_custom_2: SwStyle = swStyle.addClass(cls.divide_custom_2)
  def divide_custom_3: SwStyle = swStyle.addClass(cls.divide_custom_3)
  def divide_custom_4: SwStyle = swStyle.addClass(cls.divide_custom_4)
  def divide_opacity_0: SwStyle = swStyle.addClass(cls.divide_opacity_0)
  def divide_opacity_10: SwStyle = swStyle.addClass(cls.divide_opacity_10)
  def divide_opacity_20: SwStyle = swStyle.addClass(cls.divide_opacity_20)
  def divide_opacity_30: SwStyle = swStyle.addClass(cls.divide_opacity_30)
  def divide_opacity_40: SwStyle = swStyle.addClass(cls.divide_opacity_40)
  def divide_opacity_50: SwStyle = swStyle.addClass(cls.divide_opacity_50)
  def divide_opacity_60: SwStyle = swStyle.addClass(cls.divide_opacity_60)
  def divide_opacity_70: SwStyle = swStyle.addClass(cls.divide_opacity_70)
  def divide_opacity_80: SwStyle = swStyle.addClass(cls.divide_opacity_80)
  def divide_opacity_90: SwStyle = swStyle.addClass(cls.divide_opacity_90)
  def divide_opacity_100: SwStyle = swStyle.addClass(cls.divide_opacity_100)
  def overflow_auto: SwStyle = swStyle.addClass(cls.overflow_auto)
  def overflow_hidden: SwStyle = swStyle.addClass(cls.overflow_hidden)
  def overflow_clip: SwStyle = swStyle.addClass(cls.overflow_clip)
  def overflow_visible: SwStyle = swStyle.addClass(cls.overflow_visible)
  def overflow_scroll: SwStyle = swStyle.addClass(cls.overflow_scroll)
  def overflow_x_auto: SwStyle = swStyle.addClass(cls.overflow_x_auto)
  def overflow_y_auto: SwStyle = swStyle.addClass(cls.overflow_y_auto)
  def overflow_x_hidden: SwStyle = swStyle.addClass(cls.overflow_x_hidden)
  def overflow_y_hidden: SwStyle = swStyle.addClass(cls.overflow_y_hidden)
  def overflow_x_clip: SwStyle = swStyle.addClass(cls.overflow_x_clip)
  def overflow_y_clip: SwStyle = swStyle.addClass(cls.overflow_y_clip)
  def overflow_x_visible: SwStyle = swStyle.addClass(cls.overflow_x_visible)
  def overflow_y_visible: SwStyle = swStyle.addClass(cls.overflow_y_visible)
  def overflow_x_scroll: SwStyle = swStyle.addClass(cls.overflow_x_scroll)
  def overflow_y_scroll: SwStyle = swStyle.addClass(cls.overflow_y_scroll)
  def scroll_auto: SwStyle = swStyle.addClass(cls.scroll_auto)
  def scroll_smooth: SwStyle = swStyle.addClass(cls.scroll_smooth)
  def truncate: SwStyle = swStyle.addClass(cls.truncate)
  def overflow_ellipsis: SwStyle = swStyle.addClass(cls.overflow_ellipsis)
  def text_ellipsis: SwStyle = swStyle.addClass(cls.text_ellipsis)
  def text_clip: SwStyle = swStyle.addClass(cls.text_clip)
  def hyphens_none: SwStyle = swStyle.addClass(cls.hyphens_none)
  def hyphens_manual: SwStyle = swStyle.addClass(cls.hyphens_manual)
  def hyphens_auto: SwStyle = swStyle.addClass(cls.hyphens_auto)
  def whitespace_normal: SwStyle = swStyle.addClass(cls.whitespace_normal)
  def whitespace_nowrap: SwStyle = swStyle.addClass(cls.whitespace_nowrap)
  def whitespace_pre: SwStyle = swStyle.addClass(cls.whitespace_pre)
  def whitespace_pre_line: SwStyle = swStyle.addClass(cls.whitespace_pre_line)
  def whitespace_pre_wrap: SwStyle = swStyle.addClass(cls.whitespace_pre_wrap)
  def whitespace_break_spaces: SwStyle = swStyle.addClass(cls.whitespace_break_spaces)
  def text_wrap: SwStyle = swStyle.addClass(cls.text_wrap)
  def text_nowrap: SwStyle = swStyle.addClass(cls.text_nowrap)
  def text_balance: SwStyle = swStyle.addClass(cls.text_balance)
  def text_pretty: SwStyle = swStyle.addClass(cls.text_pretty)
  def break_normal: SwStyle = swStyle.addClass(cls.break_normal)
  def break_words: SwStyle = swStyle.addClass(cls.break_words)
  def break_all: SwStyle = swStyle.addClass(cls.break_all)
  def break_keep: SwStyle = swStyle.addClass(cls.break_keep)
  def rounded_0: SwStyle = swStyle.addClass(cls.rounded_0)
  def rounded_2: SwStyle = swStyle.addClass(cls.rounded_2)
  def rounded_3: SwStyle = swStyle.addClass(cls.rounded_3)
  def rounded_4: SwStyle = swStyle.addClass(cls.rounded_4)
  def rounded_6: SwStyle = swStyle.addClass(cls.rounded_6)
  def rounded_8: SwStyle = swStyle.addClass(cls.rounded_8)
  def rounded_full: SwStyle = swStyle.addClass(cls.rounded_full)
  def rounded_s_0: SwStyle = swStyle.addClass(cls.rounded_s_0)
  def rounded_s_2: SwStyle = swStyle.addClass(cls.rounded_s_2)
  def rounded_s_3: SwStyle = swStyle.addClass(cls.rounded_s_3)
  def rounded_s_4: SwStyle = swStyle.addClass(cls.rounded_s_4)
  def rounded_s_6: SwStyle = swStyle.addClass(cls.rounded_s_6)
  def rounded_s_8: SwStyle = swStyle.addClass(cls.rounded_s_8)
  def rounded_s_full: SwStyle = swStyle.addClass(cls.rounded_s_full)
  def rounded_e_0: SwStyle = swStyle.addClass(cls.rounded_e_0)
  def rounded_e_2: SwStyle = swStyle.addClass(cls.rounded_e_2)
  def rounded_e_3: SwStyle = swStyle.addClass(cls.rounded_e_3)
  def rounded_e_4: SwStyle = swStyle.addClass(cls.rounded_e_4)
  def rounded_e_6: SwStyle = swStyle.addClass(cls.rounded_e_6)
  def rounded_e_8: SwStyle = swStyle.addClass(cls.rounded_e_8)
  def rounded_e_full: SwStyle = swStyle.addClass(cls.rounded_e_full)
  def rounded_t_0: SwStyle = swStyle.addClass(cls.rounded_t_0)
  def rounded_t_2: SwStyle = swStyle.addClass(cls.rounded_t_2)
  def rounded_t_3: SwStyle = swStyle.addClass(cls.rounded_t_3)
  def rounded_t_4: SwStyle = swStyle.addClass(cls.rounded_t_4)
  def rounded_t_6: SwStyle = swStyle.addClass(cls.rounded_t_6)
  def rounded_t_8: SwStyle = swStyle.addClass(cls.rounded_t_8)
  def rounded_t_full: SwStyle = swStyle.addClass(cls.rounded_t_full)
  def rounded_r_0: SwStyle = swStyle.addClass(cls.rounded_r_0)
  def rounded_r_2: SwStyle = swStyle.addClass(cls.rounded_r_2)
  def rounded_r_3: SwStyle = swStyle.addClass(cls.rounded_r_3)
  def rounded_r_4: SwStyle = swStyle.addClass(cls.rounded_r_4)
  def rounded_r_6: SwStyle = swStyle.addClass(cls.rounded_r_6)
  def rounded_r_8: SwStyle = swStyle.addClass(cls.rounded_r_8)
  def rounded_r_full: SwStyle = swStyle.addClass(cls.rounded_r_full)
  def rounded_b_0: SwStyle = swStyle.addClass(cls.rounded_b_0)
  def rounded_b_2: SwStyle = swStyle.addClass(cls.rounded_b_2)
  def rounded_b_3: SwStyle = swStyle.addClass(cls.rounded_b_3)
  def rounded_b_4: SwStyle = swStyle.addClass(cls.rounded_b_4)
  def rounded_b_6: SwStyle = swStyle.addClass(cls.rounded_b_6)
  def rounded_b_8: SwStyle = swStyle.addClass(cls.rounded_b_8)
  def rounded_b_full: SwStyle = swStyle.addClass(cls.rounded_b_full)
  def rounded_l_0: SwStyle = swStyle.addClass(cls.rounded_l_0)
  def rounded_l_2: SwStyle = swStyle.addClass(cls.rounded_l_2)
  def rounded_l_3: SwStyle = swStyle.addClass(cls.rounded_l_3)
  def rounded_l_4: SwStyle = swStyle.addClass(cls.rounded_l_4)
  def rounded_l_6: SwStyle = swStyle.addClass(cls.rounded_l_6)
  def rounded_l_8: SwStyle = swStyle.addClass(cls.rounded_l_8)
  def rounded_l_full: SwStyle = swStyle.addClass(cls.rounded_l_full)
  def rounded_ss_0: SwStyle = swStyle.addClass(cls.rounded_ss_0)
  def rounded_ss_2: SwStyle = swStyle.addClass(cls.rounded_ss_2)
  def rounded_ss_3: SwStyle = swStyle.addClass(cls.rounded_ss_3)
  def rounded_ss_4: SwStyle = swStyle.addClass(cls.rounded_ss_4)
  def rounded_ss_6: SwStyle = swStyle.addClass(cls.rounded_ss_6)
  def rounded_ss_8: SwStyle = swStyle.addClass(cls.rounded_ss_8)
  def rounded_ss_full: SwStyle = swStyle.addClass(cls.rounded_ss_full)
  def rounded_se_0: SwStyle = swStyle.addClass(cls.rounded_se_0)
  def rounded_se_2: SwStyle = swStyle.addClass(cls.rounded_se_2)
  def rounded_se_3: SwStyle = swStyle.addClass(cls.rounded_se_3)
  def rounded_se_4: SwStyle = swStyle.addClass(cls.rounded_se_4)
  def rounded_se_6: SwStyle = swStyle.addClass(cls.rounded_se_6)
  def rounded_se_8: SwStyle = swStyle.addClass(cls.rounded_se_8)
  def rounded_se_full: SwStyle = swStyle.addClass(cls.rounded_se_full)
  def rounded_ee_0: SwStyle = swStyle.addClass(cls.rounded_ee_0)
  def rounded_ee_2: SwStyle = swStyle.addClass(cls.rounded_ee_2)
  def rounded_ee_3: SwStyle = swStyle.addClass(cls.rounded_ee_3)
  def rounded_ee_4: SwStyle = swStyle.addClass(cls.rounded_ee_4)
  def rounded_ee_6: SwStyle = swStyle.addClass(cls.rounded_ee_6)
  def rounded_ee_8: SwStyle = swStyle.addClass(cls.rounded_ee_8)
  def rounded_ee_full: SwStyle = swStyle.addClass(cls.rounded_ee_full)
  def rounded_es_0: SwStyle = swStyle.addClass(cls.rounded_es_0)
  def rounded_es_2: SwStyle = swStyle.addClass(cls.rounded_es_2)
  def rounded_es_3: SwStyle = swStyle.addClass(cls.rounded_es_3)
  def rounded_es_4: SwStyle = swStyle.addClass(cls.rounded_es_4)
  def rounded_es_6: SwStyle = swStyle.addClass(cls.rounded_es_6)
  def rounded_es_8: SwStyle = swStyle.addClass(cls.rounded_es_8)
  def rounded_es_full: SwStyle = swStyle.addClass(cls.rounded_es_full)
  def rounded_tl_0: SwStyle = swStyle.addClass(cls.rounded_tl_0)
  def rounded_tl_2: SwStyle = swStyle.addClass(cls.rounded_tl_2)
  def rounded_tl_3: SwStyle = swStyle.addClass(cls.rounded_tl_3)
  def rounded_tl_4: SwStyle = swStyle.addClass(cls.rounded_tl_4)
  def rounded_tl_6: SwStyle = swStyle.addClass(cls.rounded_tl_6)
  def rounded_tl_8: SwStyle = swStyle.addClass(cls.rounded_tl_8)
  def rounded_tl_full: SwStyle = swStyle.addClass(cls.rounded_tl_full)
  def rounded_tr_0: SwStyle = swStyle.addClass(cls.rounded_tr_0)
  def rounded_tr_2: SwStyle = swStyle.addClass(cls.rounded_tr_2)
  def rounded_tr_3: SwStyle = swStyle.addClass(cls.rounded_tr_3)
  def rounded_tr_4: SwStyle = swStyle.addClass(cls.rounded_tr_4)
  def rounded_tr_6: SwStyle = swStyle.addClass(cls.rounded_tr_6)
  def rounded_tr_8: SwStyle = swStyle.addClass(cls.rounded_tr_8)
  def rounded_tr_full: SwStyle = swStyle.addClass(cls.rounded_tr_full)
  def rounded_br_0: SwStyle = swStyle.addClass(cls.rounded_br_0)
  def rounded_br_2: SwStyle = swStyle.addClass(cls.rounded_br_2)
  def rounded_br_3: SwStyle = swStyle.addClass(cls.rounded_br_3)
  def rounded_br_4: SwStyle = swStyle.addClass(cls.rounded_br_4)
  def rounded_br_6: SwStyle = swStyle.addClass(cls.rounded_br_6)
  def rounded_br_8: SwStyle = swStyle.addClass(cls.rounded_br_8)
  def rounded_br_full: SwStyle = swStyle.addClass(cls.rounded_br_full)
  def rounded_bl_0: SwStyle = swStyle.addClass(cls.rounded_bl_0)
  def rounded_bl_2: SwStyle = swStyle.addClass(cls.rounded_bl_2)
  def rounded_bl_3: SwStyle = swStyle.addClass(cls.rounded_bl_3)
  def rounded_bl_4: SwStyle = swStyle.addClass(cls.rounded_bl_4)
  def rounded_bl_6: SwStyle = swStyle.addClass(cls.rounded_bl_6)
  def rounded_bl_8: SwStyle = swStyle.addClass(cls.rounded_bl_8)
  def rounded_bl_full: SwStyle = swStyle.addClass(cls.rounded_bl_full)
  def border_3: SwStyle = swStyle.addClass(cls.border_3)
  def border_default: SwStyle = swStyle.addClass(cls.border_default)
  def border_x_3: SwStyle = swStyle.addClass(cls.border_x_3)
  def border_x_default: SwStyle = swStyle.addClass(cls.border_x_default)
  def border_y_3: SwStyle = swStyle.addClass(cls.border_y_3)
  def border_y_default: SwStyle = swStyle.addClass(cls.border_y_default)
  def border_s_3: SwStyle = swStyle.addClass(cls.border_s_3)
  def border_s_default: SwStyle = swStyle.addClass(cls.border_s_default)
  def border_e_3: SwStyle = swStyle.addClass(cls.border_e_3)
  def border_e_default: SwStyle = swStyle.addClass(cls.border_e_default)
  def border_t_3: SwStyle = swStyle.addClass(cls.border_t_3)
  def border_t_default: SwStyle = swStyle.addClass(cls.border_t_default)
  def border_r_3: SwStyle = swStyle.addClass(cls.border_r_3)
  def border_r_default: SwStyle = swStyle.addClass(cls.border_r_default)
  def border_b_3: SwStyle = swStyle.addClass(cls.border_b_3)
  def border_b_default: SwStyle = swStyle.addClass(cls.border_b_default)
  def border_l_3: SwStyle = swStyle.addClass(cls.border_l_3)
  def border_l_default: SwStyle = swStyle.addClass(cls.border_l_default)
  def border_solid: SwStyle = swStyle.addClass(cls.border_solid)
  def border_dashed: SwStyle = swStyle.addClass(cls.border_dashed)
  def border_dotted: SwStyle = swStyle.addClass(cls.border_dotted)
  def border_double: SwStyle = swStyle.addClass(cls.border_double)
  def border_hidden: SwStyle = swStyle.addClass(cls.border_hidden)
  def border_none: SwStyle = swStyle.addClass(cls.border_none)
  def border_gray_0: SwStyle = swStyle.addClass(cls.border_gray_0)
  def border_gray_1: SwStyle = swStyle.addClass(cls.border_gray_1)
  def border_gray_2: SwStyle = swStyle.addClass(cls.border_gray_2)
  def border_gray_3: SwStyle = swStyle.addClass(cls.border_gray_3)
  def border_gray_4: SwStyle = swStyle.addClass(cls.border_gray_4)
  def border_gray_5: SwStyle = swStyle.addClass(cls.border_gray_5)
  def border_gray_6: SwStyle = swStyle.addClass(cls.border_gray_6)
  def border_gray_7: SwStyle = swStyle.addClass(cls.border_gray_7)
  def border_gray_8: SwStyle = swStyle.addClass(cls.border_gray_8)
  def border_gray_9: SwStyle = swStyle.addClass(cls.border_gray_9)
  def border_danger_1: SwStyle = swStyle.addClass(cls.border_danger_1)
  def border_danger_2: SwStyle = swStyle.addClass(cls.border_danger_2)
  def border_danger_3: SwStyle = swStyle.addClass(cls.border_danger_3)
  def border_danger_4: SwStyle = swStyle.addClass(cls.border_danger_4)
  def border_danger_5: SwStyle = swStyle.addClass(cls.border_danger_5)
  def border_primary_1: SwStyle = swStyle.addClass(cls.border_primary_1)
  def border_primary_2: SwStyle = swStyle.addClass(cls.border_primary_2)
  def border_primary_3: SwStyle = swStyle.addClass(cls.border_primary_3)
  def border_primary_4: SwStyle = swStyle.addClass(cls.border_primary_4)
  def border_primary_5: SwStyle = swStyle.addClass(cls.border_primary_5)
  def border_success_1: SwStyle = swStyle.addClass(cls.border_success_1)
  def border_success_2: SwStyle = swStyle.addClass(cls.border_success_2)
  def border_success_3: SwStyle = swStyle.addClass(cls.border_success_3)
  def border_success_4: SwStyle = swStyle.addClass(cls.border_success_4)
  def border_success_5: SwStyle = swStyle.addClass(cls.border_success_5)
  def border_warning_1: SwStyle = swStyle.addClass(cls.border_warning_1)
  def border_warning_2: SwStyle = swStyle.addClass(cls.border_warning_2)
  def border_warning_3: SwStyle = swStyle.addClass(cls.border_warning_3)
  def border_warning_4: SwStyle = swStyle.addClass(cls.border_warning_4)
  def border_warning_5: SwStyle = swStyle.addClass(cls.border_warning_5)
  def border_transparent: SwStyle = swStyle.addClass(cls.border_transparent)
  def border_current: SwStyle = swStyle.addClass(cls.border_current)
  def border_inherit: SwStyle = swStyle.addClass(cls.border_inherit)
  def border_custom_1: SwStyle = swStyle.addClass(cls.border_custom_1)
  def border_custom_2: SwStyle = swStyle.addClass(cls.border_custom_2)
  def border_custom_3: SwStyle = swStyle.addClass(cls.border_custom_3)
  def border_custom_4: SwStyle = swStyle.addClass(cls.border_custom_4)
  def border_x_gray_0: SwStyle = swStyle.addClass(cls.border_x_gray_0)
  def border_x_gray_1: SwStyle = swStyle.addClass(cls.border_x_gray_1)
  def border_x_gray_2: SwStyle = swStyle.addClass(cls.border_x_gray_2)
  def border_x_gray_3: SwStyle = swStyle.addClass(cls.border_x_gray_3)
  def border_x_gray_4: SwStyle = swStyle.addClass(cls.border_x_gray_4)
  def border_x_gray_5: SwStyle = swStyle.addClass(cls.border_x_gray_5)
  def border_x_gray_6: SwStyle = swStyle.addClass(cls.border_x_gray_6)
  def border_x_gray_7: SwStyle = swStyle.addClass(cls.border_x_gray_7)
  def border_x_gray_8: SwStyle = swStyle.addClass(cls.border_x_gray_8)
  def border_x_gray_9: SwStyle = swStyle.addClass(cls.border_x_gray_9)
  def border_x_danger_1: SwStyle = swStyle.addClass(cls.border_x_danger_1)
  def border_x_danger_2: SwStyle = swStyle.addClass(cls.border_x_danger_2)
  def border_x_danger_3: SwStyle = swStyle.addClass(cls.border_x_danger_3)
  def border_x_danger_4: SwStyle = swStyle.addClass(cls.border_x_danger_4)
  def border_x_danger_5: SwStyle = swStyle.addClass(cls.border_x_danger_5)
  def border_x_primary_1: SwStyle = swStyle.addClass(cls.border_x_primary_1)
  def border_x_primary_2: SwStyle = swStyle.addClass(cls.border_x_primary_2)
  def border_x_primary_3: SwStyle = swStyle.addClass(cls.border_x_primary_3)
  def border_x_primary_4: SwStyle = swStyle.addClass(cls.border_x_primary_4)
  def border_x_primary_5: SwStyle = swStyle.addClass(cls.border_x_primary_5)
  def border_x_success_1: SwStyle = swStyle.addClass(cls.border_x_success_1)
  def border_x_success_2: SwStyle = swStyle.addClass(cls.border_x_success_2)
  def border_x_success_3: SwStyle = swStyle.addClass(cls.border_x_success_3)
  def border_x_success_4: SwStyle = swStyle.addClass(cls.border_x_success_4)
  def border_x_success_5: SwStyle = swStyle.addClass(cls.border_x_success_5)
  def border_x_warning_1: SwStyle = swStyle.addClass(cls.border_x_warning_1)
  def border_x_warning_2: SwStyle = swStyle.addClass(cls.border_x_warning_2)
  def border_x_warning_3: SwStyle = swStyle.addClass(cls.border_x_warning_3)
  def border_x_warning_4: SwStyle = swStyle.addClass(cls.border_x_warning_4)
  def border_x_warning_5: SwStyle = swStyle.addClass(cls.border_x_warning_5)
  def border_x_transparent: SwStyle = swStyle.addClass(cls.border_x_transparent)
  def border_x_current: SwStyle = swStyle.addClass(cls.border_x_current)
  def border_x_inherit: SwStyle = swStyle.addClass(cls.border_x_inherit)
  def border_x_custom_1: SwStyle = swStyle.addClass(cls.border_x_custom_1)
  def border_x_custom_2: SwStyle = swStyle.addClass(cls.border_x_custom_2)
  def border_x_custom_3: SwStyle = swStyle.addClass(cls.border_x_custom_3)
  def border_x_custom_4: SwStyle = swStyle.addClass(cls.border_x_custom_4)
  def border_y_gray_0: SwStyle = swStyle.addClass(cls.border_y_gray_0)
  def border_y_gray_1: SwStyle = swStyle.addClass(cls.border_y_gray_1)
  def border_y_gray_2: SwStyle = swStyle.addClass(cls.border_y_gray_2)
  def border_y_gray_3: SwStyle = swStyle.addClass(cls.border_y_gray_3)
  def border_y_gray_4: SwStyle = swStyle.addClass(cls.border_y_gray_4)
  def border_y_gray_5: SwStyle = swStyle.addClass(cls.border_y_gray_5)
  def border_y_gray_6: SwStyle = swStyle.addClass(cls.border_y_gray_6)
  def border_y_gray_7: SwStyle = swStyle.addClass(cls.border_y_gray_7)
  def border_y_gray_8: SwStyle = swStyle.addClass(cls.border_y_gray_8)
  def border_y_gray_9: SwStyle = swStyle.addClass(cls.border_y_gray_9)
  def border_y_danger_1: SwStyle = swStyle.addClass(cls.border_y_danger_1)
  def border_y_danger_2: SwStyle = swStyle.addClass(cls.border_y_danger_2)
  def border_y_danger_3: SwStyle = swStyle.addClass(cls.border_y_danger_3)
  def border_y_danger_4: SwStyle = swStyle.addClass(cls.border_y_danger_4)
  def border_y_danger_5: SwStyle = swStyle.addClass(cls.border_y_danger_5)
  def border_y_primary_1: SwStyle = swStyle.addClass(cls.border_y_primary_1)
  def border_y_primary_2: SwStyle = swStyle.addClass(cls.border_y_primary_2)
  def border_y_primary_3: SwStyle = swStyle.addClass(cls.border_y_primary_3)
  def border_y_primary_4: SwStyle = swStyle.addClass(cls.border_y_primary_4)
  def border_y_primary_5: SwStyle = swStyle.addClass(cls.border_y_primary_5)
  def border_y_success_1: SwStyle = swStyle.addClass(cls.border_y_success_1)
  def border_y_success_2: SwStyle = swStyle.addClass(cls.border_y_success_2)
  def border_y_success_3: SwStyle = swStyle.addClass(cls.border_y_success_3)
  def border_y_success_4: SwStyle = swStyle.addClass(cls.border_y_success_4)
  def border_y_success_5: SwStyle = swStyle.addClass(cls.border_y_success_5)
  def border_y_warning_1: SwStyle = swStyle.addClass(cls.border_y_warning_1)
  def border_y_warning_2: SwStyle = swStyle.addClass(cls.border_y_warning_2)
  def border_y_warning_3: SwStyle = swStyle.addClass(cls.border_y_warning_3)
  def border_y_warning_4: SwStyle = swStyle.addClass(cls.border_y_warning_4)
  def border_y_warning_5: SwStyle = swStyle.addClass(cls.border_y_warning_5)
  def border_y_transparent: SwStyle = swStyle.addClass(cls.border_y_transparent)
  def border_y_current: SwStyle = swStyle.addClass(cls.border_y_current)
  def border_y_inherit: SwStyle = swStyle.addClass(cls.border_y_inherit)
  def border_y_custom_1: SwStyle = swStyle.addClass(cls.border_y_custom_1)
  def border_y_custom_2: SwStyle = swStyle.addClass(cls.border_y_custom_2)
  def border_y_custom_3: SwStyle = swStyle.addClass(cls.border_y_custom_3)
  def border_y_custom_4: SwStyle = swStyle.addClass(cls.border_y_custom_4)
  def border_s_gray_0: SwStyle = swStyle.addClass(cls.border_s_gray_0)
  def border_s_gray_1: SwStyle = swStyle.addClass(cls.border_s_gray_1)
  def border_s_gray_2: SwStyle = swStyle.addClass(cls.border_s_gray_2)
  def border_s_gray_3: SwStyle = swStyle.addClass(cls.border_s_gray_3)
  def border_s_gray_4: SwStyle = swStyle.addClass(cls.border_s_gray_4)
  def border_s_gray_5: SwStyle = swStyle.addClass(cls.border_s_gray_5)
  def border_s_gray_6: SwStyle = swStyle.addClass(cls.border_s_gray_6)
  def border_s_gray_7: SwStyle = swStyle.addClass(cls.border_s_gray_7)
  def border_s_gray_8: SwStyle = swStyle.addClass(cls.border_s_gray_8)
  def border_s_gray_9: SwStyle = swStyle.addClass(cls.border_s_gray_9)
  def border_s_danger_1: SwStyle = swStyle.addClass(cls.border_s_danger_1)
  def border_s_danger_2: SwStyle = swStyle.addClass(cls.border_s_danger_2)
  def border_s_danger_3: SwStyle = swStyle.addClass(cls.border_s_danger_3)
  def border_s_danger_4: SwStyle = swStyle.addClass(cls.border_s_danger_4)
  def border_s_danger_5: SwStyle = swStyle.addClass(cls.border_s_danger_5)
  def border_s_primary_1: SwStyle = swStyle.addClass(cls.border_s_primary_1)
  def border_s_primary_2: SwStyle = swStyle.addClass(cls.border_s_primary_2)
  def border_s_primary_3: SwStyle = swStyle.addClass(cls.border_s_primary_3)
  def border_s_primary_4: SwStyle = swStyle.addClass(cls.border_s_primary_4)
  def border_s_primary_5: SwStyle = swStyle.addClass(cls.border_s_primary_5)
  def border_s_success_1: SwStyle = swStyle.addClass(cls.border_s_success_1)
  def border_s_success_2: SwStyle = swStyle.addClass(cls.border_s_success_2)
  def border_s_success_3: SwStyle = swStyle.addClass(cls.border_s_success_3)
  def border_s_success_4: SwStyle = swStyle.addClass(cls.border_s_success_4)
  def border_s_success_5: SwStyle = swStyle.addClass(cls.border_s_success_5)
  def border_s_warning_1: SwStyle = swStyle.addClass(cls.border_s_warning_1)
  def border_s_warning_2: SwStyle = swStyle.addClass(cls.border_s_warning_2)
  def border_s_warning_3: SwStyle = swStyle.addClass(cls.border_s_warning_3)
  def border_s_warning_4: SwStyle = swStyle.addClass(cls.border_s_warning_4)
  def border_s_warning_5: SwStyle = swStyle.addClass(cls.border_s_warning_5)
  def border_s_transparent: SwStyle = swStyle.addClass(cls.border_s_transparent)
  def border_s_current: SwStyle = swStyle.addClass(cls.border_s_current)
  def border_s_inherit: SwStyle = swStyle.addClass(cls.border_s_inherit)
  def border_s_custom_1: SwStyle = swStyle.addClass(cls.border_s_custom_1)
  def border_s_custom_2: SwStyle = swStyle.addClass(cls.border_s_custom_2)
  def border_s_custom_3: SwStyle = swStyle.addClass(cls.border_s_custom_3)
  def border_s_custom_4: SwStyle = swStyle.addClass(cls.border_s_custom_4)
  def border_e_gray_0: SwStyle = swStyle.addClass(cls.border_e_gray_0)
  def border_e_gray_1: SwStyle = swStyle.addClass(cls.border_e_gray_1)
  def border_e_gray_2: SwStyle = swStyle.addClass(cls.border_e_gray_2)
  def border_e_gray_3: SwStyle = swStyle.addClass(cls.border_e_gray_3)
  def border_e_gray_4: SwStyle = swStyle.addClass(cls.border_e_gray_4)
  def border_e_gray_5: SwStyle = swStyle.addClass(cls.border_e_gray_5)
  def border_e_gray_6: SwStyle = swStyle.addClass(cls.border_e_gray_6)
  def border_e_gray_7: SwStyle = swStyle.addClass(cls.border_e_gray_7)
  def border_e_gray_8: SwStyle = swStyle.addClass(cls.border_e_gray_8)
  def border_e_gray_9: SwStyle = swStyle.addClass(cls.border_e_gray_9)
  def border_e_danger_1: SwStyle = swStyle.addClass(cls.border_e_danger_1)
  def border_e_danger_2: SwStyle = swStyle.addClass(cls.border_e_danger_2)
  def border_e_danger_3: SwStyle = swStyle.addClass(cls.border_e_danger_3)
  def border_e_danger_4: SwStyle = swStyle.addClass(cls.border_e_danger_4)
  def border_e_danger_5: SwStyle = swStyle.addClass(cls.border_e_danger_5)
  def border_e_primary_1: SwStyle = swStyle.addClass(cls.border_e_primary_1)
  def border_e_primary_2: SwStyle = swStyle.addClass(cls.border_e_primary_2)
  def border_e_primary_3: SwStyle = swStyle.addClass(cls.border_e_primary_3)
  def border_e_primary_4: SwStyle = swStyle.addClass(cls.border_e_primary_4)
  def border_e_primary_5: SwStyle = swStyle.addClass(cls.border_e_primary_5)
  def border_e_success_1: SwStyle = swStyle.addClass(cls.border_e_success_1)
  def border_e_success_2: SwStyle = swStyle.addClass(cls.border_e_success_2)
  def border_e_success_3: SwStyle = swStyle.addClass(cls.border_e_success_3)
  def border_e_success_4: SwStyle = swStyle.addClass(cls.border_e_success_4)
  def border_e_success_5: SwStyle = swStyle.addClass(cls.border_e_success_5)
  def border_e_warning_1: SwStyle = swStyle.addClass(cls.border_e_warning_1)
  def border_e_warning_2: SwStyle = swStyle.addClass(cls.border_e_warning_2)
  def border_e_warning_3: SwStyle = swStyle.addClass(cls.border_e_warning_3)
  def border_e_warning_4: SwStyle = swStyle.addClass(cls.border_e_warning_4)
  def border_e_warning_5: SwStyle = swStyle.addClass(cls.border_e_warning_5)
  def border_e_transparent: SwStyle = swStyle.addClass(cls.border_e_transparent)
  def border_e_current: SwStyle = swStyle.addClass(cls.border_e_current)
  def border_e_inherit: SwStyle = swStyle.addClass(cls.border_e_inherit)
  def border_e_custom_1: SwStyle = swStyle.addClass(cls.border_e_custom_1)
  def border_e_custom_2: SwStyle = swStyle.addClass(cls.border_e_custom_2)
  def border_e_custom_3: SwStyle = swStyle.addClass(cls.border_e_custom_3)
  def border_e_custom_4: SwStyle = swStyle.addClass(cls.border_e_custom_4)
  def border_t_gray_0: SwStyle = swStyle.addClass(cls.border_t_gray_0)
  def border_t_gray_1: SwStyle = swStyle.addClass(cls.border_t_gray_1)
  def border_t_gray_2: SwStyle = swStyle.addClass(cls.border_t_gray_2)
  def border_t_gray_3: SwStyle = swStyle.addClass(cls.border_t_gray_3)
  def border_t_gray_4: SwStyle = swStyle.addClass(cls.border_t_gray_4)
  def border_t_gray_5: SwStyle = swStyle.addClass(cls.border_t_gray_5)
  def border_t_gray_6: SwStyle = swStyle.addClass(cls.border_t_gray_6)
  def border_t_gray_7: SwStyle = swStyle.addClass(cls.border_t_gray_7)
  def border_t_gray_8: SwStyle = swStyle.addClass(cls.border_t_gray_8)
  def border_t_gray_9: SwStyle = swStyle.addClass(cls.border_t_gray_9)
  def border_t_danger_1: SwStyle = swStyle.addClass(cls.border_t_danger_1)
  def border_t_danger_2: SwStyle = swStyle.addClass(cls.border_t_danger_2)
  def border_t_danger_3: SwStyle = swStyle.addClass(cls.border_t_danger_3)
  def border_t_danger_4: SwStyle = swStyle.addClass(cls.border_t_danger_4)
  def border_t_danger_5: SwStyle = swStyle.addClass(cls.border_t_danger_5)
  def border_t_primary_1: SwStyle = swStyle.addClass(cls.border_t_primary_1)
  def border_t_primary_2: SwStyle = swStyle.addClass(cls.border_t_primary_2)
  def border_t_primary_3: SwStyle = swStyle.addClass(cls.border_t_primary_3)
  def border_t_primary_4: SwStyle = swStyle.addClass(cls.border_t_primary_4)
  def border_t_primary_5: SwStyle = swStyle.addClass(cls.border_t_primary_5)
  def border_t_success_1: SwStyle = swStyle.addClass(cls.border_t_success_1)
  def border_t_success_2: SwStyle = swStyle.addClass(cls.border_t_success_2)
  def border_t_success_3: SwStyle = swStyle.addClass(cls.border_t_success_3)
  def border_t_success_4: SwStyle = swStyle.addClass(cls.border_t_success_4)
  def border_t_success_5: SwStyle = swStyle.addClass(cls.border_t_success_5)
  def border_t_warning_1: SwStyle = swStyle.addClass(cls.border_t_warning_1)
  def border_t_warning_2: SwStyle = swStyle.addClass(cls.border_t_warning_2)
  def border_t_warning_3: SwStyle = swStyle.addClass(cls.border_t_warning_3)
  def border_t_warning_4: SwStyle = swStyle.addClass(cls.border_t_warning_4)
  def border_t_warning_5: SwStyle = swStyle.addClass(cls.border_t_warning_5)
  def border_t_transparent: SwStyle = swStyle.addClass(cls.border_t_transparent)
  def border_t_current: SwStyle = swStyle.addClass(cls.border_t_current)
  def border_t_inherit: SwStyle = swStyle.addClass(cls.border_t_inherit)
  def border_t_custom_1: SwStyle = swStyle.addClass(cls.border_t_custom_1)
  def border_t_custom_2: SwStyle = swStyle.addClass(cls.border_t_custom_2)
  def border_t_custom_3: SwStyle = swStyle.addClass(cls.border_t_custom_3)
  def border_t_custom_4: SwStyle = swStyle.addClass(cls.border_t_custom_4)
  def border_r_gray_0: SwStyle = swStyle.addClass(cls.border_r_gray_0)
  def border_r_gray_1: SwStyle = swStyle.addClass(cls.border_r_gray_1)
  def border_r_gray_2: SwStyle = swStyle.addClass(cls.border_r_gray_2)
  def border_r_gray_3: SwStyle = swStyle.addClass(cls.border_r_gray_3)
  def border_r_gray_4: SwStyle = swStyle.addClass(cls.border_r_gray_4)
  def border_r_gray_5: SwStyle = swStyle.addClass(cls.border_r_gray_5)
  def border_r_gray_6: SwStyle = swStyle.addClass(cls.border_r_gray_6)
  def border_r_gray_7: SwStyle = swStyle.addClass(cls.border_r_gray_7)
  def border_r_gray_8: SwStyle = swStyle.addClass(cls.border_r_gray_8)
  def border_r_gray_9: SwStyle = swStyle.addClass(cls.border_r_gray_9)
  def border_r_danger_1: SwStyle = swStyle.addClass(cls.border_r_danger_1)
  def border_r_danger_2: SwStyle = swStyle.addClass(cls.border_r_danger_2)
  def border_r_danger_3: SwStyle = swStyle.addClass(cls.border_r_danger_3)
  def border_r_danger_4: SwStyle = swStyle.addClass(cls.border_r_danger_4)
  def border_r_danger_5: SwStyle = swStyle.addClass(cls.border_r_danger_5)
  def border_r_primary_1: SwStyle = swStyle.addClass(cls.border_r_primary_1)
  def border_r_primary_2: SwStyle = swStyle.addClass(cls.border_r_primary_2)
  def border_r_primary_3: SwStyle = swStyle.addClass(cls.border_r_primary_3)
  def border_r_primary_4: SwStyle = swStyle.addClass(cls.border_r_primary_4)
  def border_r_primary_5: SwStyle = swStyle.addClass(cls.border_r_primary_5)
  def border_r_success_1: SwStyle = swStyle.addClass(cls.border_r_success_1)
  def border_r_success_2: SwStyle = swStyle.addClass(cls.border_r_success_2)
  def border_r_success_3: SwStyle = swStyle.addClass(cls.border_r_success_3)
  def border_r_success_4: SwStyle = swStyle.addClass(cls.border_r_success_4)
  def border_r_success_5: SwStyle = swStyle.addClass(cls.border_r_success_5)
  def border_r_warning_1: SwStyle = swStyle.addClass(cls.border_r_warning_1)
  def border_r_warning_2: SwStyle = swStyle.addClass(cls.border_r_warning_2)
  def border_r_warning_3: SwStyle = swStyle.addClass(cls.border_r_warning_3)
  def border_r_warning_4: SwStyle = swStyle.addClass(cls.border_r_warning_4)
  def border_r_warning_5: SwStyle = swStyle.addClass(cls.border_r_warning_5)
  def border_r_transparent: SwStyle = swStyle.addClass(cls.border_r_transparent)
  def border_r_current: SwStyle = swStyle.addClass(cls.border_r_current)
  def border_r_inherit: SwStyle = swStyle.addClass(cls.border_r_inherit)
  def border_r_custom_1: SwStyle = swStyle.addClass(cls.border_r_custom_1)
  def border_r_custom_2: SwStyle = swStyle.addClass(cls.border_r_custom_2)
  def border_r_custom_3: SwStyle = swStyle.addClass(cls.border_r_custom_3)
  def border_r_custom_4: SwStyle = swStyle.addClass(cls.border_r_custom_4)
  def border_b_gray_0: SwStyle = swStyle.addClass(cls.border_b_gray_0)
  def border_b_gray_1: SwStyle = swStyle.addClass(cls.border_b_gray_1)
  def border_b_gray_2: SwStyle = swStyle.addClass(cls.border_b_gray_2)
  def border_b_gray_3: SwStyle = swStyle.addClass(cls.border_b_gray_3)
  def border_b_gray_4: SwStyle = swStyle.addClass(cls.border_b_gray_4)
  def border_b_gray_5: SwStyle = swStyle.addClass(cls.border_b_gray_5)
  def border_b_gray_6: SwStyle = swStyle.addClass(cls.border_b_gray_6)
  def border_b_gray_7: SwStyle = swStyle.addClass(cls.border_b_gray_7)
  def border_b_gray_8: SwStyle = swStyle.addClass(cls.border_b_gray_8)
  def border_b_gray_9: SwStyle = swStyle.addClass(cls.border_b_gray_9)
  def border_b_danger_1: SwStyle = swStyle.addClass(cls.border_b_danger_1)
  def border_b_danger_2: SwStyle = swStyle.addClass(cls.border_b_danger_2)
  def border_b_danger_3: SwStyle = swStyle.addClass(cls.border_b_danger_3)
  def border_b_danger_4: SwStyle = swStyle.addClass(cls.border_b_danger_4)
  def border_b_danger_5: SwStyle = swStyle.addClass(cls.border_b_danger_5)
  def border_b_primary_1: SwStyle = swStyle.addClass(cls.border_b_primary_1)
  def border_b_primary_2: SwStyle = swStyle.addClass(cls.border_b_primary_2)
  def border_b_primary_3: SwStyle = swStyle.addClass(cls.border_b_primary_3)
  def border_b_primary_4: SwStyle = swStyle.addClass(cls.border_b_primary_4)
  def border_b_primary_5: SwStyle = swStyle.addClass(cls.border_b_primary_5)
  def border_b_success_1: SwStyle = swStyle.addClass(cls.border_b_success_1)
  def border_b_success_2: SwStyle = swStyle.addClass(cls.border_b_success_2)
  def border_b_success_3: SwStyle = swStyle.addClass(cls.border_b_success_3)
  def border_b_success_4: SwStyle = swStyle.addClass(cls.border_b_success_4)
  def border_b_success_5: SwStyle = swStyle.addClass(cls.border_b_success_5)
  def border_b_warning_1: SwStyle = swStyle.addClass(cls.border_b_warning_1)
  def border_b_warning_2: SwStyle = swStyle.addClass(cls.border_b_warning_2)
  def border_b_warning_3: SwStyle = swStyle.addClass(cls.border_b_warning_3)
  def border_b_warning_4: SwStyle = swStyle.addClass(cls.border_b_warning_4)
  def border_b_warning_5: SwStyle = swStyle.addClass(cls.border_b_warning_5)
  def border_b_transparent: SwStyle = swStyle.addClass(cls.border_b_transparent)
  def border_b_current: SwStyle = swStyle.addClass(cls.border_b_current)
  def border_b_inherit: SwStyle = swStyle.addClass(cls.border_b_inherit)
  def border_b_custom_1: SwStyle = swStyle.addClass(cls.border_b_custom_1)
  def border_b_custom_2: SwStyle = swStyle.addClass(cls.border_b_custom_2)
  def border_b_custom_3: SwStyle = swStyle.addClass(cls.border_b_custom_3)
  def border_b_custom_4: SwStyle = swStyle.addClass(cls.border_b_custom_4)
  def border_l_gray_0: SwStyle = swStyle.addClass(cls.border_l_gray_0)
  def border_l_gray_1: SwStyle = swStyle.addClass(cls.border_l_gray_1)
  def border_l_gray_2: SwStyle = swStyle.addClass(cls.border_l_gray_2)
  def border_l_gray_3: SwStyle = swStyle.addClass(cls.border_l_gray_3)
  def border_l_gray_4: SwStyle = swStyle.addClass(cls.border_l_gray_4)
  def border_l_gray_5: SwStyle = swStyle.addClass(cls.border_l_gray_5)
  def border_l_gray_6: SwStyle = swStyle.addClass(cls.border_l_gray_6)
  def border_l_gray_7: SwStyle = swStyle.addClass(cls.border_l_gray_7)
  def border_l_gray_8: SwStyle = swStyle.addClass(cls.border_l_gray_8)
  def border_l_gray_9: SwStyle = swStyle.addClass(cls.border_l_gray_9)
  def border_l_danger_1: SwStyle = swStyle.addClass(cls.border_l_danger_1)
  def border_l_danger_2: SwStyle = swStyle.addClass(cls.border_l_danger_2)
  def border_l_danger_3: SwStyle = swStyle.addClass(cls.border_l_danger_3)
  def border_l_danger_4: SwStyle = swStyle.addClass(cls.border_l_danger_4)
  def border_l_danger_5: SwStyle = swStyle.addClass(cls.border_l_danger_5)
  def border_l_primary_1: SwStyle = swStyle.addClass(cls.border_l_primary_1)
  def border_l_primary_2: SwStyle = swStyle.addClass(cls.border_l_primary_2)
  def border_l_primary_3: SwStyle = swStyle.addClass(cls.border_l_primary_3)
  def border_l_primary_4: SwStyle = swStyle.addClass(cls.border_l_primary_4)
  def border_l_primary_5: SwStyle = swStyle.addClass(cls.border_l_primary_5)
  def border_l_success_1: SwStyle = swStyle.addClass(cls.border_l_success_1)
  def border_l_success_2: SwStyle = swStyle.addClass(cls.border_l_success_2)
  def border_l_success_3: SwStyle = swStyle.addClass(cls.border_l_success_3)
  def border_l_success_4: SwStyle = swStyle.addClass(cls.border_l_success_4)
  def border_l_success_5: SwStyle = swStyle.addClass(cls.border_l_success_5)
  def border_l_warning_1: SwStyle = swStyle.addClass(cls.border_l_warning_1)
  def border_l_warning_2: SwStyle = swStyle.addClass(cls.border_l_warning_2)
  def border_l_warning_3: SwStyle = swStyle.addClass(cls.border_l_warning_3)
  def border_l_warning_4: SwStyle = swStyle.addClass(cls.border_l_warning_4)
  def border_l_warning_5: SwStyle = swStyle.addClass(cls.border_l_warning_5)
  def border_l_transparent: SwStyle = swStyle.addClass(cls.border_l_transparent)
  def border_l_current: SwStyle = swStyle.addClass(cls.border_l_current)
  def border_l_inherit: SwStyle = swStyle.addClass(cls.border_l_inherit)
  def border_l_custom_1: SwStyle = swStyle.addClass(cls.border_l_custom_1)
  def border_l_custom_2: SwStyle = swStyle.addClass(cls.border_l_custom_2)
  def border_l_custom_3: SwStyle = swStyle.addClass(cls.border_l_custom_3)
  def border_l_custom_4: SwStyle = swStyle.addClass(cls.border_l_custom_4)
  def border_opacity_0: SwStyle = swStyle.addClass(cls.border_opacity_0)
  def border_opacity_10: SwStyle = swStyle.addClass(cls.border_opacity_10)
  def border_opacity_20: SwStyle = swStyle.addClass(cls.border_opacity_20)
  def border_opacity_30: SwStyle = swStyle.addClass(cls.border_opacity_30)
  def border_opacity_40: SwStyle = swStyle.addClass(cls.border_opacity_40)
  def border_opacity_50: SwStyle = swStyle.addClass(cls.border_opacity_50)
  def border_opacity_60: SwStyle = swStyle.addClass(cls.border_opacity_60)
  def border_opacity_70: SwStyle = swStyle.addClass(cls.border_opacity_70)
  def border_opacity_80: SwStyle = swStyle.addClass(cls.border_opacity_80)
  def border_opacity_90: SwStyle = swStyle.addClass(cls.border_opacity_90)
  def border_opacity_100: SwStyle = swStyle.addClass(cls.border_opacity_100)
  def bg_gray_0: SwStyle = swStyle.addClass(cls.bg_gray_0)
  def bg_gray_1: SwStyle = swStyle.addClass(cls.bg_gray_1)
  def bg_gray_2: SwStyle = swStyle.addClass(cls.bg_gray_2)
  def bg_gray_3: SwStyle = swStyle.addClass(cls.bg_gray_3)
  def bg_gray_4: SwStyle = swStyle.addClass(cls.bg_gray_4)
  def bg_gray_5: SwStyle = swStyle.addClass(cls.bg_gray_5)
  def bg_gray_6: SwStyle = swStyle.addClass(cls.bg_gray_6)
  def bg_gray_7: SwStyle = swStyle.addClass(cls.bg_gray_7)
  def bg_gray_8: SwStyle = swStyle.addClass(cls.bg_gray_8)
  def bg_gray_9: SwStyle = swStyle.addClass(cls.bg_gray_9)
  def bg_danger_1: SwStyle = swStyle.addClass(cls.bg_danger_1)
  def bg_danger_2: SwStyle = swStyle.addClass(cls.bg_danger_2)
  def bg_danger_3: SwStyle = swStyle.addClass(cls.bg_danger_3)
  def bg_danger_4: SwStyle = swStyle.addClass(cls.bg_danger_4)
  def bg_danger_5: SwStyle = swStyle.addClass(cls.bg_danger_5)
  def bg_primary_1: SwStyle = swStyle.addClass(cls.bg_primary_1)
  def bg_primary_2: SwStyle = swStyle.addClass(cls.bg_primary_2)
  def bg_primary_3: SwStyle = swStyle.addClass(cls.bg_primary_3)
  def bg_primary_4: SwStyle = swStyle.addClass(cls.bg_primary_4)
  def bg_primary_5: SwStyle = swStyle.addClass(cls.bg_primary_5)
  def bg_success_1: SwStyle = swStyle.addClass(cls.bg_success_1)
  def bg_success_2: SwStyle = swStyle.addClass(cls.bg_success_2)
  def bg_success_3: SwStyle = swStyle.addClass(cls.bg_success_3)
  def bg_success_4: SwStyle = swStyle.addClass(cls.bg_success_4)
  def bg_success_5: SwStyle = swStyle.addClass(cls.bg_success_5)
  def bg_warning_1: SwStyle = swStyle.addClass(cls.bg_warning_1)
  def bg_warning_2: SwStyle = swStyle.addClass(cls.bg_warning_2)
  def bg_warning_3: SwStyle = swStyle.addClass(cls.bg_warning_3)
  def bg_warning_4: SwStyle = swStyle.addClass(cls.bg_warning_4)
  def bg_warning_5: SwStyle = swStyle.addClass(cls.bg_warning_5)
  def bg_transparent: SwStyle = swStyle.addClass(cls.bg_transparent)
  def bg_current: SwStyle = swStyle.addClass(cls.bg_current)
  def bg_inherit: SwStyle = swStyle.addClass(cls.bg_inherit)
  def bg_custom_1: SwStyle = swStyle.addClass(cls.bg_custom_1)
  def bg_custom_2: SwStyle = swStyle.addClass(cls.bg_custom_2)
  def bg_custom_3: SwStyle = swStyle.addClass(cls.bg_custom_3)
  def bg_custom_4: SwStyle = swStyle.addClass(cls.bg_custom_4)
  def bg_opacity_0: SwStyle = swStyle.addClass(cls.bg_opacity_0)
  def bg_opacity_10: SwStyle = swStyle.addClass(cls.bg_opacity_10)
  def bg_opacity_20: SwStyle = swStyle.addClass(cls.bg_opacity_20)
  def bg_opacity_30: SwStyle = swStyle.addClass(cls.bg_opacity_30)
  def bg_opacity_40: SwStyle = swStyle.addClass(cls.bg_opacity_40)
  def bg_opacity_50: SwStyle = swStyle.addClass(cls.bg_opacity_50)
  def bg_opacity_60: SwStyle = swStyle.addClass(cls.bg_opacity_60)
  def bg_opacity_70: SwStyle = swStyle.addClass(cls.bg_opacity_70)
  def bg_opacity_80: SwStyle = swStyle.addClass(cls.bg_opacity_80)
  def bg_opacity_90: SwStyle = swStyle.addClass(cls.bg_opacity_90)
  def bg_opacity_100: SwStyle = swStyle.addClass(cls.bg_opacity_100)
  def bg_clip_border: SwStyle = swStyle.addClass(cls.bg_clip_border)
  def bg_clip_padding: SwStyle = swStyle.addClass(cls.bg_clip_padding)
  def bg_clip_content: SwStyle = swStyle.addClass(cls.bg_clip_content)
  def bg_clip_text: SwStyle = swStyle.addClass(cls.bg_clip_text)
  def bg_origin_border: SwStyle = swStyle.addClass(cls.bg_origin_border)
  def bg_origin_padding: SwStyle = swStyle.addClass(cls.bg_origin_padding)
  def bg_origin_content: SwStyle = swStyle.addClass(cls.bg_origin_content)
  def p_0: SwStyle = swStyle.addClass(cls.p_0)
  def p_2: SwStyle = swStyle.addClass(cls.p_2)
  def p_4: SwStyle = swStyle.addClass(cls.p_4)
  def p_6: SwStyle = swStyle.addClass(cls.p_6)
  def p_8: SwStyle = swStyle.addClass(cls.p_8)
  def p_12: SwStyle = swStyle.addClass(cls.p_12)
  def p_16: SwStyle = swStyle.addClass(cls.p_16)
  def p_20: SwStyle = swStyle.addClass(cls.p_20)
  def p_24: SwStyle = swStyle.addClass(cls.p_24)
  def p_32: SwStyle = swStyle.addClass(cls.p_32)
  def p_40: SwStyle = swStyle.addClass(cls.p_40)
  def p_48: SwStyle = swStyle.addClass(cls.p_48)
  def px_0: SwStyle = swStyle.addClass(cls.px_0)
  def px_2: SwStyle = swStyle.addClass(cls.px_2)
  def px_4: SwStyle = swStyle.addClass(cls.px_4)
  def px_6: SwStyle = swStyle.addClass(cls.px_6)
  def px_8: SwStyle = swStyle.addClass(cls.px_8)
  def px_12: SwStyle = swStyle.addClass(cls.px_12)
  def px_16: SwStyle = swStyle.addClass(cls.px_16)
  def px_20: SwStyle = swStyle.addClass(cls.px_20)
  def px_24: SwStyle = swStyle.addClass(cls.px_24)
  def px_32: SwStyle = swStyle.addClass(cls.px_32)
  def px_40: SwStyle = swStyle.addClass(cls.px_40)
  def px_48: SwStyle = swStyle.addClass(cls.px_48)
  def py_0: SwStyle = swStyle.addClass(cls.py_0)
  def py_2: SwStyle = swStyle.addClass(cls.py_2)
  def py_4: SwStyle = swStyle.addClass(cls.py_4)
  def py_6: SwStyle = swStyle.addClass(cls.py_6)
  def py_8: SwStyle = swStyle.addClass(cls.py_8)
  def py_12: SwStyle = swStyle.addClass(cls.py_12)
  def py_16: SwStyle = swStyle.addClass(cls.py_16)
  def py_20: SwStyle = swStyle.addClass(cls.py_20)
  def py_24: SwStyle = swStyle.addClass(cls.py_24)
  def py_32: SwStyle = swStyle.addClass(cls.py_32)
  def py_40: SwStyle = swStyle.addClass(cls.py_40)
  def py_48: SwStyle = swStyle.addClass(cls.py_48)
  def ps_0: SwStyle = swStyle.addClass(cls.ps_0)
  def ps_2: SwStyle = swStyle.addClass(cls.ps_2)
  def ps_4: SwStyle = swStyle.addClass(cls.ps_4)
  def ps_6: SwStyle = swStyle.addClass(cls.ps_6)
  def ps_8: SwStyle = swStyle.addClass(cls.ps_8)
  def ps_12: SwStyle = swStyle.addClass(cls.ps_12)
  def ps_16: SwStyle = swStyle.addClass(cls.ps_16)
  def ps_20: SwStyle = swStyle.addClass(cls.ps_20)
  def ps_24: SwStyle = swStyle.addClass(cls.ps_24)
  def ps_32: SwStyle = swStyle.addClass(cls.ps_32)
  def ps_40: SwStyle = swStyle.addClass(cls.ps_40)
  def ps_48: SwStyle = swStyle.addClass(cls.ps_48)
  def pe_0: SwStyle = swStyle.addClass(cls.pe_0)
  def pe_2: SwStyle = swStyle.addClass(cls.pe_2)
  def pe_4: SwStyle = swStyle.addClass(cls.pe_4)
  def pe_6: SwStyle = swStyle.addClass(cls.pe_6)
  def pe_8: SwStyle = swStyle.addClass(cls.pe_8)
  def pe_12: SwStyle = swStyle.addClass(cls.pe_12)
  def pe_16: SwStyle = swStyle.addClass(cls.pe_16)
  def pe_20: SwStyle = swStyle.addClass(cls.pe_20)
  def pe_24: SwStyle = swStyle.addClass(cls.pe_24)
  def pe_32: SwStyle = swStyle.addClass(cls.pe_32)
  def pe_40: SwStyle = swStyle.addClass(cls.pe_40)
  def pe_48: SwStyle = swStyle.addClass(cls.pe_48)
  def pt_0: SwStyle = swStyle.addClass(cls.pt_0)
  def pt_2: SwStyle = swStyle.addClass(cls.pt_2)
  def pt_4: SwStyle = swStyle.addClass(cls.pt_4)
  def pt_6: SwStyle = swStyle.addClass(cls.pt_6)
  def pt_8: SwStyle = swStyle.addClass(cls.pt_8)
  def pt_12: SwStyle = swStyle.addClass(cls.pt_12)
  def pt_16: SwStyle = swStyle.addClass(cls.pt_16)
  def pt_20: SwStyle = swStyle.addClass(cls.pt_20)
  def pt_24: SwStyle = swStyle.addClass(cls.pt_24)
  def pt_32: SwStyle = swStyle.addClass(cls.pt_32)
  def pt_40: SwStyle = swStyle.addClass(cls.pt_40)
  def pt_48: SwStyle = swStyle.addClass(cls.pt_48)
  def pr_0: SwStyle = swStyle.addClass(cls.pr_0)
  def pr_2: SwStyle = swStyle.addClass(cls.pr_2)
  def pr_4: SwStyle = swStyle.addClass(cls.pr_4)
  def pr_6: SwStyle = swStyle.addClass(cls.pr_6)
  def pr_8: SwStyle = swStyle.addClass(cls.pr_8)
  def pr_12: SwStyle = swStyle.addClass(cls.pr_12)
  def pr_16: SwStyle = swStyle.addClass(cls.pr_16)
  def pr_20: SwStyle = swStyle.addClass(cls.pr_20)
  def pr_24: SwStyle = swStyle.addClass(cls.pr_24)
  def pr_32: SwStyle = swStyle.addClass(cls.pr_32)
  def pr_40: SwStyle = swStyle.addClass(cls.pr_40)
  def pr_48: SwStyle = swStyle.addClass(cls.pr_48)
  def pb_0: SwStyle = swStyle.addClass(cls.pb_0)
  def pb_2: SwStyle = swStyle.addClass(cls.pb_2)
  def pb_4: SwStyle = swStyle.addClass(cls.pb_4)
  def pb_6: SwStyle = swStyle.addClass(cls.pb_6)
  def pb_8: SwStyle = swStyle.addClass(cls.pb_8)
  def pb_12: SwStyle = swStyle.addClass(cls.pb_12)
  def pb_16: SwStyle = swStyle.addClass(cls.pb_16)
  def pb_20: SwStyle = swStyle.addClass(cls.pb_20)
  def pb_24: SwStyle = swStyle.addClass(cls.pb_24)
  def pb_32: SwStyle = swStyle.addClass(cls.pb_32)
  def pb_40: SwStyle = swStyle.addClass(cls.pb_40)
  def pb_48: SwStyle = swStyle.addClass(cls.pb_48)
  def pl_0: SwStyle = swStyle.addClass(cls.pl_0)
  def pl_2: SwStyle = swStyle.addClass(cls.pl_2)
  def pl_4: SwStyle = swStyle.addClass(cls.pl_4)
  def pl_6: SwStyle = swStyle.addClass(cls.pl_6)
  def pl_8: SwStyle = swStyle.addClass(cls.pl_8)
  def pl_12: SwStyle = swStyle.addClass(cls.pl_12)
  def pl_16: SwStyle = swStyle.addClass(cls.pl_16)
  def pl_20: SwStyle = swStyle.addClass(cls.pl_20)
  def pl_24: SwStyle = swStyle.addClass(cls.pl_24)
  def pl_32: SwStyle = swStyle.addClass(cls.pl_32)
  def pl_40: SwStyle = swStyle.addClass(cls.pl_40)
  def pl_48: SwStyle = swStyle.addClass(cls.pl_48)
  def text_left: SwStyle = swStyle.addClass(cls.text_left)
  def text_center: SwStyle = swStyle.addClass(cls.text_center)
  def text_right: SwStyle = swStyle.addClass(cls.text_right)
  def text_justify: SwStyle = swStyle.addClass(cls.text_justify)
  def text_start: SwStyle = swStyle.addClass(cls.text_start)
  def text_end: SwStyle = swStyle.addClass(cls.text_end)
  def indent_0: SwStyle = swStyle.addClass(cls.indent_0)
  def indent_2: SwStyle = swStyle.addClass(cls.indent_2)
  def indent_4: SwStyle = swStyle.addClass(cls.indent_4)
  def indent_6: SwStyle = swStyle.addClass(cls.indent_6)
  def indent_8: SwStyle = swStyle.addClass(cls.indent_8)
  def indent_12: SwStyle = swStyle.addClass(cls.indent_12)
  def indent_16: SwStyle = swStyle.addClass(cls.indent_16)
  def indent_20: SwStyle = swStyle.addClass(cls.indent_20)
  def indent_24: SwStyle = swStyle.addClass(cls.indent_24)
  def indent_32: SwStyle = swStyle.addClass(cls.indent_32)
  def indent_40: SwStyle = swStyle.addClass(cls.indent_40)
  def indent_48: SwStyle = swStyle.addClass(cls.indent_48)
  def _indent_0: SwStyle = swStyle.addClass(cls._indent_0)
  def _indent_2: SwStyle = swStyle.addClass(cls._indent_2)
  def _indent_4: SwStyle = swStyle.addClass(cls._indent_4)
  def _indent_6: SwStyle = swStyle.addClass(cls._indent_6)
  def _indent_8: SwStyle = swStyle.addClass(cls._indent_8)
  def _indent_12: SwStyle = swStyle.addClass(cls._indent_12)
  def _indent_16: SwStyle = swStyle.addClass(cls._indent_16)
  def _indent_20: SwStyle = swStyle.addClass(cls._indent_20)
  def _indent_24: SwStyle = swStyle.addClass(cls._indent_24)
  def _indent_32: SwStyle = swStyle.addClass(cls._indent_32)
  def _indent_40: SwStyle = swStyle.addClass(cls._indent_40)
  def _indent_48: SwStyle = swStyle.addClass(cls._indent_48)
  def align_baseline: SwStyle = swStyle.addClass(cls.align_baseline)
  def align_top: SwStyle = swStyle.addClass(cls.align_top)
  def align_middle: SwStyle = swStyle.addClass(cls.align_middle)
  def align_bottom: SwStyle = swStyle.addClass(cls.align_bottom)
  def align_text_top: SwStyle = swStyle.addClass(cls.align_text_top)
  def align_text_bottom: SwStyle = swStyle.addClass(cls.align_text_bottom)
  def align_sub: SwStyle = swStyle.addClass(cls.align_sub)
  def align_super: SwStyle = swStyle.addClass(cls.align_super)
  def font_sans: SwStyle = swStyle.addClass(cls.font_sans)
  def font_mono: SwStyle = swStyle.addClass(cls.font_mono)
  def text_9: SwStyle = swStyle.addClass(cls.text_9)
  def text_10: SwStyle = swStyle.addClass(cls.text_10)
  def text_11: SwStyle = swStyle.addClass(cls.text_11)
  def text_13: SwStyle = swStyle.addClass(cls.text_13)
  def text_15: SwStyle = swStyle.addClass(cls.text_15)
  def text_17: SwStyle = swStyle.addClass(cls.text_17)
  def text_20: SwStyle = swStyle.addClass(cls.text_20)
  def text_23: SwStyle = swStyle.addClass(cls.text_23)
  def text_26: SwStyle = swStyle.addClass(cls.text_26)
  def text_30: SwStyle = swStyle.addClass(cls.text_30)
  def text_35: SwStyle = swStyle.addClass(cls.text_35)
  def text_custom_1: SwStyle = swStyle.addClass(cls.text_custom_1)
  def font_normal: SwStyle = swStyle.addClass(cls.font_normal)
  def font_medium: SwStyle = swStyle.addClass(cls.font_medium)
  def font_semi_bold: SwStyle = swStyle.addClass(cls.font_semi_bold)
  def font_bold: SwStyle = swStyle.addClass(cls.font_bold)
  def uppercase: SwStyle = swStyle.addClass(cls.uppercase)
  def lowercase: SwStyle = swStyle.addClass(cls.lowercase)
  def capitalize: SwStyle = swStyle.addClass(cls.capitalize)
  def normal_case: SwStyle = swStyle.addClass(cls.normal_case)
  def italic: SwStyle = swStyle.addClass(cls.italic)
  def not_italic: SwStyle = swStyle.addClass(cls.not_italic)
  def normal_nums: SwStyle = swStyle.addClass(cls.normal_nums)
  def ordinal: SwStyle = swStyle.addClass(cls.ordinal)
  def slashed_zero: SwStyle = swStyle.addClass(cls.slashed_zero)
  def lining_nums: SwStyle = swStyle.addClass(cls.lining_nums)
  def oldstyle_nums: SwStyle = swStyle.addClass(cls.oldstyle_nums)
  def proportional_nums: SwStyle = swStyle.addClass(cls.proportional_nums)
  def tabular_nums: SwStyle = swStyle.addClass(cls.tabular_nums)
  def diagonal_fractions: SwStyle = swStyle.addClass(cls.diagonal_fractions)
  def stacked_fractions: SwStyle = swStyle.addClass(cls.stacked_fractions)
  def leading_16: SwStyle = swStyle.addClass(cls.leading_16)
  def leading_20: SwStyle = swStyle.addClass(cls.leading_20)
  def leading_24: SwStyle = swStyle.addClass(cls.leading_24)
  def leading_28: SwStyle = swStyle.addClass(cls.leading_28)
  def leading_32: SwStyle = swStyle.addClass(cls.leading_32)
  def leading_40: SwStyle = swStyle.addClass(cls.leading_40)
  def leading_44: SwStyle = swStyle.addClass(cls.leading_44)
  def leading_r1p5: SwStyle = swStyle.addClass(cls.leading_r1p5)
  def text_gray_0: SwStyle = swStyle.addClass(cls.text_gray_0)
  def text_gray_1: SwStyle = swStyle.addClass(cls.text_gray_1)
  def text_gray_2: SwStyle = swStyle.addClass(cls.text_gray_2)
  def text_gray_3: SwStyle = swStyle.addClass(cls.text_gray_3)
  def text_gray_4: SwStyle = swStyle.addClass(cls.text_gray_4)
  def text_gray_5: SwStyle = swStyle.addClass(cls.text_gray_5)
  def text_gray_6: SwStyle = swStyle.addClass(cls.text_gray_6)
  def text_gray_7: SwStyle = swStyle.addClass(cls.text_gray_7)
  def text_gray_8: SwStyle = swStyle.addClass(cls.text_gray_8)
  def text_gray_9: SwStyle = swStyle.addClass(cls.text_gray_9)
  def text_danger_1: SwStyle = swStyle.addClass(cls.text_danger_1)
  def text_danger_2: SwStyle = swStyle.addClass(cls.text_danger_2)
  def text_danger_3: SwStyle = swStyle.addClass(cls.text_danger_3)
  def text_danger_4: SwStyle = swStyle.addClass(cls.text_danger_4)
  def text_danger_5: SwStyle = swStyle.addClass(cls.text_danger_5)
  def text_primary_1: SwStyle = swStyle.addClass(cls.text_primary_1)
  def text_primary_2: SwStyle = swStyle.addClass(cls.text_primary_2)
  def text_primary_3: SwStyle = swStyle.addClass(cls.text_primary_3)
  def text_primary_4: SwStyle = swStyle.addClass(cls.text_primary_4)
  def text_primary_5: SwStyle = swStyle.addClass(cls.text_primary_5)
  def text_success_1: SwStyle = swStyle.addClass(cls.text_success_1)
  def text_success_2: SwStyle = swStyle.addClass(cls.text_success_2)
  def text_success_3: SwStyle = swStyle.addClass(cls.text_success_3)
  def text_success_4: SwStyle = swStyle.addClass(cls.text_success_4)
  def text_success_5: SwStyle = swStyle.addClass(cls.text_success_5)
  def text_warning_1: SwStyle = swStyle.addClass(cls.text_warning_1)
  def text_warning_2: SwStyle = swStyle.addClass(cls.text_warning_2)
  def text_warning_3: SwStyle = swStyle.addClass(cls.text_warning_3)
  def text_warning_4: SwStyle = swStyle.addClass(cls.text_warning_4)
  def text_warning_5: SwStyle = swStyle.addClass(cls.text_warning_5)
  def text_transparent: SwStyle = swStyle.addClass(cls.text_transparent)
  def text_current: SwStyle = swStyle.addClass(cls.text_current)
  def text_inherit: SwStyle = swStyle.addClass(cls.text_inherit)
  def text_custom_1: SwStyle = swStyle.addClass(cls.text_custom_1)
  def text_custom_2: SwStyle = swStyle.addClass(cls.text_custom_2)
  def text_custom_3: SwStyle = swStyle.addClass(cls.text_custom_3)
  def text_custom_4: SwStyle = swStyle.addClass(cls.text_custom_4)
  def text_opacity_0: SwStyle = swStyle.addClass(cls.text_opacity_0)
  def text_opacity_10: SwStyle = swStyle.addClass(cls.text_opacity_10)
  def text_opacity_20: SwStyle = swStyle.addClass(cls.text_opacity_20)
  def text_opacity_30: SwStyle = swStyle.addClass(cls.text_opacity_30)
  def text_opacity_40: SwStyle = swStyle.addClass(cls.text_opacity_40)
  def text_opacity_50: SwStyle = swStyle.addClass(cls.text_opacity_50)
  def text_opacity_60: SwStyle = swStyle.addClass(cls.text_opacity_60)
  def text_opacity_70: SwStyle = swStyle.addClass(cls.text_opacity_70)
  def text_opacity_80: SwStyle = swStyle.addClass(cls.text_opacity_80)
  def text_opacity_90: SwStyle = swStyle.addClass(cls.text_opacity_90)
  def text_opacity_100: SwStyle = swStyle.addClass(cls.text_opacity_100)
  def underline: SwStyle = swStyle.addClass(cls.underline)
  def overline: SwStyle = swStyle.addClass(cls.overline)
  def line_through: SwStyle = swStyle.addClass(cls.line_through)
  def no_underline: SwStyle = swStyle.addClass(cls.no_underline)
  def decoration_gray_0: SwStyle = swStyle.addClass(cls.decoration_gray_0)
  def decoration_gray_1: SwStyle = swStyle.addClass(cls.decoration_gray_1)
  def decoration_gray_2: SwStyle = swStyle.addClass(cls.decoration_gray_2)
  def decoration_gray_3: SwStyle = swStyle.addClass(cls.decoration_gray_3)
  def decoration_gray_4: SwStyle = swStyle.addClass(cls.decoration_gray_4)
  def decoration_gray_5: SwStyle = swStyle.addClass(cls.decoration_gray_5)
  def decoration_gray_6: SwStyle = swStyle.addClass(cls.decoration_gray_6)
  def decoration_gray_7: SwStyle = swStyle.addClass(cls.decoration_gray_7)
  def decoration_gray_8: SwStyle = swStyle.addClass(cls.decoration_gray_8)
  def decoration_gray_9: SwStyle = swStyle.addClass(cls.decoration_gray_9)
  def decoration_danger_1: SwStyle = swStyle.addClass(cls.decoration_danger_1)
  def decoration_danger_2: SwStyle = swStyle.addClass(cls.decoration_danger_2)
  def decoration_danger_3: SwStyle = swStyle.addClass(cls.decoration_danger_3)
  def decoration_danger_4: SwStyle = swStyle.addClass(cls.decoration_danger_4)
  def decoration_danger_5: SwStyle = swStyle.addClass(cls.decoration_danger_5)
  def decoration_primary_1: SwStyle = swStyle.addClass(cls.decoration_primary_1)
  def decoration_primary_2: SwStyle = swStyle.addClass(cls.decoration_primary_2)
  def decoration_primary_3: SwStyle = swStyle.addClass(cls.decoration_primary_3)
  def decoration_primary_4: SwStyle = swStyle.addClass(cls.decoration_primary_4)
  def decoration_primary_5: SwStyle = swStyle.addClass(cls.decoration_primary_5)
  def decoration_success_1: SwStyle = swStyle.addClass(cls.decoration_success_1)
  def decoration_success_2: SwStyle = swStyle.addClass(cls.decoration_success_2)
  def decoration_success_3: SwStyle = swStyle.addClass(cls.decoration_success_3)
  def decoration_success_4: SwStyle = swStyle.addClass(cls.decoration_success_4)
  def decoration_success_5: SwStyle = swStyle.addClass(cls.decoration_success_5)
  def decoration_warning_1: SwStyle = swStyle.addClass(cls.decoration_warning_1)
  def decoration_warning_2: SwStyle = swStyle.addClass(cls.decoration_warning_2)
  def decoration_warning_3: SwStyle = swStyle.addClass(cls.decoration_warning_3)
  def decoration_warning_4: SwStyle = swStyle.addClass(cls.decoration_warning_4)
  def decoration_warning_5: SwStyle = swStyle.addClass(cls.decoration_warning_5)
  def decoration_transparent: SwStyle = swStyle.addClass(cls.decoration_transparent)
  def decoration_current: SwStyle = swStyle.addClass(cls.decoration_current)
  def decoration_inherit: SwStyle = swStyle.addClass(cls.decoration_inherit)
  def decoration_custom_1: SwStyle = swStyle.addClass(cls.decoration_custom_1)
  def decoration_custom_2: SwStyle = swStyle.addClass(cls.decoration_custom_2)
  def decoration_custom_3: SwStyle = swStyle.addClass(cls.decoration_custom_3)
  def decoration_custom_4: SwStyle = swStyle.addClass(cls.decoration_custom_4)
  def decoration_solid: SwStyle = swStyle.addClass(cls.decoration_solid)
  def decoration_double: SwStyle = swStyle.addClass(cls.decoration_double)
  def decoration_dotted: SwStyle = swStyle.addClass(cls.decoration_dotted)
  def decoration_dashed: SwStyle = swStyle.addClass(cls.decoration_dashed)
  def decoration_wavy: SwStyle = swStyle.addClass(cls.decoration_wavy)
  def decoration_0: SwStyle = swStyle.addClass(cls.decoration_0)
  def decoration_1: SwStyle = swStyle.addClass(cls.decoration_1)
  def decoration_2: SwStyle = swStyle.addClass(cls.decoration_2)
  def decoration_4: SwStyle = swStyle.addClass(cls.decoration_4)
  def decoration_8: SwStyle = swStyle.addClass(cls.decoration_8)
  def decoration_auto: SwStyle = swStyle.addClass(cls.decoration_auto)
  def decoration_from_font: SwStyle = swStyle.addClass(cls.decoration_from_font)
  def underline_offset_0: SwStyle = swStyle.addClass(cls.underline_offset_0)
  def underline_offset_1: SwStyle = swStyle.addClass(cls.underline_offset_1)
  def underline_offset_2: SwStyle = swStyle.addClass(cls.underline_offset_2)
  def underline_offset_4: SwStyle = swStyle.addClass(cls.underline_offset_4)
  def underline_offset_8: SwStyle = swStyle.addClass(cls.underline_offset_8)
  def underline_offset_auto: SwStyle = swStyle.addClass(cls.underline_offset_auto)
  def antialiased: SwStyle = swStyle.addClass(cls.antialiased)
  def subpixel_antialiased: SwStyle = swStyle.addClass(cls.subpixel_antialiased)
  def caret_gray_0: SwStyle = swStyle.addClass(cls.caret_gray_0)
  def caret_gray_1: SwStyle = swStyle.addClass(cls.caret_gray_1)
  def caret_gray_2: SwStyle = swStyle.addClass(cls.caret_gray_2)
  def caret_gray_3: SwStyle = swStyle.addClass(cls.caret_gray_3)
  def caret_gray_4: SwStyle = swStyle.addClass(cls.caret_gray_4)
  def caret_gray_5: SwStyle = swStyle.addClass(cls.caret_gray_5)
  def caret_gray_6: SwStyle = swStyle.addClass(cls.caret_gray_6)
  def caret_gray_7: SwStyle = swStyle.addClass(cls.caret_gray_7)
  def caret_gray_8: SwStyle = swStyle.addClass(cls.caret_gray_8)
  def caret_gray_9: SwStyle = swStyle.addClass(cls.caret_gray_9)
  def caret_danger_1: SwStyle = swStyle.addClass(cls.caret_danger_1)
  def caret_danger_2: SwStyle = swStyle.addClass(cls.caret_danger_2)
  def caret_danger_3: SwStyle = swStyle.addClass(cls.caret_danger_3)
  def caret_danger_4: SwStyle = swStyle.addClass(cls.caret_danger_4)
  def caret_danger_5: SwStyle = swStyle.addClass(cls.caret_danger_5)
  def caret_primary_1: SwStyle = swStyle.addClass(cls.caret_primary_1)
  def caret_primary_2: SwStyle = swStyle.addClass(cls.caret_primary_2)
  def caret_primary_3: SwStyle = swStyle.addClass(cls.caret_primary_3)
  def caret_primary_4: SwStyle = swStyle.addClass(cls.caret_primary_4)
  def caret_primary_5: SwStyle = swStyle.addClass(cls.caret_primary_5)
  def caret_success_1: SwStyle = swStyle.addClass(cls.caret_success_1)
  def caret_success_2: SwStyle = swStyle.addClass(cls.caret_success_2)
  def caret_success_3: SwStyle = swStyle.addClass(cls.caret_success_3)
  def caret_success_4: SwStyle = swStyle.addClass(cls.caret_success_4)
  def caret_success_5: SwStyle = swStyle.addClass(cls.caret_success_5)
  def caret_warning_1: SwStyle = swStyle.addClass(cls.caret_warning_1)
  def caret_warning_2: SwStyle = swStyle.addClass(cls.caret_warning_2)
  def caret_warning_3: SwStyle = swStyle.addClass(cls.caret_warning_3)
  def caret_warning_4: SwStyle = swStyle.addClass(cls.caret_warning_4)
  def caret_warning_5: SwStyle = swStyle.addClass(cls.caret_warning_5)
  def caret_transparent: SwStyle = swStyle.addClass(cls.caret_transparent)
  def caret_current: SwStyle = swStyle.addClass(cls.caret_current)
  def caret_inherit: SwStyle = swStyle.addClass(cls.caret_inherit)
  def caret_custom_1: SwStyle = swStyle.addClass(cls.caret_custom_1)
  def caret_custom_2: SwStyle = swStyle.addClass(cls.caret_custom_2)
  def caret_custom_3: SwStyle = swStyle.addClass(cls.caret_custom_3)
  def caret_custom_4: SwStyle = swStyle.addClass(cls.caret_custom_4)
  def accent_gray_0: SwStyle = swStyle.addClass(cls.accent_gray_0)
  def accent_gray_1: SwStyle = swStyle.addClass(cls.accent_gray_1)
  def accent_gray_2: SwStyle = swStyle.addClass(cls.accent_gray_2)
  def accent_gray_3: SwStyle = swStyle.addClass(cls.accent_gray_3)
  def accent_gray_4: SwStyle = swStyle.addClass(cls.accent_gray_4)
  def accent_gray_5: SwStyle = swStyle.addClass(cls.accent_gray_5)
  def accent_gray_6: SwStyle = swStyle.addClass(cls.accent_gray_6)
  def accent_gray_7: SwStyle = swStyle.addClass(cls.accent_gray_7)
  def accent_gray_8: SwStyle = swStyle.addClass(cls.accent_gray_8)
  def accent_gray_9: SwStyle = swStyle.addClass(cls.accent_gray_9)
  def accent_danger_1: SwStyle = swStyle.addClass(cls.accent_danger_1)
  def accent_danger_2: SwStyle = swStyle.addClass(cls.accent_danger_2)
  def accent_danger_3: SwStyle = swStyle.addClass(cls.accent_danger_3)
  def accent_danger_4: SwStyle = swStyle.addClass(cls.accent_danger_4)
  def accent_danger_5: SwStyle = swStyle.addClass(cls.accent_danger_5)
  def accent_primary_1: SwStyle = swStyle.addClass(cls.accent_primary_1)
  def accent_primary_2: SwStyle = swStyle.addClass(cls.accent_primary_2)
  def accent_primary_3: SwStyle = swStyle.addClass(cls.accent_primary_3)
  def accent_primary_4: SwStyle = swStyle.addClass(cls.accent_primary_4)
  def accent_primary_5: SwStyle = swStyle.addClass(cls.accent_primary_5)
  def accent_success_1: SwStyle = swStyle.addClass(cls.accent_success_1)
  def accent_success_2: SwStyle = swStyle.addClass(cls.accent_success_2)
  def accent_success_3: SwStyle = swStyle.addClass(cls.accent_success_3)
  def accent_success_4: SwStyle = swStyle.addClass(cls.accent_success_4)
  def accent_success_5: SwStyle = swStyle.addClass(cls.accent_success_5)
  def accent_warning_1: SwStyle = swStyle.addClass(cls.accent_warning_1)
  def accent_warning_2: SwStyle = swStyle.addClass(cls.accent_warning_2)
  def accent_warning_3: SwStyle = swStyle.addClass(cls.accent_warning_3)
  def accent_warning_4: SwStyle = swStyle.addClass(cls.accent_warning_4)
  def accent_warning_5: SwStyle = swStyle.addClass(cls.accent_warning_5)
  def accent_transparent: SwStyle = swStyle.addClass(cls.accent_transparent)
  def accent_current: SwStyle = swStyle.addClass(cls.accent_current)
  def accent_inherit: SwStyle = swStyle.addClass(cls.accent_inherit)
  def accent_custom_1: SwStyle = swStyle.addClass(cls.accent_custom_1)
  def accent_custom_2: SwStyle = swStyle.addClass(cls.accent_custom_2)
  def accent_custom_3: SwStyle = swStyle.addClass(cls.accent_custom_3)
  def accent_custom_4: SwStyle = swStyle.addClass(cls.accent_custom_4)
  def accent_auto: SwStyle = swStyle.addClass(cls.accent_auto)
  def opacity_0: SwStyle = swStyle.addClass(cls.opacity_0)
  def opacity_10: SwStyle = swStyle.addClass(cls.opacity_10)
  def opacity_20: SwStyle = swStyle.addClass(cls.opacity_20)
  def opacity_30: SwStyle = swStyle.addClass(cls.opacity_30)
  def opacity_40: SwStyle = swStyle.addClass(cls.opacity_40)
  def opacity_50: SwStyle = swStyle.addClass(cls.opacity_50)
  def opacity_60: SwStyle = swStyle.addClass(cls.opacity_60)
  def opacity_70: SwStyle = swStyle.addClass(cls.opacity_70)
  def opacity_80: SwStyle = swStyle.addClass(cls.opacity_80)
  def opacity_90: SwStyle = swStyle.addClass(cls.opacity_90)
  def opacity_100: SwStyle = swStyle.addClass(cls.opacity_100)
  def shadow_1: SwStyle = swStyle.addClass(cls.shadow_1)
  def shadow_2: SwStyle = swStyle.addClass(cls.shadow_2)
  def shadow_3: SwStyle = swStyle.addClass(cls.shadow_3)
  def shadow_4: SwStyle = swStyle.addClass(cls.shadow_4)
  def shadow_gray_0: SwStyle = swStyle.addClass(cls.shadow_gray_0)
  def shadow_gray_1: SwStyle = swStyle.addClass(cls.shadow_gray_1)
  def shadow_gray_2: SwStyle = swStyle.addClass(cls.shadow_gray_2)
  def shadow_gray_3: SwStyle = swStyle.addClass(cls.shadow_gray_3)
  def shadow_gray_4: SwStyle = swStyle.addClass(cls.shadow_gray_4)
  def shadow_gray_5: SwStyle = swStyle.addClass(cls.shadow_gray_5)
  def shadow_gray_6: SwStyle = swStyle.addClass(cls.shadow_gray_6)
  def shadow_gray_7: SwStyle = swStyle.addClass(cls.shadow_gray_7)
  def shadow_gray_8: SwStyle = swStyle.addClass(cls.shadow_gray_8)
  def shadow_gray_9: SwStyle = swStyle.addClass(cls.shadow_gray_9)
  def shadow_danger_1: SwStyle = swStyle.addClass(cls.shadow_danger_1)
  def shadow_danger_2: SwStyle = swStyle.addClass(cls.shadow_danger_2)
  def shadow_danger_3: SwStyle = swStyle.addClass(cls.shadow_danger_3)
  def shadow_danger_4: SwStyle = swStyle.addClass(cls.shadow_danger_4)
  def shadow_danger_5: SwStyle = swStyle.addClass(cls.shadow_danger_5)
  def shadow_primary_1: SwStyle = swStyle.addClass(cls.shadow_primary_1)
  def shadow_primary_2: SwStyle = swStyle.addClass(cls.shadow_primary_2)
  def shadow_primary_3: SwStyle = swStyle.addClass(cls.shadow_primary_3)
  def shadow_primary_4: SwStyle = swStyle.addClass(cls.shadow_primary_4)
  def shadow_primary_5: SwStyle = swStyle.addClass(cls.shadow_primary_5)
  def shadow_success_1: SwStyle = swStyle.addClass(cls.shadow_success_1)
  def shadow_success_2: SwStyle = swStyle.addClass(cls.shadow_success_2)
  def shadow_success_3: SwStyle = swStyle.addClass(cls.shadow_success_3)
  def shadow_success_4: SwStyle = swStyle.addClass(cls.shadow_success_4)
  def shadow_success_5: SwStyle = swStyle.addClass(cls.shadow_success_5)
  def shadow_warning_1: SwStyle = swStyle.addClass(cls.shadow_warning_1)
  def shadow_warning_2: SwStyle = swStyle.addClass(cls.shadow_warning_2)
  def shadow_warning_3: SwStyle = swStyle.addClass(cls.shadow_warning_3)
  def shadow_warning_4: SwStyle = swStyle.addClass(cls.shadow_warning_4)
  def shadow_warning_5: SwStyle = swStyle.addClass(cls.shadow_warning_5)
  def shadow_transparent: SwStyle = swStyle.addClass(cls.shadow_transparent)
  def shadow_current: SwStyle = swStyle.addClass(cls.shadow_current)
  def shadow_inherit: SwStyle = swStyle.addClass(cls.shadow_inherit)
  def shadow_custom_1: SwStyle = swStyle.addClass(cls.shadow_custom_1)
  def shadow_custom_2: SwStyle = swStyle.addClass(cls.shadow_custom_2)
  def shadow_custom_3: SwStyle = swStyle.addClass(cls.shadow_custom_3)
  def shadow_custom_4: SwStyle = swStyle.addClass(cls.shadow_custom_4)
  def outline_none: SwStyle = swStyle.addClass(cls.outline_none)
  def outline: SwStyle = swStyle.addClass(cls.outline)
  def outline_dashed: SwStyle = swStyle.addClass(cls.outline_dashed)
  def outline_dotted: SwStyle = swStyle.addClass(cls.outline_dotted)
  def outline_double: SwStyle = swStyle.addClass(cls.outline_double)
  def outline_0: SwStyle = swStyle.addClass(cls.outline_0)
  def outline_1: SwStyle = swStyle.addClass(cls.outline_1)
  def outline_2: SwStyle = swStyle.addClass(cls.outline_2)
  def outline_4: SwStyle = swStyle.addClass(cls.outline_4)
  def outline_8: SwStyle = swStyle.addClass(cls.outline_8)
  def outline_offset_0: SwStyle = swStyle.addClass(cls.outline_offset_0)
  def outline_offset_1: SwStyle = swStyle.addClass(cls.outline_offset_1)
  def outline_offset_2: SwStyle = swStyle.addClass(cls.outline_offset_2)
  def outline_offset_4: SwStyle = swStyle.addClass(cls.outline_offset_4)
  def outline_offset_8: SwStyle = swStyle.addClass(cls.outline_offset_8)
  def _outline_offset_0: SwStyle = swStyle.addClass(cls._outline_offset_0)
  def _outline_offset_1: SwStyle = swStyle.addClass(cls._outline_offset_1)
  def _outline_offset_2: SwStyle = swStyle.addClass(cls._outline_offset_2)
  def _outline_offset_4: SwStyle = swStyle.addClass(cls._outline_offset_4)
  def _outline_offset_8: SwStyle = swStyle.addClass(cls._outline_offset_8)
  def outline_gray_0: SwStyle = swStyle.addClass(cls.outline_gray_0)
  def outline_gray_1: SwStyle = swStyle.addClass(cls.outline_gray_1)
  def outline_gray_2: SwStyle = swStyle.addClass(cls.outline_gray_2)
  def outline_gray_3: SwStyle = swStyle.addClass(cls.outline_gray_3)
  def outline_gray_4: SwStyle = swStyle.addClass(cls.outline_gray_4)
  def outline_gray_5: SwStyle = swStyle.addClass(cls.outline_gray_5)
  def outline_gray_6: SwStyle = swStyle.addClass(cls.outline_gray_6)
  def outline_gray_7: SwStyle = swStyle.addClass(cls.outline_gray_7)
  def outline_gray_8: SwStyle = swStyle.addClass(cls.outline_gray_8)
  def outline_gray_9: SwStyle = swStyle.addClass(cls.outline_gray_9)
  def outline_danger_1: SwStyle = swStyle.addClass(cls.outline_danger_1)
  def outline_danger_2: SwStyle = swStyle.addClass(cls.outline_danger_2)
  def outline_danger_3: SwStyle = swStyle.addClass(cls.outline_danger_3)
  def outline_danger_4: SwStyle = swStyle.addClass(cls.outline_danger_4)
  def outline_danger_5: SwStyle = swStyle.addClass(cls.outline_danger_5)
  def outline_primary_1: SwStyle = swStyle.addClass(cls.outline_primary_1)
  def outline_primary_2: SwStyle = swStyle.addClass(cls.outline_primary_2)
  def outline_primary_3: SwStyle = swStyle.addClass(cls.outline_primary_3)
  def outline_primary_4: SwStyle = swStyle.addClass(cls.outline_primary_4)
  def outline_primary_5: SwStyle = swStyle.addClass(cls.outline_primary_5)
  def outline_success_1: SwStyle = swStyle.addClass(cls.outline_success_1)
  def outline_success_2: SwStyle = swStyle.addClass(cls.outline_success_2)
  def outline_success_3: SwStyle = swStyle.addClass(cls.outline_success_3)
  def outline_success_4: SwStyle = swStyle.addClass(cls.outline_success_4)
  def outline_success_5: SwStyle = swStyle.addClass(cls.outline_success_5)
  def outline_warning_1: SwStyle = swStyle.addClass(cls.outline_warning_1)
  def outline_warning_2: SwStyle = swStyle.addClass(cls.outline_warning_2)
  def outline_warning_3: SwStyle = swStyle.addClass(cls.outline_warning_3)
  def outline_warning_4: SwStyle = swStyle.addClass(cls.outline_warning_4)
  def outline_warning_5: SwStyle = swStyle.addClass(cls.outline_warning_5)
  def outline_transparent: SwStyle = swStyle.addClass(cls.outline_transparent)
  def outline_current: SwStyle = swStyle.addClass(cls.outline_current)
  def outline_inherit: SwStyle = swStyle.addClass(cls.outline_inherit)
  def outline_custom_1: SwStyle = swStyle.addClass(cls.outline_custom_1)
  def outline_custom_2: SwStyle = swStyle.addClass(cls.outline_custom_2)
  def outline_custom_3: SwStyle = swStyle.addClass(cls.outline_custom_3)
  def outline_custom_4: SwStyle = swStyle.addClass(cls.outline_custom_4)
  def brightness_0: SwStyle = swStyle.addClass(cls.brightness_0)
  def brightness_50: SwStyle = swStyle.addClass(cls.brightness_50)
  def brightness_75: SwStyle = swStyle.addClass(cls.brightness_75)
  def brightness_90: SwStyle = swStyle.addClass(cls.brightness_90)
  def brightness_95: SwStyle = swStyle.addClass(cls.brightness_95)
  def brightness_100: SwStyle = swStyle.addClass(cls.brightness_100)
  def brightness_105: SwStyle = swStyle.addClass(cls.brightness_105)
  def brightness_110: SwStyle = swStyle.addClass(cls.brightness_110)
  def brightness_125: SwStyle = swStyle.addClass(cls.brightness_125)
  def brightness_150: SwStyle = swStyle.addClass(cls.brightness_150)
  def brightness_200: SwStyle = swStyle.addClass(cls.brightness_200)
  def ease_linear: SwStyle = swStyle.addClass(cls.ease_linear)
  def ease_in: SwStyle = swStyle.addClass(cls.ease_in)
  def ease_out: SwStyle = swStyle.addClass(cls.ease_out)
  def ease_in_out: SwStyle = swStyle.addClass(cls.ease_in_out)
  def will_change_auto: SwStyle = swStyle.addClass(cls.will_change_auto)
  def will_change_scroll: SwStyle = swStyle.addClass(cls.will_change_scroll)
  def will_change_contents: SwStyle = swStyle.addClass(cls.will_change_contents)
  def will_change_transform: SwStyle = swStyle.addClass(cls.will_change_transform)
  def contain_none: SwStyle = swStyle.addClass(cls.contain_none)
  def contain_content: SwStyle = swStyle.addClass(cls.contain_content)
  def contain_strict: SwStyle = swStyle.addClass(cls.contain_strict)
  def contain_size: SwStyle = swStyle.addClass(cls.contain_size)
  def contain_inline_size: SwStyle = swStyle.addClass(cls.contain_inline_size)
  def contain_layout: SwStyle = swStyle.addClass(cls.contain_layout)
  def contain_paint: SwStyle = swStyle.addClass(cls.contain_paint)
  def contain_style: SwStyle = swStyle.addClass(cls.contain_style)
  def content_none: SwStyle = swStyle.addClass(cls.content_none)
  def forced_color_adjust_auto: SwStyle = swStyle.addClass(cls.forced_color_adjust_auto)
  def forced_color_adjust_none: SwStyle = swStyle.addClass(cls.forced_color_adjust_none)

object tw {
  def apply(): SwStyle = SwStyle()

  def container: SwStyle = SwStyle().addClass(cls.container)
  def pointer_events_none: SwStyle = SwStyle().addClass(cls.pointer_events_none)
  def pointer_events_auto: SwStyle = SwStyle().addClass(cls.pointer_events_auto)
  def visible: SwStyle = SwStyle().addClass(cls.visible)
  def invisible: SwStyle = SwStyle().addClass(cls.invisible)
  def collapse: SwStyle = SwStyle().addClass(cls.collapse)
  def static: SwStyle = SwStyle().addClass(cls.static)
  def fixed: SwStyle = SwStyle().addClass(cls.fixed)
  def absolute: SwStyle = SwStyle().addClass(cls.absolute)
  def relative: SwStyle = SwStyle().addClass(cls.relative)
  def sticky: SwStyle = SwStyle().addClass(cls.sticky)
  def inset_0: SwStyle = SwStyle().addClass(cls.inset_0)
  def _inset_0: SwStyle = SwStyle().addClass(cls._inset_0)
  def inset_x_0: SwStyle = SwStyle().addClass(cls.inset_x_0)
  def _inset_x_0: SwStyle = SwStyle().addClass(cls._inset_x_0)
  def inset_y_0: SwStyle = SwStyle().addClass(cls.inset_y_0)
  def _inset_y_0: SwStyle = SwStyle().addClass(cls._inset_y_0)
  def start_0: SwStyle = SwStyle().addClass(cls.start_0)
  def _start_0: SwStyle = SwStyle().addClass(cls._start_0)
  def end_0: SwStyle = SwStyle().addClass(cls.end_0)
  def _end_0: SwStyle = SwStyle().addClass(cls._end_0)
  def top_0: SwStyle = SwStyle().addClass(cls.top_0)
  def _top_0: SwStyle = SwStyle().addClass(cls._top_0)
  def right_0: SwStyle = SwStyle().addClass(cls.right_0)
  def _right_0: SwStyle = SwStyle().addClass(cls._right_0)
  def bottom_0: SwStyle = SwStyle().addClass(cls.bottom_0)
  def _bottom_0: SwStyle = SwStyle().addClass(cls._bottom_0)
  def left_0: SwStyle = SwStyle().addClass(cls.left_0)
  def _left_0: SwStyle = SwStyle().addClass(cls._left_0)
  def isolate: SwStyle = SwStyle().addClass(cls.isolate)
  def isolation_auto: SwStyle = SwStyle().addClass(cls.isolation_auto)
  def z_0: SwStyle = SwStyle().addClass(cls.z_0)
  def z_1: SwStyle = SwStyle().addClass(cls.z_1)
  def z_2: SwStyle = SwStyle().addClass(cls.z_2)
  def z_3: SwStyle = SwStyle().addClass(cls.z_3)
  def z_4: SwStyle = SwStyle().addClass(cls.z_4)
  def z_5: SwStyle = SwStyle().addClass(cls.z_5)
  def z_999: SwStyle = SwStyle().addClass(cls.z_999)
  def z_9999: SwStyle = SwStyle().addClass(cls.z_9999)
  def z_auto: SwStyle = SwStyle().addClass(cls.z_auto)
  def _z_0: SwStyle = SwStyle().addClass(cls._z_0)
  def _z_1: SwStyle = SwStyle().addClass(cls._z_1)
  def _z_2: SwStyle = SwStyle().addClass(cls._z_2)
  def _z_3: SwStyle = SwStyle().addClass(cls._z_3)
  def _z_4: SwStyle = SwStyle().addClass(cls._z_4)
  def _z_5: SwStyle = SwStyle().addClass(cls._z_5)
  def _z_999: SwStyle = SwStyle().addClass(cls._z_999)
  def _z_9999: SwStyle = SwStyle().addClass(cls._z_9999)
  def m_0: SwStyle = SwStyle().addClass(cls.m_0)
  def m_2: SwStyle = SwStyle().addClass(cls.m_2)
  def m_4: SwStyle = SwStyle().addClass(cls.m_4)
  def m_6: SwStyle = SwStyle().addClass(cls.m_6)
  def m_8: SwStyle = SwStyle().addClass(cls.m_8)
  def m_12: SwStyle = SwStyle().addClass(cls.m_12)
  def m_16: SwStyle = SwStyle().addClass(cls.m_16)
  def m_20: SwStyle = SwStyle().addClass(cls.m_20)
  def m_24: SwStyle = SwStyle().addClass(cls.m_24)
  def m_32: SwStyle = SwStyle().addClass(cls.m_32)
  def m_40: SwStyle = SwStyle().addClass(cls.m_40)
  def m_48: SwStyle = SwStyle().addClass(cls.m_48)
  def m_auto: SwStyle = SwStyle().addClass(cls.m_auto)
  def _m_0: SwStyle = SwStyle().addClass(cls._m_0)
  def _m_2: SwStyle = SwStyle().addClass(cls._m_2)
  def _m_4: SwStyle = SwStyle().addClass(cls._m_4)
  def _m_6: SwStyle = SwStyle().addClass(cls._m_6)
  def _m_8: SwStyle = SwStyle().addClass(cls._m_8)
  def _m_12: SwStyle = SwStyle().addClass(cls._m_12)
  def _m_16: SwStyle = SwStyle().addClass(cls._m_16)
  def _m_20: SwStyle = SwStyle().addClass(cls._m_20)
  def _m_24: SwStyle = SwStyle().addClass(cls._m_24)
  def _m_32: SwStyle = SwStyle().addClass(cls._m_32)
  def _m_40: SwStyle = SwStyle().addClass(cls._m_40)
  def _m_48: SwStyle = SwStyle().addClass(cls._m_48)
  def mx_0: SwStyle = SwStyle().addClass(cls.mx_0)
  def mx_2: SwStyle = SwStyle().addClass(cls.mx_2)
  def mx_4: SwStyle = SwStyle().addClass(cls.mx_4)
  def mx_6: SwStyle = SwStyle().addClass(cls.mx_6)
  def mx_8: SwStyle = SwStyle().addClass(cls.mx_8)
  def mx_12: SwStyle = SwStyle().addClass(cls.mx_12)
  def mx_16: SwStyle = SwStyle().addClass(cls.mx_16)
  def mx_20: SwStyle = SwStyle().addClass(cls.mx_20)
  def mx_24: SwStyle = SwStyle().addClass(cls.mx_24)
  def mx_32: SwStyle = SwStyle().addClass(cls.mx_32)
  def mx_40: SwStyle = SwStyle().addClass(cls.mx_40)
  def mx_48: SwStyle = SwStyle().addClass(cls.mx_48)
  def mx_auto: SwStyle = SwStyle().addClass(cls.mx_auto)
  def _mx_0: SwStyle = SwStyle().addClass(cls._mx_0)
  def _mx_2: SwStyle = SwStyle().addClass(cls._mx_2)
  def _mx_4: SwStyle = SwStyle().addClass(cls._mx_4)
  def _mx_6: SwStyle = SwStyle().addClass(cls._mx_6)
  def _mx_8: SwStyle = SwStyle().addClass(cls._mx_8)
  def _mx_12: SwStyle = SwStyle().addClass(cls._mx_12)
  def _mx_16: SwStyle = SwStyle().addClass(cls._mx_16)
  def _mx_20: SwStyle = SwStyle().addClass(cls._mx_20)
  def _mx_24: SwStyle = SwStyle().addClass(cls._mx_24)
  def _mx_32: SwStyle = SwStyle().addClass(cls._mx_32)
  def _mx_40: SwStyle = SwStyle().addClass(cls._mx_40)
  def _mx_48: SwStyle = SwStyle().addClass(cls._mx_48)
  def my_0: SwStyle = SwStyle().addClass(cls.my_0)
  def my_2: SwStyle = SwStyle().addClass(cls.my_2)
  def my_4: SwStyle = SwStyle().addClass(cls.my_4)
  def my_6: SwStyle = SwStyle().addClass(cls.my_6)
  def my_8: SwStyle = SwStyle().addClass(cls.my_8)
  def my_12: SwStyle = SwStyle().addClass(cls.my_12)
  def my_16: SwStyle = SwStyle().addClass(cls.my_16)
  def my_20: SwStyle = SwStyle().addClass(cls.my_20)
  def my_24: SwStyle = SwStyle().addClass(cls.my_24)
  def my_32: SwStyle = SwStyle().addClass(cls.my_32)
  def my_40: SwStyle = SwStyle().addClass(cls.my_40)
  def my_48: SwStyle = SwStyle().addClass(cls.my_48)
  def my_auto: SwStyle = SwStyle().addClass(cls.my_auto)
  def _my_0: SwStyle = SwStyle().addClass(cls._my_0)
  def _my_2: SwStyle = SwStyle().addClass(cls._my_2)
  def _my_4: SwStyle = SwStyle().addClass(cls._my_4)
  def _my_6: SwStyle = SwStyle().addClass(cls._my_6)
  def _my_8: SwStyle = SwStyle().addClass(cls._my_8)
  def _my_12: SwStyle = SwStyle().addClass(cls._my_12)
  def _my_16: SwStyle = SwStyle().addClass(cls._my_16)
  def _my_20: SwStyle = SwStyle().addClass(cls._my_20)
  def _my_24: SwStyle = SwStyle().addClass(cls._my_24)
  def _my_32: SwStyle = SwStyle().addClass(cls._my_32)
  def _my_40: SwStyle = SwStyle().addClass(cls._my_40)
  def _my_48: SwStyle = SwStyle().addClass(cls._my_48)
  def ms_0: SwStyle = SwStyle().addClass(cls.ms_0)
  def ms_2: SwStyle = SwStyle().addClass(cls.ms_2)
  def ms_4: SwStyle = SwStyle().addClass(cls.ms_4)
  def ms_6: SwStyle = SwStyle().addClass(cls.ms_6)
  def ms_8: SwStyle = SwStyle().addClass(cls.ms_8)
  def ms_12: SwStyle = SwStyle().addClass(cls.ms_12)
  def ms_16: SwStyle = SwStyle().addClass(cls.ms_16)
  def ms_20: SwStyle = SwStyle().addClass(cls.ms_20)
  def ms_24: SwStyle = SwStyle().addClass(cls.ms_24)
  def ms_32: SwStyle = SwStyle().addClass(cls.ms_32)
  def ms_40: SwStyle = SwStyle().addClass(cls.ms_40)
  def ms_48: SwStyle = SwStyle().addClass(cls.ms_48)
  def ms_auto: SwStyle = SwStyle().addClass(cls.ms_auto)
  def _ms_0: SwStyle = SwStyle().addClass(cls._ms_0)
  def _ms_2: SwStyle = SwStyle().addClass(cls._ms_2)
  def _ms_4: SwStyle = SwStyle().addClass(cls._ms_4)
  def _ms_6: SwStyle = SwStyle().addClass(cls._ms_6)
  def _ms_8: SwStyle = SwStyle().addClass(cls._ms_8)
  def _ms_12: SwStyle = SwStyle().addClass(cls._ms_12)
  def _ms_16: SwStyle = SwStyle().addClass(cls._ms_16)
  def _ms_20: SwStyle = SwStyle().addClass(cls._ms_20)
  def _ms_24: SwStyle = SwStyle().addClass(cls._ms_24)
  def _ms_32: SwStyle = SwStyle().addClass(cls._ms_32)
  def _ms_40: SwStyle = SwStyle().addClass(cls._ms_40)
  def _ms_48: SwStyle = SwStyle().addClass(cls._ms_48)
  def me_0: SwStyle = SwStyle().addClass(cls.me_0)
  def me_2: SwStyle = SwStyle().addClass(cls.me_2)
  def me_4: SwStyle = SwStyle().addClass(cls.me_4)
  def me_6: SwStyle = SwStyle().addClass(cls.me_6)
  def me_8: SwStyle = SwStyle().addClass(cls.me_8)
  def me_12: SwStyle = SwStyle().addClass(cls.me_12)
  def me_16: SwStyle = SwStyle().addClass(cls.me_16)
  def me_20: SwStyle = SwStyle().addClass(cls.me_20)
  def me_24: SwStyle = SwStyle().addClass(cls.me_24)
  def me_32: SwStyle = SwStyle().addClass(cls.me_32)
  def me_40: SwStyle = SwStyle().addClass(cls.me_40)
  def me_48: SwStyle = SwStyle().addClass(cls.me_48)
  def me_auto: SwStyle = SwStyle().addClass(cls.me_auto)
  def _me_0: SwStyle = SwStyle().addClass(cls._me_0)
  def _me_2: SwStyle = SwStyle().addClass(cls._me_2)
  def _me_4: SwStyle = SwStyle().addClass(cls._me_4)
  def _me_6: SwStyle = SwStyle().addClass(cls._me_6)
  def _me_8: SwStyle = SwStyle().addClass(cls._me_8)
  def _me_12: SwStyle = SwStyle().addClass(cls._me_12)
  def _me_16: SwStyle = SwStyle().addClass(cls._me_16)
  def _me_20: SwStyle = SwStyle().addClass(cls._me_20)
  def _me_24: SwStyle = SwStyle().addClass(cls._me_24)
  def _me_32: SwStyle = SwStyle().addClass(cls._me_32)
  def _me_40: SwStyle = SwStyle().addClass(cls._me_40)
  def _me_48: SwStyle = SwStyle().addClass(cls._me_48)
  def mt_0: SwStyle = SwStyle().addClass(cls.mt_0)
  def mt_2: SwStyle = SwStyle().addClass(cls.mt_2)
  def mt_4: SwStyle = SwStyle().addClass(cls.mt_4)
  def mt_6: SwStyle = SwStyle().addClass(cls.mt_6)
  def mt_8: SwStyle = SwStyle().addClass(cls.mt_8)
  def mt_12: SwStyle = SwStyle().addClass(cls.mt_12)
  def mt_16: SwStyle = SwStyle().addClass(cls.mt_16)
  def mt_20: SwStyle = SwStyle().addClass(cls.mt_20)
  def mt_24: SwStyle = SwStyle().addClass(cls.mt_24)
  def mt_32: SwStyle = SwStyle().addClass(cls.mt_32)
  def mt_40: SwStyle = SwStyle().addClass(cls.mt_40)
  def mt_48: SwStyle = SwStyle().addClass(cls.mt_48)
  def mt_auto: SwStyle = SwStyle().addClass(cls.mt_auto)
  def _mt_0: SwStyle = SwStyle().addClass(cls._mt_0)
  def _mt_2: SwStyle = SwStyle().addClass(cls._mt_2)
  def _mt_4: SwStyle = SwStyle().addClass(cls._mt_4)
  def _mt_6: SwStyle = SwStyle().addClass(cls._mt_6)
  def _mt_8: SwStyle = SwStyle().addClass(cls._mt_8)
  def _mt_12: SwStyle = SwStyle().addClass(cls._mt_12)
  def _mt_16: SwStyle = SwStyle().addClass(cls._mt_16)
  def _mt_20: SwStyle = SwStyle().addClass(cls._mt_20)
  def _mt_24: SwStyle = SwStyle().addClass(cls._mt_24)
  def _mt_32: SwStyle = SwStyle().addClass(cls._mt_32)
  def _mt_40: SwStyle = SwStyle().addClass(cls._mt_40)
  def _mt_48: SwStyle = SwStyle().addClass(cls._mt_48)
  def mr_0: SwStyle = SwStyle().addClass(cls.mr_0)
  def mr_2: SwStyle = SwStyle().addClass(cls.mr_2)
  def mr_4: SwStyle = SwStyle().addClass(cls.mr_4)
  def mr_6: SwStyle = SwStyle().addClass(cls.mr_6)
  def mr_8: SwStyle = SwStyle().addClass(cls.mr_8)
  def mr_12: SwStyle = SwStyle().addClass(cls.mr_12)
  def mr_16: SwStyle = SwStyle().addClass(cls.mr_16)
  def mr_20: SwStyle = SwStyle().addClass(cls.mr_20)
  def mr_24: SwStyle = SwStyle().addClass(cls.mr_24)
  def mr_32: SwStyle = SwStyle().addClass(cls.mr_32)
  def mr_40: SwStyle = SwStyle().addClass(cls.mr_40)
  def mr_48: SwStyle = SwStyle().addClass(cls.mr_48)
  def mr_auto: SwStyle = SwStyle().addClass(cls.mr_auto)
  def _mr_0: SwStyle = SwStyle().addClass(cls._mr_0)
  def _mr_2: SwStyle = SwStyle().addClass(cls._mr_2)
  def _mr_4: SwStyle = SwStyle().addClass(cls._mr_4)
  def _mr_6: SwStyle = SwStyle().addClass(cls._mr_6)
  def _mr_8: SwStyle = SwStyle().addClass(cls._mr_8)
  def _mr_12: SwStyle = SwStyle().addClass(cls._mr_12)
  def _mr_16: SwStyle = SwStyle().addClass(cls._mr_16)
  def _mr_20: SwStyle = SwStyle().addClass(cls._mr_20)
  def _mr_24: SwStyle = SwStyle().addClass(cls._mr_24)
  def _mr_32: SwStyle = SwStyle().addClass(cls._mr_32)
  def _mr_40: SwStyle = SwStyle().addClass(cls._mr_40)
  def _mr_48: SwStyle = SwStyle().addClass(cls._mr_48)
  def mb_0: SwStyle = SwStyle().addClass(cls.mb_0)
  def mb_2: SwStyle = SwStyle().addClass(cls.mb_2)
  def mb_4: SwStyle = SwStyle().addClass(cls.mb_4)
  def mb_6: SwStyle = SwStyle().addClass(cls.mb_6)
  def mb_8: SwStyle = SwStyle().addClass(cls.mb_8)
  def mb_12: SwStyle = SwStyle().addClass(cls.mb_12)
  def mb_16: SwStyle = SwStyle().addClass(cls.mb_16)
  def mb_20: SwStyle = SwStyle().addClass(cls.mb_20)
  def mb_24: SwStyle = SwStyle().addClass(cls.mb_24)
  def mb_32: SwStyle = SwStyle().addClass(cls.mb_32)
  def mb_40: SwStyle = SwStyle().addClass(cls.mb_40)
  def mb_48: SwStyle = SwStyle().addClass(cls.mb_48)
  def mb_auto: SwStyle = SwStyle().addClass(cls.mb_auto)
  def _mb_0: SwStyle = SwStyle().addClass(cls._mb_0)
  def _mb_2: SwStyle = SwStyle().addClass(cls._mb_2)
  def _mb_4: SwStyle = SwStyle().addClass(cls._mb_4)
  def _mb_6: SwStyle = SwStyle().addClass(cls._mb_6)
  def _mb_8: SwStyle = SwStyle().addClass(cls._mb_8)
  def _mb_12: SwStyle = SwStyle().addClass(cls._mb_12)
  def _mb_16: SwStyle = SwStyle().addClass(cls._mb_16)
  def _mb_20: SwStyle = SwStyle().addClass(cls._mb_20)
  def _mb_24: SwStyle = SwStyle().addClass(cls._mb_24)
  def _mb_32: SwStyle = SwStyle().addClass(cls._mb_32)
  def _mb_40: SwStyle = SwStyle().addClass(cls._mb_40)
  def _mb_48: SwStyle = SwStyle().addClass(cls._mb_48)
  def ml_0: SwStyle = SwStyle().addClass(cls.ml_0)
  def ml_2: SwStyle = SwStyle().addClass(cls.ml_2)
  def ml_4: SwStyle = SwStyle().addClass(cls.ml_4)
  def ml_6: SwStyle = SwStyle().addClass(cls.ml_6)
  def ml_8: SwStyle = SwStyle().addClass(cls.ml_8)
  def ml_12: SwStyle = SwStyle().addClass(cls.ml_12)
  def ml_16: SwStyle = SwStyle().addClass(cls.ml_16)
  def ml_20: SwStyle = SwStyle().addClass(cls.ml_20)
  def ml_24: SwStyle = SwStyle().addClass(cls.ml_24)
  def ml_32: SwStyle = SwStyle().addClass(cls.ml_32)
  def ml_40: SwStyle = SwStyle().addClass(cls.ml_40)
  def ml_48: SwStyle = SwStyle().addClass(cls.ml_48)
  def ml_auto: SwStyle = SwStyle().addClass(cls.ml_auto)
  def _ml_0: SwStyle = SwStyle().addClass(cls._ml_0)
  def _ml_2: SwStyle = SwStyle().addClass(cls._ml_2)
  def _ml_4: SwStyle = SwStyle().addClass(cls._ml_4)
  def _ml_6: SwStyle = SwStyle().addClass(cls._ml_6)
  def _ml_8: SwStyle = SwStyle().addClass(cls._ml_8)
  def _ml_12: SwStyle = SwStyle().addClass(cls._ml_12)
  def _ml_16: SwStyle = SwStyle().addClass(cls._ml_16)
  def _ml_20: SwStyle = SwStyle().addClass(cls._ml_20)
  def _ml_24: SwStyle = SwStyle().addClass(cls._ml_24)
  def _ml_32: SwStyle = SwStyle().addClass(cls._ml_32)
  def _ml_40: SwStyle = SwStyle().addClass(cls._ml_40)
  def _ml_48: SwStyle = SwStyle().addClass(cls._ml_48)
  def box_border: SwStyle = SwStyle().addClass(cls.box_border)
  def box_content: SwStyle = SwStyle().addClass(cls.box_content)
  def line_clamp_1: SwStyle = SwStyle().addClass(cls.line_clamp_1)
  def line_clamp_2: SwStyle = SwStyle().addClass(cls.line_clamp_2)
  def line_clamp_3: SwStyle = SwStyle().addClass(cls.line_clamp_3)
  def line_clamp_4: SwStyle = SwStyle().addClass(cls.line_clamp_4)
  def line_clamp_5: SwStyle = SwStyle().addClass(cls.line_clamp_5)
  def line_clamp_6: SwStyle = SwStyle().addClass(cls.line_clamp_6)
  def line_clamp_none: SwStyle = SwStyle().addClass(cls.line_clamp_none)
  def block: SwStyle = SwStyle().addClass(cls.block)
  def inline_block: SwStyle = SwStyle().addClass(cls.inline_block)
  def inline: SwStyle = SwStyle().addClass(cls.inline)
  def flex: SwStyle = SwStyle().addClass(cls.flex)
  def inline_flex: SwStyle = SwStyle().addClass(cls.inline_flex)
  def table: SwStyle = SwStyle().addClass(cls.table)
  def inline_table: SwStyle = SwStyle().addClass(cls.inline_table)
  def table_caption: SwStyle = SwStyle().addClass(cls.table_caption)
  def table_cell: SwStyle = SwStyle().addClass(cls.table_cell)
  def table_column: SwStyle = SwStyle().addClass(cls.table_column)
  def table_column_group: SwStyle = SwStyle().addClass(cls.table_column_group)
  def table_footer_group: SwStyle = SwStyle().addClass(cls.table_footer_group)
  def table_header_group: SwStyle = SwStyle().addClass(cls.table_header_group)
  def table_row_group: SwStyle = SwStyle().addClass(cls.table_row_group)
  def table_row: SwStyle = SwStyle().addClass(cls.table_row)
  def flow_root: SwStyle = SwStyle().addClass(cls.flow_root)
  def grid: SwStyle = SwStyle().addClass(cls.grid)
  def inline_grid: SwStyle = SwStyle().addClass(cls.inline_grid)
  def contents: SwStyle = SwStyle().addClass(cls.contents)
  def list_item: SwStyle = SwStyle().addClass(cls.list_item)
  def hidden: SwStyle = SwStyle().addClass(cls.hidden)
  def aspect_auto: SwStyle = SwStyle().addClass(cls.aspect_auto)
  def aspect_square: SwStyle = SwStyle().addClass(cls.aspect_square)
  def aspect_video: SwStyle = SwStyle().addClass(cls.aspect_video)
  def size_0: SwStyle = SwStyle().addClass(cls.size_0)
  def size_2: SwStyle = SwStyle().addClass(cls.size_2)
  def size_4: SwStyle = SwStyle().addClass(cls.size_4)
  def size_6: SwStyle = SwStyle().addClass(cls.size_6)
  def size_8: SwStyle = SwStyle().addClass(cls.size_8)
  def size_12: SwStyle = SwStyle().addClass(cls.size_12)
  def size_16: SwStyle = SwStyle().addClass(cls.size_16)
  def size_20: SwStyle = SwStyle().addClass(cls.size_20)
  def size_24: SwStyle = SwStyle().addClass(cls.size_24)
  def size_32: SwStyle = SwStyle().addClass(cls.size_32)
  def size_40: SwStyle = SwStyle().addClass(cls.size_40)
  def size_48: SwStyle = SwStyle().addClass(cls.size_48)
  def size_auto: SwStyle = SwStyle().addClass(cls.size_auto)
  def size_full: SwStyle = SwStyle().addClass(cls.size_full)
  def size_min: SwStyle = SwStyle().addClass(cls.size_min)
  def size_max: SwStyle = SwStyle().addClass(cls.size_max)
  def size_fit: SwStyle = SwStyle().addClass(cls.size_fit)
  def h_px1: SwStyle = SwStyle().addClass(cls.h_px1)
  def h_px8: SwStyle = SwStyle().addClass(cls.h_px8)
  def h_px16: SwStyle = SwStyle().addClass(cls.h_px16)
  def h_px20: SwStyle = SwStyle().addClass(cls.h_px20)
  def h_px24: SwStyle = SwStyle().addClass(cls.h_px24)
  def h_px32: SwStyle = SwStyle().addClass(cls.h_px32)
  def h_px40: SwStyle = SwStyle().addClass(cls.h_px40)
  def h_px48: SwStyle = SwStyle().addClass(cls.h_px48)
  def h_px64: SwStyle = SwStyle().addClass(cls.h_px64)
  def h_px128: SwStyle = SwStyle().addClass(cls.h_px128)
  def h_px256: SwStyle = SwStyle().addClass(cls.h_px256)
  def h_pc100: SwStyle = SwStyle().addClass(cls.h_pc100)
  def h_vh100: SwStyle = SwStyle().addClass(cls.h_vh100)
  def h_auto: SwStyle = SwStyle().addClass(cls.h_auto)
  def h_min: SwStyle = SwStyle().addClass(cls.h_min)
  def h_max: SwStyle = SwStyle().addClass(cls.h_max)
  def h_custom_1: SwStyle = SwStyle().addClass(cls.h_custom_1)
  def h_custom_2: SwStyle = SwStyle().addClass(cls.h_custom_2)
  def h_custom_3: SwStyle = SwStyle().addClass(cls.h_custom_3)
  def min_h_pc100: SwStyle = SwStyle().addClass(cls.min_h_pc100)
  def min_h_vh100: SwStyle = SwStyle().addClass(cls.min_h_vh100)
  def w_px1: SwStyle = SwStyle().addClass(cls.w_px1)
  def w_px8: SwStyle = SwStyle().addClass(cls.w_px8)
  def w_px16: SwStyle = SwStyle().addClass(cls.w_px16)
  def w_px20: SwStyle = SwStyle().addClass(cls.w_px20)
  def w_px24: SwStyle = SwStyle().addClass(cls.w_px24)
  def w_px32: SwStyle = SwStyle().addClass(cls.w_px32)
  def w_px40: SwStyle = SwStyle().addClass(cls.w_px40)
  def w_px48: SwStyle = SwStyle().addClass(cls.w_px48)
  def w_px64: SwStyle = SwStyle().addClass(cls.w_px64)
  def w_px128: SwStyle = SwStyle().addClass(cls.w_px128)
  def w_px256: SwStyle = SwStyle().addClass(cls.w_px256)
  def w_px480: SwStyle = SwStyle().addClass(cls.w_px480)
  def w_px512: SwStyle = SwStyle().addClass(cls.w_px512)
  def w_px640: SwStyle = SwStyle().addClass(cls.w_px640)
  def w_px768: SwStyle = SwStyle().addClass(cls.w_px768)
  def w_px1024: SwStyle = SwStyle().addClass(cls.w_px1024)
  def w_px1536: SwStyle = SwStyle().addClass(cls.w_px1536)
  def w_pc10: SwStyle = SwStyle().addClass(cls.w_pc10)
  def w_pc20: SwStyle = SwStyle().addClass(cls.w_pc20)
  def w_pc25: SwStyle = SwStyle().addClass(cls.w_pc25)
  def w_pc30: SwStyle = SwStyle().addClass(cls.w_pc30)
  def w_pc33: SwStyle = SwStyle().addClass(cls.w_pc33)
  def w_pc40: SwStyle = SwStyle().addClass(cls.w_pc40)
  def w_pc50: SwStyle = SwStyle().addClass(cls.w_pc50)
  def w_pc60: SwStyle = SwStyle().addClass(cls.w_pc60)
  def w_pc66: SwStyle = SwStyle().addClass(cls.w_pc66)
  def w_pc70: SwStyle = SwStyle().addClass(cls.w_pc70)
  def w_pc75: SwStyle = SwStyle().addClass(cls.w_pc75)
  def w_pc80: SwStyle = SwStyle().addClass(cls.w_pc80)
  def w_pc90: SwStyle = SwStyle().addClass(cls.w_pc90)
  def w_pc100: SwStyle = SwStyle().addClass(cls.w_pc100)
  def w_auto: SwStyle = SwStyle().addClass(cls.w_auto)
  def w_min: SwStyle = SwStyle().addClass(cls.w_min)
  def w_max: SwStyle = SwStyle().addClass(cls.w_max)
  def w_fit: SwStyle = SwStyle().addClass(cls.w_fit)
  def w_custom_1: SwStyle = SwStyle().addClass(cls.w_custom_1)
  def w_custom_2: SwStyle = SwStyle().addClass(cls.w_custom_2)
  def w_custom_3: SwStyle = SwStyle().addClass(cls.w_custom_3)
  def min_w_fit: SwStyle = SwStyle().addClass(cls.min_w_fit)
  def min_w_min: SwStyle = SwStyle().addClass(cls.min_w_min)
  def min_w_max: SwStyle = SwStyle().addClass(cls.min_w_max)
  def max_w_px128: SwStyle = SwStyle().addClass(cls.max_w_px128)
  def max_w_px256: SwStyle = SwStyle().addClass(cls.max_w_px256)
  def max_w_px480: SwStyle = SwStyle().addClass(cls.max_w_px480)
  def max_w_px512: SwStyle = SwStyle().addClass(cls.max_w_px512)
  def max_w_px640: SwStyle = SwStyle().addClass(cls.max_w_px640)
  def max_w_px768: SwStyle = SwStyle().addClass(cls.max_w_px768)
  def max_w_px1024: SwStyle = SwStyle().addClass(cls.max_w_px1024)
  def max_w_pc100: SwStyle = SwStyle().addClass(cls.max_w_pc100)
  def max_w_custom_1: SwStyle = SwStyle().addClass(cls.max_w_custom_1)
  def max_w_custom_2: SwStyle = SwStyle().addClass(cls.max_w_custom_2)
  def max_w_custom_3: SwStyle = SwStyle().addClass(cls.max_w_custom_3)
  def flex_1: SwStyle = SwStyle().addClass(cls.flex_1)
  def flex_auto: SwStyle = SwStyle().addClass(cls.flex_auto)
  def flex_initial: SwStyle = SwStyle().addClass(cls.flex_initial)
  def flex_none: SwStyle = SwStyle().addClass(cls.flex_none)
  def flex_shrink_0: SwStyle = SwStyle().addClass(cls.flex_shrink_0)
  def flex_shrink: SwStyle = SwStyle().addClass(cls.flex_shrink)
  def shrink_0: SwStyle = SwStyle().addClass(cls.shrink_0)
  def shrink: SwStyle = SwStyle().addClass(cls.shrink)
  def flex_grow_0: SwStyle = SwStyle().addClass(cls.flex_grow_0)
  def flex_grow: SwStyle = SwStyle().addClass(cls.flex_grow)
  def grow_0: SwStyle = SwStyle().addClass(cls.grow_0)
  def grow: SwStyle = SwStyle().addClass(cls.grow)
  def basis_0: SwStyle = SwStyle().addClass(cls.basis_0)
  def basis_2: SwStyle = SwStyle().addClass(cls.basis_2)
  def basis_4: SwStyle = SwStyle().addClass(cls.basis_4)
  def basis_6: SwStyle = SwStyle().addClass(cls.basis_6)
  def basis_8: SwStyle = SwStyle().addClass(cls.basis_8)
  def basis_12: SwStyle = SwStyle().addClass(cls.basis_12)
  def basis_16: SwStyle = SwStyle().addClass(cls.basis_16)
  def basis_20: SwStyle = SwStyle().addClass(cls.basis_20)
  def basis_24: SwStyle = SwStyle().addClass(cls.basis_24)
  def basis_32: SwStyle = SwStyle().addClass(cls.basis_32)
  def basis_40: SwStyle = SwStyle().addClass(cls.basis_40)
  def basis_48: SwStyle = SwStyle().addClass(cls.basis_48)
  def basis_auto: SwStyle = SwStyle().addClass(cls.basis_auto)
  def basis_full: SwStyle = SwStyle().addClass(cls.basis_full)
  def caption_top: SwStyle = SwStyle().addClass(cls.caption_top)
  def caption_bottom: SwStyle = SwStyle().addClass(cls.caption_bottom)
  def border_spacing_0: SwStyle = SwStyle().addClass(cls.border_spacing_0)
  def border_spacing_2: SwStyle = SwStyle().addClass(cls.border_spacing_2)
  def border_spacing_4: SwStyle = SwStyle().addClass(cls.border_spacing_4)
  def border_spacing_6: SwStyle = SwStyle().addClass(cls.border_spacing_6)
  def border_spacing_8: SwStyle = SwStyle().addClass(cls.border_spacing_8)
  def border_spacing_12: SwStyle = SwStyle().addClass(cls.border_spacing_12)
  def border_spacing_16: SwStyle = SwStyle().addClass(cls.border_spacing_16)
  def border_spacing_20: SwStyle = SwStyle().addClass(cls.border_spacing_20)
  def border_spacing_24: SwStyle = SwStyle().addClass(cls.border_spacing_24)
  def border_spacing_32: SwStyle = SwStyle().addClass(cls.border_spacing_32)
  def border_spacing_40: SwStyle = SwStyle().addClass(cls.border_spacing_40)
  def border_spacing_48: SwStyle = SwStyle().addClass(cls.border_spacing_48)
  def border_spacing_x_0: SwStyle = SwStyle().addClass(cls.border_spacing_x_0)
  def border_spacing_x_2: SwStyle = SwStyle().addClass(cls.border_spacing_x_2)
  def border_spacing_x_4: SwStyle = SwStyle().addClass(cls.border_spacing_x_4)
  def border_spacing_x_6: SwStyle = SwStyle().addClass(cls.border_spacing_x_6)
  def border_spacing_x_8: SwStyle = SwStyle().addClass(cls.border_spacing_x_8)
  def border_spacing_x_12: SwStyle = SwStyle().addClass(cls.border_spacing_x_12)
  def border_spacing_x_16: SwStyle = SwStyle().addClass(cls.border_spacing_x_16)
  def border_spacing_x_20: SwStyle = SwStyle().addClass(cls.border_spacing_x_20)
  def border_spacing_x_24: SwStyle = SwStyle().addClass(cls.border_spacing_x_24)
  def border_spacing_x_32: SwStyle = SwStyle().addClass(cls.border_spacing_x_32)
  def border_spacing_x_40: SwStyle = SwStyle().addClass(cls.border_spacing_x_40)
  def border_spacing_x_48: SwStyle = SwStyle().addClass(cls.border_spacing_x_48)
  def border_spacing_y_0: SwStyle = SwStyle().addClass(cls.border_spacing_y_0)
  def border_spacing_y_2: SwStyle = SwStyle().addClass(cls.border_spacing_y_2)
  def border_spacing_y_4: SwStyle = SwStyle().addClass(cls.border_spacing_y_4)
  def border_spacing_y_6: SwStyle = SwStyle().addClass(cls.border_spacing_y_6)
  def border_spacing_y_8: SwStyle = SwStyle().addClass(cls.border_spacing_y_8)
  def border_spacing_y_12: SwStyle = SwStyle().addClass(cls.border_spacing_y_12)
  def border_spacing_y_16: SwStyle = SwStyle().addClass(cls.border_spacing_y_16)
  def border_spacing_y_20: SwStyle = SwStyle().addClass(cls.border_spacing_y_20)
  def border_spacing_y_24: SwStyle = SwStyle().addClass(cls.border_spacing_y_24)
  def border_spacing_y_32: SwStyle = SwStyle().addClass(cls.border_spacing_y_32)
  def border_spacing_y_40: SwStyle = SwStyle().addClass(cls.border_spacing_y_40)
  def border_spacing_y_48: SwStyle = SwStyle().addClass(cls.border_spacing_y_48)
  def cursor_auto: SwStyle = SwStyle().addClass(cls.cursor_auto)
  def cursor_default: SwStyle = SwStyle().addClass(cls.cursor_default)
  def cursor_pointer: SwStyle = SwStyle().addClass(cls.cursor_pointer)
  def cursor_wait: SwStyle = SwStyle().addClass(cls.cursor_wait)
  def cursor_text: SwStyle = SwStyle().addClass(cls.cursor_text)
  def cursor_move: SwStyle = SwStyle().addClass(cls.cursor_move)
  def cursor_help: SwStyle = SwStyle().addClass(cls.cursor_help)
  def cursor_not_allowed: SwStyle = SwStyle().addClass(cls.cursor_not_allowed)
  def cursor_none: SwStyle = SwStyle().addClass(cls.cursor_none)
  def cursor_context_menu: SwStyle = SwStyle().addClass(cls.cursor_context_menu)
  def cursor_progress: SwStyle = SwStyle().addClass(cls.cursor_progress)
  def cursor_cell: SwStyle = SwStyle().addClass(cls.cursor_cell)
  def cursor_crosshair: SwStyle = SwStyle().addClass(cls.cursor_crosshair)
  def cursor_vertical_text: SwStyle = SwStyle().addClass(cls.cursor_vertical_text)
  def cursor_alias: SwStyle = SwStyle().addClass(cls.cursor_alias)
  def cursor_copy: SwStyle = SwStyle().addClass(cls.cursor_copy)
  def cursor_no_drop: SwStyle = SwStyle().addClass(cls.cursor_no_drop)
  def cursor_grab: SwStyle = SwStyle().addClass(cls.cursor_grab)
  def cursor_grabbing: SwStyle = SwStyle().addClass(cls.cursor_grabbing)
  def cursor_all_scroll: SwStyle = SwStyle().addClass(cls.cursor_all_scroll)
  def cursor_col_resize: SwStyle = SwStyle().addClass(cls.cursor_col_resize)
  def cursor_row_resize: SwStyle = SwStyle().addClass(cls.cursor_row_resize)
  def cursor_n_resize: SwStyle = SwStyle().addClass(cls.cursor_n_resize)
  def cursor_e_resize: SwStyle = SwStyle().addClass(cls.cursor_e_resize)
  def cursor_s_resize: SwStyle = SwStyle().addClass(cls.cursor_s_resize)
  def cursor_w_resize: SwStyle = SwStyle().addClass(cls.cursor_w_resize)
  def cursor_ne_resize: SwStyle = SwStyle().addClass(cls.cursor_ne_resize)
  def cursor_nw_resize: SwStyle = SwStyle().addClass(cls.cursor_nw_resize)
  def cursor_se_resize: SwStyle = SwStyle().addClass(cls.cursor_se_resize)
  def cursor_sw_resize: SwStyle = SwStyle().addClass(cls.cursor_sw_resize)
  def cursor_ew_resize: SwStyle = SwStyle().addClass(cls.cursor_ew_resize)
  def cursor_ns_resize: SwStyle = SwStyle().addClass(cls.cursor_ns_resize)
  def cursor_nesw_resize: SwStyle = SwStyle().addClass(cls.cursor_nesw_resize)
  def cursor_nwse_resize: SwStyle = SwStyle().addClass(cls.cursor_nwse_resize)
  def cursor_zoom_in: SwStyle = SwStyle().addClass(cls.cursor_zoom_in)
  def cursor_zoom_out: SwStyle = SwStyle().addClass(cls.cursor_zoom_out)
  def touch_auto: SwStyle = SwStyle().addClass(cls.touch_auto)
  def touch_none: SwStyle = SwStyle().addClass(cls.touch_none)
  def touch_pan_x: SwStyle = SwStyle().addClass(cls.touch_pan_x)
  def touch_pan_left: SwStyle = SwStyle().addClass(cls.touch_pan_left)
  def touch_pan_right: SwStyle = SwStyle().addClass(cls.touch_pan_right)
  def touch_pan_y: SwStyle = SwStyle().addClass(cls.touch_pan_y)
  def touch_pan_up: SwStyle = SwStyle().addClass(cls.touch_pan_up)
  def touch_pan_down: SwStyle = SwStyle().addClass(cls.touch_pan_down)
  def touch_pinch_zoom: SwStyle = SwStyle().addClass(cls.touch_pinch_zoom)
  def touch_manipulation: SwStyle = SwStyle().addClass(cls.touch_manipulation)
  def select_none: SwStyle = SwStyle().addClass(cls.select_none)
  def select_text: SwStyle = SwStyle().addClass(cls.select_text)
  def select_all: SwStyle = SwStyle().addClass(cls.select_all)
  def select_auto: SwStyle = SwStyle().addClass(cls.select_auto)
  def resize_none: SwStyle = SwStyle().addClass(cls.resize_none)
  def resize_y: SwStyle = SwStyle().addClass(cls.resize_y)
  def resize_x: SwStyle = SwStyle().addClass(cls.resize_x)
  def resize: SwStyle = SwStyle().addClass(cls.resize)
  def snap_none: SwStyle = SwStyle().addClass(cls.snap_none)
  def snap_x: SwStyle = SwStyle().addClass(cls.snap_x)
  def snap_y: SwStyle = SwStyle().addClass(cls.snap_y)
  def snap_both: SwStyle = SwStyle().addClass(cls.snap_both)
  def snap_mandatory: SwStyle = SwStyle().addClass(cls.snap_mandatory)
  def snap_proximity: SwStyle = SwStyle().addClass(cls.snap_proximity)
  def snap_start: SwStyle = SwStyle().addClass(cls.snap_start)
  def snap_end: SwStyle = SwStyle().addClass(cls.snap_end)
  def snap_center: SwStyle = SwStyle().addClass(cls.snap_center)
  def snap_align_none: SwStyle = SwStyle().addClass(cls.snap_align_none)
  def snap_normal: SwStyle = SwStyle().addClass(cls.snap_normal)
  def snap_always: SwStyle = SwStyle().addClass(cls.snap_always)
  def scroll_m_0: SwStyle = SwStyle().addClass(cls.scroll_m_0)
  def scroll_m_2: SwStyle = SwStyle().addClass(cls.scroll_m_2)
  def scroll_m_4: SwStyle = SwStyle().addClass(cls.scroll_m_4)
  def scroll_m_6: SwStyle = SwStyle().addClass(cls.scroll_m_6)
  def scroll_m_8: SwStyle = SwStyle().addClass(cls.scroll_m_8)
  def scroll_m_12: SwStyle = SwStyle().addClass(cls.scroll_m_12)
  def scroll_m_16: SwStyle = SwStyle().addClass(cls.scroll_m_16)
  def scroll_m_20: SwStyle = SwStyle().addClass(cls.scroll_m_20)
  def scroll_m_24: SwStyle = SwStyle().addClass(cls.scroll_m_24)
  def scroll_m_32: SwStyle = SwStyle().addClass(cls.scroll_m_32)
  def scroll_m_40: SwStyle = SwStyle().addClass(cls.scroll_m_40)
  def scroll_m_48: SwStyle = SwStyle().addClass(cls.scroll_m_48)
  def _scroll_m_0: SwStyle = SwStyle().addClass(cls._scroll_m_0)
  def _scroll_m_2: SwStyle = SwStyle().addClass(cls._scroll_m_2)
  def _scroll_m_4: SwStyle = SwStyle().addClass(cls._scroll_m_4)
  def _scroll_m_6: SwStyle = SwStyle().addClass(cls._scroll_m_6)
  def _scroll_m_8: SwStyle = SwStyle().addClass(cls._scroll_m_8)
  def _scroll_m_12: SwStyle = SwStyle().addClass(cls._scroll_m_12)
  def _scroll_m_16: SwStyle = SwStyle().addClass(cls._scroll_m_16)
  def _scroll_m_20: SwStyle = SwStyle().addClass(cls._scroll_m_20)
  def _scroll_m_24: SwStyle = SwStyle().addClass(cls._scroll_m_24)
  def _scroll_m_32: SwStyle = SwStyle().addClass(cls._scroll_m_32)
  def _scroll_m_40: SwStyle = SwStyle().addClass(cls._scroll_m_40)
  def _scroll_m_48: SwStyle = SwStyle().addClass(cls._scroll_m_48)
  def scroll_mx_0: SwStyle = SwStyle().addClass(cls.scroll_mx_0)
  def scroll_mx_2: SwStyle = SwStyle().addClass(cls.scroll_mx_2)
  def scroll_mx_4: SwStyle = SwStyle().addClass(cls.scroll_mx_4)
  def scroll_mx_6: SwStyle = SwStyle().addClass(cls.scroll_mx_6)
  def scroll_mx_8: SwStyle = SwStyle().addClass(cls.scroll_mx_8)
  def scroll_mx_12: SwStyle = SwStyle().addClass(cls.scroll_mx_12)
  def scroll_mx_16: SwStyle = SwStyle().addClass(cls.scroll_mx_16)
  def scroll_mx_20: SwStyle = SwStyle().addClass(cls.scroll_mx_20)
  def scroll_mx_24: SwStyle = SwStyle().addClass(cls.scroll_mx_24)
  def scroll_mx_32: SwStyle = SwStyle().addClass(cls.scroll_mx_32)
  def scroll_mx_40: SwStyle = SwStyle().addClass(cls.scroll_mx_40)
  def scroll_mx_48: SwStyle = SwStyle().addClass(cls.scroll_mx_48)
  def _scroll_mx_0: SwStyle = SwStyle().addClass(cls._scroll_mx_0)
  def _scroll_mx_2: SwStyle = SwStyle().addClass(cls._scroll_mx_2)
  def _scroll_mx_4: SwStyle = SwStyle().addClass(cls._scroll_mx_4)
  def _scroll_mx_6: SwStyle = SwStyle().addClass(cls._scroll_mx_6)
  def _scroll_mx_8: SwStyle = SwStyle().addClass(cls._scroll_mx_8)
  def _scroll_mx_12: SwStyle = SwStyle().addClass(cls._scroll_mx_12)
  def _scroll_mx_16: SwStyle = SwStyle().addClass(cls._scroll_mx_16)
  def _scroll_mx_20: SwStyle = SwStyle().addClass(cls._scroll_mx_20)
  def _scroll_mx_24: SwStyle = SwStyle().addClass(cls._scroll_mx_24)
  def _scroll_mx_32: SwStyle = SwStyle().addClass(cls._scroll_mx_32)
  def _scroll_mx_40: SwStyle = SwStyle().addClass(cls._scroll_mx_40)
  def _scroll_mx_48: SwStyle = SwStyle().addClass(cls._scroll_mx_48)
  def scroll_my_0: SwStyle = SwStyle().addClass(cls.scroll_my_0)
  def scroll_my_2: SwStyle = SwStyle().addClass(cls.scroll_my_2)
  def scroll_my_4: SwStyle = SwStyle().addClass(cls.scroll_my_4)
  def scroll_my_6: SwStyle = SwStyle().addClass(cls.scroll_my_6)
  def scroll_my_8: SwStyle = SwStyle().addClass(cls.scroll_my_8)
  def scroll_my_12: SwStyle = SwStyle().addClass(cls.scroll_my_12)
  def scroll_my_16: SwStyle = SwStyle().addClass(cls.scroll_my_16)
  def scroll_my_20: SwStyle = SwStyle().addClass(cls.scroll_my_20)
  def scroll_my_24: SwStyle = SwStyle().addClass(cls.scroll_my_24)
  def scroll_my_32: SwStyle = SwStyle().addClass(cls.scroll_my_32)
  def scroll_my_40: SwStyle = SwStyle().addClass(cls.scroll_my_40)
  def scroll_my_48: SwStyle = SwStyle().addClass(cls.scroll_my_48)
  def _scroll_my_0: SwStyle = SwStyle().addClass(cls._scroll_my_0)
  def _scroll_my_2: SwStyle = SwStyle().addClass(cls._scroll_my_2)
  def _scroll_my_4: SwStyle = SwStyle().addClass(cls._scroll_my_4)
  def _scroll_my_6: SwStyle = SwStyle().addClass(cls._scroll_my_6)
  def _scroll_my_8: SwStyle = SwStyle().addClass(cls._scroll_my_8)
  def _scroll_my_12: SwStyle = SwStyle().addClass(cls._scroll_my_12)
  def _scroll_my_16: SwStyle = SwStyle().addClass(cls._scroll_my_16)
  def _scroll_my_20: SwStyle = SwStyle().addClass(cls._scroll_my_20)
  def _scroll_my_24: SwStyle = SwStyle().addClass(cls._scroll_my_24)
  def _scroll_my_32: SwStyle = SwStyle().addClass(cls._scroll_my_32)
  def _scroll_my_40: SwStyle = SwStyle().addClass(cls._scroll_my_40)
  def _scroll_my_48: SwStyle = SwStyle().addClass(cls._scroll_my_48)
  def scroll_ms_0: SwStyle = SwStyle().addClass(cls.scroll_ms_0)
  def scroll_ms_2: SwStyle = SwStyle().addClass(cls.scroll_ms_2)
  def scroll_ms_4: SwStyle = SwStyle().addClass(cls.scroll_ms_4)
  def scroll_ms_6: SwStyle = SwStyle().addClass(cls.scroll_ms_6)
  def scroll_ms_8: SwStyle = SwStyle().addClass(cls.scroll_ms_8)
  def scroll_ms_12: SwStyle = SwStyle().addClass(cls.scroll_ms_12)
  def scroll_ms_16: SwStyle = SwStyle().addClass(cls.scroll_ms_16)
  def scroll_ms_20: SwStyle = SwStyle().addClass(cls.scroll_ms_20)
  def scroll_ms_24: SwStyle = SwStyle().addClass(cls.scroll_ms_24)
  def scroll_ms_32: SwStyle = SwStyle().addClass(cls.scroll_ms_32)
  def scroll_ms_40: SwStyle = SwStyle().addClass(cls.scroll_ms_40)
  def scroll_ms_48: SwStyle = SwStyle().addClass(cls.scroll_ms_48)
  def _scroll_ms_0: SwStyle = SwStyle().addClass(cls._scroll_ms_0)
  def _scroll_ms_2: SwStyle = SwStyle().addClass(cls._scroll_ms_2)
  def _scroll_ms_4: SwStyle = SwStyle().addClass(cls._scroll_ms_4)
  def _scroll_ms_6: SwStyle = SwStyle().addClass(cls._scroll_ms_6)
  def _scroll_ms_8: SwStyle = SwStyle().addClass(cls._scroll_ms_8)
  def _scroll_ms_12: SwStyle = SwStyle().addClass(cls._scroll_ms_12)
  def _scroll_ms_16: SwStyle = SwStyle().addClass(cls._scroll_ms_16)
  def _scroll_ms_20: SwStyle = SwStyle().addClass(cls._scroll_ms_20)
  def _scroll_ms_24: SwStyle = SwStyle().addClass(cls._scroll_ms_24)
  def _scroll_ms_32: SwStyle = SwStyle().addClass(cls._scroll_ms_32)
  def _scroll_ms_40: SwStyle = SwStyle().addClass(cls._scroll_ms_40)
  def _scroll_ms_48: SwStyle = SwStyle().addClass(cls._scroll_ms_48)
  def scroll_me_0: SwStyle = SwStyle().addClass(cls.scroll_me_0)
  def scroll_me_2: SwStyle = SwStyle().addClass(cls.scroll_me_2)
  def scroll_me_4: SwStyle = SwStyle().addClass(cls.scroll_me_4)
  def scroll_me_6: SwStyle = SwStyle().addClass(cls.scroll_me_6)
  def scroll_me_8: SwStyle = SwStyle().addClass(cls.scroll_me_8)
  def scroll_me_12: SwStyle = SwStyle().addClass(cls.scroll_me_12)
  def scroll_me_16: SwStyle = SwStyle().addClass(cls.scroll_me_16)
  def scroll_me_20: SwStyle = SwStyle().addClass(cls.scroll_me_20)
  def scroll_me_24: SwStyle = SwStyle().addClass(cls.scroll_me_24)
  def scroll_me_32: SwStyle = SwStyle().addClass(cls.scroll_me_32)
  def scroll_me_40: SwStyle = SwStyle().addClass(cls.scroll_me_40)
  def scroll_me_48: SwStyle = SwStyle().addClass(cls.scroll_me_48)
  def _scroll_me_0: SwStyle = SwStyle().addClass(cls._scroll_me_0)
  def _scroll_me_2: SwStyle = SwStyle().addClass(cls._scroll_me_2)
  def _scroll_me_4: SwStyle = SwStyle().addClass(cls._scroll_me_4)
  def _scroll_me_6: SwStyle = SwStyle().addClass(cls._scroll_me_6)
  def _scroll_me_8: SwStyle = SwStyle().addClass(cls._scroll_me_8)
  def _scroll_me_12: SwStyle = SwStyle().addClass(cls._scroll_me_12)
  def _scroll_me_16: SwStyle = SwStyle().addClass(cls._scroll_me_16)
  def _scroll_me_20: SwStyle = SwStyle().addClass(cls._scroll_me_20)
  def _scroll_me_24: SwStyle = SwStyle().addClass(cls._scroll_me_24)
  def _scroll_me_32: SwStyle = SwStyle().addClass(cls._scroll_me_32)
  def _scroll_me_40: SwStyle = SwStyle().addClass(cls._scroll_me_40)
  def _scroll_me_48: SwStyle = SwStyle().addClass(cls._scroll_me_48)
  def scroll_mt_0: SwStyle = SwStyle().addClass(cls.scroll_mt_0)
  def scroll_mt_2: SwStyle = SwStyle().addClass(cls.scroll_mt_2)
  def scroll_mt_4: SwStyle = SwStyle().addClass(cls.scroll_mt_4)
  def scroll_mt_6: SwStyle = SwStyle().addClass(cls.scroll_mt_6)
  def scroll_mt_8: SwStyle = SwStyle().addClass(cls.scroll_mt_8)
  def scroll_mt_12: SwStyle = SwStyle().addClass(cls.scroll_mt_12)
  def scroll_mt_16: SwStyle = SwStyle().addClass(cls.scroll_mt_16)
  def scroll_mt_20: SwStyle = SwStyle().addClass(cls.scroll_mt_20)
  def scroll_mt_24: SwStyle = SwStyle().addClass(cls.scroll_mt_24)
  def scroll_mt_32: SwStyle = SwStyle().addClass(cls.scroll_mt_32)
  def scroll_mt_40: SwStyle = SwStyle().addClass(cls.scroll_mt_40)
  def scroll_mt_48: SwStyle = SwStyle().addClass(cls.scroll_mt_48)
  def _scroll_mt_0: SwStyle = SwStyle().addClass(cls._scroll_mt_0)
  def _scroll_mt_2: SwStyle = SwStyle().addClass(cls._scroll_mt_2)
  def _scroll_mt_4: SwStyle = SwStyle().addClass(cls._scroll_mt_4)
  def _scroll_mt_6: SwStyle = SwStyle().addClass(cls._scroll_mt_6)
  def _scroll_mt_8: SwStyle = SwStyle().addClass(cls._scroll_mt_8)
  def _scroll_mt_12: SwStyle = SwStyle().addClass(cls._scroll_mt_12)
  def _scroll_mt_16: SwStyle = SwStyle().addClass(cls._scroll_mt_16)
  def _scroll_mt_20: SwStyle = SwStyle().addClass(cls._scroll_mt_20)
  def _scroll_mt_24: SwStyle = SwStyle().addClass(cls._scroll_mt_24)
  def _scroll_mt_32: SwStyle = SwStyle().addClass(cls._scroll_mt_32)
  def _scroll_mt_40: SwStyle = SwStyle().addClass(cls._scroll_mt_40)
  def _scroll_mt_48: SwStyle = SwStyle().addClass(cls._scroll_mt_48)
  def scroll_mr_0: SwStyle = SwStyle().addClass(cls.scroll_mr_0)
  def scroll_mr_2: SwStyle = SwStyle().addClass(cls.scroll_mr_2)
  def scroll_mr_4: SwStyle = SwStyle().addClass(cls.scroll_mr_4)
  def scroll_mr_6: SwStyle = SwStyle().addClass(cls.scroll_mr_6)
  def scroll_mr_8: SwStyle = SwStyle().addClass(cls.scroll_mr_8)
  def scroll_mr_12: SwStyle = SwStyle().addClass(cls.scroll_mr_12)
  def scroll_mr_16: SwStyle = SwStyle().addClass(cls.scroll_mr_16)
  def scroll_mr_20: SwStyle = SwStyle().addClass(cls.scroll_mr_20)
  def scroll_mr_24: SwStyle = SwStyle().addClass(cls.scroll_mr_24)
  def scroll_mr_32: SwStyle = SwStyle().addClass(cls.scroll_mr_32)
  def scroll_mr_40: SwStyle = SwStyle().addClass(cls.scroll_mr_40)
  def scroll_mr_48: SwStyle = SwStyle().addClass(cls.scroll_mr_48)
  def _scroll_mr_0: SwStyle = SwStyle().addClass(cls._scroll_mr_0)
  def _scroll_mr_2: SwStyle = SwStyle().addClass(cls._scroll_mr_2)
  def _scroll_mr_4: SwStyle = SwStyle().addClass(cls._scroll_mr_4)
  def _scroll_mr_6: SwStyle = SwStyle().addClass(cls._scroll_mr_6)
  def _scroll_mr_8: SwStyle = SwStyle().addClass(cls._scroll_mr_8)
  def _scroll_mr_12: SwStyle = SwStyle().addClass(cls._scroll_mr_12)
  def _scroll_mr_16: SwStyle = SwStyle().addClass(cls._scroll_mr_16)
  def _scroll_mr_20: SwStyle = SwStyle().addClass(cls._scroll_mr_20)
  def _scroll_mr_24: SwStyle = SwStyle().addClass(cls._scroll_mr_24)
  def _scroll_mr_32: SwStyle = SwStyle().addClass(cls._scroll_mr_32)
  def _scroll_mr_40: SwStyle = SwStyle().addClass(cls._scroll_mr_40)
  def _scroll_mr_48: SwStyle = SwStyle().addClass(cls._scroll_mr_48)
  def scroll_mb_0: SwStyle = SwStyle().addClass(cls.scroll_mb_0)
  def scroll_mb_2: SwStyle = SwStyle().addClass(cls.scroll_mb_2)
  def scroll_mb_4: SwStyle = SwStyle().addClass(cls.scroll_mb_4)
  def scroll_mb_6: SwStyle = SwStyle().addClass(cls.scroll_mb_6)
  def scroll_mb_8: SwStyle = SwStyle().addClass(cls.scroll_mb_8)
  def scroll_mb_12: SwStyle = SwStyle().addClass(cls.scroll_mb_12)
  def scroll_mb_16: SwStyle = SwStyle().addClass(cls.scroll_mb_16)
  def scroll_mb_20: SwStyle = SwStyle().addClass(cls.scroll_mb_20)
  def scroll_mb_24: SwStyle = SwStyle().addClass(cls.scroll_mb_24)
  def scroll_mb_32: SwStyle = SwStyle().addClass(cls.scroll_mb_32)
  def scroll_mb_40: SwStyle = SwStyle().addClass(cls.scroll_mb_40)
  def scroll_mb_48: SwStyle = SwStyle().addClass(cls.scroll_mb_48)
  def _scroll_mb_0: SwStyle = SwStyle().addClass(cls._scroll_mb_0)
  def _scroll_mb_2: SwStyle = SwStyle().addClass(cls._scroll_mb_2)
  def _scroll_mb_4: SwStyle = SwStyle().addClass(cls._scroll_mb_4)
  def _scroll_mb_6: SwStyle = SwStyle().addClass(cls._scroll_mb_6)
  def _scroll_mb_8: SwStyle = SwStyle().addClass(cls._scroll_mb_8)
  def _scroll_mb_12: SwStyle = SwStyle().addClass(cls._scroll_mb_12)
  def _scroll_mb_16: SwStyle = SwStyle().addClass(cls._scroll_mb_16)
  def _scroll_mb_20: SwStyle = SwStyle().addClass(cls._scroll_mb_20)
  def _scroll_mb_24: SwStyle = SwStyle().addClass(cls._scroll_mb_24)
  def _scroll_mb_32: SwStyle = SwStyle().addClass(cls._scroll_mb_32)
  def _scroll_mb_40: SwStyle = SwStyle().addClass(cls._scroll_mb_40)
  def _scroll_mb_48: SwStyle = SwStyle().addClass(cls._scroll_mb_48)
  def scroll_ml_0: SwStyle = SwStyle().addClass(cls.scroll_ml_0)
  def scroll_ml_2: SwStyle = SwStyle().addClass(cls.scroll_ml_2)
  def scroll_ml_4: SwStyle = SwStyle().addClass(cls.scroll_ml_4)
  def scroll_ml_6: SwStyle = SwStyle().addClass(cls.scroll_ml_6)
  def scroll_ml_8: SwStyle = SwStyle().addClass(cls.scroll_ml_8)
  def scroll_ml_12: SwStyle = SwStyle().addClass(cls.scroll_ml_12)
  def scroll_ml_16: SwStyle = SwStyle().addClass(cls.scroll_ml_16)
  def scroll_ml_20: SwStyle = SwStyle().addClass(cls.scroll_ml_20)
  def scroll_ml_24: SwStyle = SwStyle().addClass(cls.scroll_ml_24)
  def scroll_ml_32: SwStyle = SwStyle().addClass(cls.scroll_ml_32)
  def scroll_ml_40: SwStyle = SwStyle().addClass(cls.scroll_ml_40)
  def scroll_ml_48: SwStyle = SwStyle().addClass(cls.scroll_ml_48)
  def _scroll_ml_0: SwStyle = SwStyle().addClass(cls._scroll_ml_0)
  def _scroll_ml_2: SwStyle = SwStyle().addClass(cls._scroll_ml_2)
  def _scroll_ml_4: SwStyle = SwStyle().addClass(cls._scroll_ml_4)
  def _scroll_ml_6: SwStyle = SwStyle().addClass(cls._scroll_ml_6)
  def _scroll_ml_8: SwStyle = SwStyle().addClass(cls._scroll_ml_8)
  def _scroll_ml_12: SwStyle = SwStyle().addClass(cls._scroll_ml_12)
  def _scroll_ml_16: SwStyle = SwStyle().addClass(cls._scroll_ml_16)
  def _scroll_ml_20: SwStyle = SwStyle().addClass(cls._scroll_ml_20)
  def _scroll_ml_24: SwStyle = SwStyle().addClass(cls._scroll_ml_24)
  def _scroll_ml_32: SwStyle = SwStyle().addClass(cls._scroll_ml_32)
  def _scroll_ml_40: SwStyle = SwStyle().addClass(cls._scroll_ml_40)
  def _scroll_ml_48: SwStyle = SwStyle().addClass(cls._scroll_ml_48)
  def scroll_p_0: SwStyle = SwStyle().addClass(cls.scroll_p_0)
  def scroll_p_2: SwStyle = SwStyle().addClass(cls.scroll_p_2)
  def scroll_p_4: SwStyle = SwStyle().addClass(cls.scroll_p_4)
  def scroll_p_6: SwStyle = SwStyle().addClass(cls.scroll_p_6)
  def scroll_p_8: SwStyle = SwStyle().addClass(cls.scroll_p_8)
  def scroll_p_12: SwStyle = SwStyle().addClass(cls.scroll_p_12)
  def scroll_p_16: SwStyle = SwStyle().addClass(cls.scroll_p_16)
  def scroll_p_20: SwStyle = SwStyle().addClass(cls.scroll_p_20)
  def scroll_p_24: SwStyle = SwStyle().addClass(cls.scroll_p_24)
  def scroll_p_32: SwStyle = SwStyle().addClass(cls.scroll_p_32)
  def scroll_p_40: SwStyle = SwStyle().addClass(cls.scroll_p_40)
  def scroll_p_48: SwStyle = SwStyle().addClass(cls.scroll_p_48)
  def scroll_px_0: SwStyle = SwStyle().addClass(cls.scroll_px_0)
  def scroll_px_2: SwStyle = SwStyle().addClass(cls.scroll_px_2)
  def scroll_px_4: SwStyle = SwStyle().addClass(cls.scroll_px_4)
  def scroll_px_6: SwStyle = SwStyle().addClass(cls.scroll_px_6)
  def scroll_px_8: SwStyle = SwStyle().addClass(cls.scroll_px_8)
  def scroll_px_12: SwStyle = SwStyle().addClass(cls.scroll_px_12)
  def scroll_px_16: SwStyle = SwStyle().addClass(cls.scroll_px_16)
  def scroll_px_20: SwStyle = SwStyle().addClass(cls.scroll_px_20)
  def scroll_px_24: SwStyle = SwStyle().addClass(cls.scroll_px_24)
  def scroll_px_32: SwStyle = SwStyle().addClass(cls.scroll_px_32)
  def scroll_px_40: SwStyle = SwStyle().addClass(cls.scroll_px_40)
  def scroll_px_48: SwStyle = SwStyle().addClass(cls.scroll_px_48)
  def scroll_py_0: SwStyle = SwStyle().addClass(cls.scroll_py_0)
  def scroll_py_2: SwStyle = SwStyle().addClass(cls.scroll_py_2)
  def scroll_py_4: SwStyle = SwStyle().addClass(cls.scroll_py_4)
  def scroll_py_6: SwStyle = SwStyle().addClass(cls.scroll_py_6)
  def scroll_py_8: SwStyle = SwStyle().addClass(cls.scroll_py_8)
  def scroll_py_12: SwStyle = SwStyle().addClass(cls.scroll_py_12)
  def scroll_py_16: SwStyle = SwStyle().addClass(cls.scroll_py_16)
  def scroll_py_20: SwStyle = SwStyle().addClass(cls.scroll_py_20)
  def scroll_py_24: SwStyle = SwStyle().addClass(cls.scroll_py_24)
  def scroll_py_32: SwStyle = SwStyle().addClass(cls.scroll_py_32)
  def scroll_py_40: SwStyle = SwStyle().addClass(cls.scroll_py_40)
  def scroll_py_48: SwStyle = SwStyle().addClass(cls.scroll_py_48)
  def scroll_ps_0: SwStyle = SwStyle().addClass(cls.scroll_ps_0)
  def scroll_ps_2: SwStyle = SwStyle().addClass(cls.scroll_ps_2)
  def scroll_ps_4: SwStyle = SwStyle().addClass(cls.scroll_ps_4)
  def scroll_ps_6: SwStyle = SwStyle().addClass(cls.scroll_ps_6)
  def scroll_ps_8: SwStyle = SwStyle().addClass(cls.scroll_ps_8)
  def scroll_ps_12: SwStyle = SwStyle().addClass(cls.scroll_ps_12)
  def scroll_ps_16: SwStyle = SwStyle().addClass(cls.scroll_ps_16)
  def scroll_ps_20: SwStyle = SwStyle().addClass(cls.scroll_ps_20)
  def scroll_ps_24: SwStyle = SwStyle().addClass(cls.scroll_ps_24)
  def scroll_ps_32: SwStyle = SwStyle().addClass(cls.scroll_ps_32)
  def scroll_ps_40: SwStyle = SwStyle().addClass(cls.scroll_ps_40)
  def scroll_ps_48: SwStyle = SwStyle().addClass(cls.scroll_ps_48)
  def scroll_pe_0: SwStyle = SwStyle().addClass(cls.scroll_pe_0)
  def scroll_pe_2: SwStyle = SwStyle().addClass(cls.scroll_pe_2)
  def scroll_pe_4: SwStyle = SwStyle().addClass(cls.scroll_pe_4)
  def scroll_pe_6: SwStyle = SwStyle().addClass(cls.scroll_pe_6)
  def scroll_pe_8: SwStyle = SwStyle().addClass(cls.scroll_pe_8)
  def scroll_pe_12: SwStyle = SwStyle().addClass(cls.scroll_pe_12)
  def scroll_pe_16: SwStyle = SwStyle().addClass(cls.scroll_pe_16)
  def scroll_pe_20: SwStyle = SwStyle().addClass(cls.scroll_pe_20)
  def scroll_pe_24: SwStyle = SwStyle().addClass(cls.scroll_pe_24)
  def scroll_pe_32: SwStyle = SwStyle().addClass(cls.scroll_pe_32)
  def scroll_pe_40: SwStyle = SwStyle().addClass(cls.scroll_pe_40)
  def scroll_pe_48: SwStyle = SwStyle().addClass(cls.scroll_pe_48)
  def scroll_pt_0: SwStyle = SwStyle().addClass(cls.scroll_pt_0)
  def scroll_pt_2: SwStyle = SwStyle().addClass(cls.scroll_pt_2)
  def scroll_pt_4: SwStyle = SwStyle().addClass(cls.scroll_pt_4)
  def scroll_pt_6: SwStyle = SwStyle().addClass(cls.scroll_pt_6)
  def scroll_pt_8: SwStyle = SwStyle().addClass(cls.scroll_pt_8)
  def scroll_pt_12: SwStyle = SwStyle().addClass(cls.scroll_pt_12)
  def scroll_pt_16: SwStyle = SwStyle().addClass(cls.scroll_pt_16)
  def scroll_pt_20: SwStyle = SwStyle().addClass(cls.scroll_pt_20)
  def scroll_pt_24: SwStyle = SwStyle().addClass(cls.scroll_pt_24)
  def scroll_pt_32: SwStyle = SwStyle().addClass(cls.scroll_pt_32)
  def scroll_pt_40: SwStyle = SwStyle().addClass(cls.scroll_pt_40)
  def scroll_pt_48: SwStyle = SwStyle().addClass(cls.scroll_pt_48)
  def scroll_pr_0: SwStyle = SwStyle().addClass(cls.scroll_pr_0)
  def scroll_pr_2: SwStyle = SwStyle().addClass(cls.scroll_pr_2)
  def scroll_pr_4: SwStyle = SwStyle().addClass(cls.scroll_pr_4)
  def scroll_pr_6: SwStyle = SwStyle().addClass(cls.scroll_pr_6)
  def scroll_pr_8: SwStyle = SwStyle().addClass(cls.scroll_pr_8)
  def scroll_pr_12: SwStyle = SwStyle().addClass(cls.scroll_pr_12)
  def scroll_pr_16: SwStyle = SwStyle().addClass(cls.scroll_pr_16)
  def scroll_pr_20: SwStyle = SwStyle().addClass(cls.scroll_pr_20)
  def scroll_pr_24: SwStyle = SwStyle().addClass(cls.scroll_pr_24)
  def scroll_pr_32: SwStyle = SwStyle().addClass(cls.scroll_pr_32)
  def scroll_pr_40: SwStyle = SwStyle().addClass(cls.scroll_pr_40)
  def scroll_pr_48: SwStyle = SwStyle().addClass(cls.scroll_pr_48)
  def scroll_pb_0: SwStyle = SwStyle().addClass(cls.scroll_pb_0)
  def scroll_pb_2: SwStyle = SwStyle().addClass(cls.scroll_pb_2)
  def scroll_pb_4: SwStyle = SwStyle().addClass(cls.scroll_pb_4)
  def scroll_pb_6: SwStyle = SwStyle().addClass(cls.scroll_pb_6)
  def scroll_pb_8: SwStyle = SwStyle().addClass(cls.scroll_pb_8)
  def scroll_pb_12: SwStyle = SwStyle().addClass(cls.scroll_pb_12)
  def scroll_pb_16: SwStyle = SwStyle().addClass(cls.scroll_pb_16)
  def scroll_pb_20: SwStyle = SwStyle().addClass(cls.scroll_pb_20)
  def scroll_pb_24: SwStyle = SwStyle().addClass(cls.scroll_pb_24)
  def scroll_pb_32: SwStyle = SwStyle().addClass(cls.scroll_pb_32)
  def scroll_pb_40: SwStyle = SwStyle().addClass(cls.scroll_pb_40)
  def scroll_pb_48: SwStyle = SwStyle().addClass(cls.scroll_pb_48)
  def scroll_pl_0: SwStyle = SwStyle().addClass(cls.scroll_pl_0)
  def scroll_pl_2: SwStyle = SwStyle().addClass(cls.scroll_pl_2)
  def scroll_pl_4: SwStyle = SwStyle().addClass(cls.scroll_pl_4)
  def scroll_pl_6: SwStyle = SwStyle().addClass(cls.scroll_pl_6)
  def scroll_pl_8: SwStyle = SwStyle().addClass(cls.scroll_pl_8)
  def scroll_pl_12: SwStyle = SwStyle().addClass(cls.scroll_pl_12)
  def scroll_pl_16: SwStyle = SwStyle().addClass(cls.scroll_pl_16)
  def scroll_pl_20: SwStyle = SwStyle().addClass(cls.scroll_pl_20)
  def scroll_pl_24: SwStyle = SwStyle().addClass(cls.scroll_pl_24)
  def scroll_pl_32: SwStyle = SwStyle().addClass(cls.scroll_pl_32)
  def scroll_pl_40: SwStyle = SwStyle().addClass(cls.scroll_pl_40)
  def scroll_pl_48: SwStyle = SwStyle().addClass(cls.scroll_pl_48)
  def list_image_none: SwStyle = SwStyle().addClass(cls.list_image_none)
  def columns_1: SwStyle = SwStyle().addClass(cls.columns_1)
  def columns_2: SwStyle = SwStyle().addClass(cls.columns_2)
  def columns_3: SwStyle = SwStyle().addClass(cls.columns_3)
  def columns_4: SwStyle = SwStyle().addClass(cls.columns_4)
  def columns_5: SwStyle = SwStyle().addClass(cls.columns_5)
  def columns_6: SwStyle = SwStyle().addClass(cls.columns_6)
  def columns_7: SwStyle = SwStyle().addClass(cls.columns_7)
  def columns_8: SwStyle = SwStyle().addClass(cls.columns_8)
  def columns_9: SwStyle = SwStyle().addClass(cls.columns_9)
  def columns_10: SwStyle = SwStyle().addClass(cls.columns_10)
  def columns_11: SwStyle = SwStyle().addClass(cls.columns_11)
  def columns_12: SwStyle = SwStyle().addClass(cls.columns_12)
  def columns_auto: SwStyle = SwStyle().addClass(cls.columns_auto)
  def columns_3xs: SwStyle = SwStyle().addClass(cls.columns_3xs)
  def columns_2xs: SwStyle = SwStyle().addClass(cls.columns_2xs)
  def columns_xs: SwStyle = SwStyle().addClass(cls.columns_xs)
  def columns_sm: SwStyle = SwStyle().addClass(cls.columns_sm)
  def columns_md: SwStyle = SwStyle().addClass(cls.columns_md)
  def columns_lg: SwStyle = SwStyle().addClass(cls.columns_lg)
  def columns_xl: SwStyle = SwStyle().addClass(cls.columns_xl)
  def columns_2xl: SwStyle = SwStyle().addClass(cls.columns_2xl)
  def columns_3xl: SwStyle = SwStyle().addClass(cls.columns_3xl)
  def columns_4xl: SwStyle = SwStyle().addClass(cls.columns_4xl)
  def columns_5xl: SwStyle = SwStyle().addClass(cls.columns_5xl)
  def columns_6xl: SwStyle = SwStyle().addClass(cls.columns_6xl)
  def columns_7xl: SwStyle = SwStyle().addClass(cls.columns_7xl)
  def break_before_auto: SwStyle = SwStyle().addClass(cls.break_before_auto)
  def break_before_avoid: SwStyle = SwStyle().addClass(cls.break_before_avoid)
  def break_before_all: SwStyle = SwStyle().addClass(cls.break_before_all)
  def break_before_avoid_page: SwStyle = SwStyle().addClass(cls.break_before_avoid_page)
  def break_before_page: SwStyle = SwStyle().addClass(cls.break_before_page)
  def break_before_left: SwStyle = SwStyle().addClass(cls.break_before_left)
  def break_before_right: SwStyle = SwStyle().addClass(cls.break_before_right)
  def break_before_column: SwStyle = SwStyle().addClass(cls.break_before_column)
  def break_inside_auto: SwStyle = SwStyle().addClass(cls.break_inside_auto)
  def break_inside_avoid: SwStyle = SwStyle().addClass(cls.break_inside_avoid)
  def break_inside_avoid_page: SwStyle = SwStyle().addClass(cls.break_inside_avoid_page)
  def break_inside_avoid_column: SwStyle = SwStyle().addClass(cls.break_inside_avoid_column)
  def break_after_auto: SwStyle = SwStyle().addClass(cls.break_after_auto)
  def break_after_avoid: SwStyle = SwStyle().addClass(cls.break_after_avoid)
  def break_after_all: SwStyle = SwStyle().addClass(cls.break_after_all)
  def break_after_avoid_page: SwStyle = SwStyle().addClass(cls.break_after_avoid_page)
  def break_after_page: SwStyle = SwStyle().addClass(cls.break_after_page)
  def break_after_left: SwStyle = SwStyle().addClass(cls.break_after_left)
  def break_after_right: SwStyle = SwStyle().addClass(cls.break_after_right)
  def break_after_column: SwStyle = SwStyle().addClass(cls.break_after_column)
  def grid_cols_1: SwStyle = SwStyle().addClass(cls.grid_cols_1)
  def grid_cols_2: SwStyle = SwStyle().addClass(cls.grid_cols_2)
  def grid_cols_3: SwStyle = SwStyle().addClass(cls.grid_cols_3)
  def grid_cols_4: SwStyle = SwStyle().addClass(cls.grid_cols_4)
  def grid_cols_5: SwStyle = SwStyle().addClass(cls.grid_cols_5)
  def grid_cols_6: SwStyle = SwStyle().addClass(cls.grid_cols_6)
  def grid_cols_7: SwStyle = SwStyle().addClass(cls.grid_cols_7)
  def grid_cols_8: SwStyle = SwStyle().addClass(cls.grid_cols_8)
  def grid_cols_9: SwStyle = SwStyle().addClass(cls.grid_cols_9)
  def grid_cols_10: SwStyle = SwStyle().addClass(cls.grid_cols_10)
  def grid_cols_11: SwStyle = SwStyle().addClass(cls.grid_cols_11)
  def grid_cols_12: SwStyle = SwStyle().addClass(cls.grid_cols_12)
  def grid_cols_none: SwStyle = SwStyle().addClass(cls.grid_cols_none)
  def grid_cols_subgrid: SwStyle = SwStyle().addClass(cls.grid_cols_subgrid)
  def flex_row: SwStyle = SwStyle().addClass(cls.flex_row)
  def flex_row_reverse: SwStyle = SwStyle().addClass(cls.flex_row_reverse)
  def flex_col: SwStyle = SwStyle().addClass(cls.flex_col)
  def flex_col_reverse: SwStyle = SwStyle().addClass(cls.flex_col_reverse)
  def flex_wrap: SwStyle = SwStyle().addClass(cls.flex_wrap)
  def flex_wrap_reverse: SwStyle = SwStyle().addClass(cls.flex_wrap_reverse)
  def flex_nowrap: SwStyle = SwStyle().addClass(cls.flex_nowrap)
  def items_start: SwStyle = SwStyle().addClass(cls.items_start)
  def items_end: SwStyle = SwStyle().addClass(cls.items_end)
  def items_center: SwStyle = SwStyle().addClass(cls.items_center)
  def items_baseline: SwStyle = SwStyle().addClass(cls.items_baseline)
  def items_stretch: SwStyle = SwStyle().addClass(cls.items_stretch)
  def justify_normal: SwStyle = SwStyle().addClass(cls.justify_normal)
  def justify_start: SwStyle = SwStyle().addClass(cls.justify_start)
  def justify_end: SwStyle = SwStyle().addClass(cls.justify_end)
  def justify_center: SwStyle = SwStyle().addClass(cls.justify_center)
  def justify_between: SwStyle = SwStyle().addClass(cls.justify_between)
  def justify_around: SwStyle = SwStyle().addClass(cls.justify_around)
  def justify_evenly: SwStyle = SwStyle().addClass(cls.justify_evenly)
  def justify_stretch: SwStyle = SwStyle().addClass(cls.justify_stretch)
  def justify_items_start: SwStyle = SwStyle().addClass(cls.justify_items_start)
  def justify_items_end: SwStyle = SwStyle().addClass(cls.justify_items_end)
  def justify_items_center: SwStyle = SwStyle().addClass(cls.justify_items_center)
  def justify_items_stretch: SwStyle = SwStyle().addClass(cls.justify_items_stretch)
  def gap_0: SwStyle = SwStyle().addClass(cls.gap_0)
  def gap_2: SwStyle = SwStyle().addClass(cls.gap_2)
  def gap_4: SwStyle = SwStyle().addClass(cls.gap_4)
  def gap_6: SwStyle = SwStyle().addClass(cls.gap_6)
  def gap_8: SwStyle = SwStyle().addClass(cls.gap_8)
  def gap_12: SwStyle = SwStyle().addClass(cls.gap_12)
  def gap_16: SwStyle = SwStyle().addClass(cls.gap_16)
  def gap_20: SwStyle = SwStyle().addClass(cls.gap_20)
  def gap_24: SwStyle = SwStyle().addClass(cls.gap_24)
  def gap_32: SwStyle = SwStyle().addClass(cls.gap_32)
  def gap_40: SwStyle = SwStyle().addClass(cls.gap_40)
  def gap_48: SwStyle = SwStyle().addClass(cls.gap_48)
  def gap_x_0: SwStyle = SwStyle().addClass(cls.gap_x_0)
  def gap_x_2: SwStyle = SwStyle().addClass(cls.gap_x_2)
  def gap_x_4: SwStyle = SwStyle().addClass(cls.gap_x_4)
  def gap_x_6: SwStyle = SwStyle().addClass(cls.gap_x_6)
  def gap_x_8: SwStyle = SwStyle().addClass(cls.gap_x_8)
  def gap_x_12: SwStyle = SwStyle().addClass(cls.gap_x_12)
  def gap_x_16: SwStyle = SwStyle().addClass(cls.gap_x_16)
  def gap_x_20: SwStyle = SwStyle().addClass(cls.gap_x_20)
  def gap_x_24: SwStyle = SwStyle().addClass(cls.gap_x_24)
  def gap_x_32: SwStyle = SwStyle().addClass(cls.gap_x_32)
  def gap_x_40: SwStyle = SwStyle().addClass(cls.gap_x_40)
  def gap_x_48: SwStyle = SwStyle().addClass(cls.gap_x_48)
  def gap_y_0: SwStyle = SwStyle().addClass(cls.gap_y_0)
  def gap_y_2: SwStyle = SwStyle().addClass(cls.gap_y_2)
  def gap_y_4: SwStyle = SwStyle().addClass(cls.gap_y_4)
  def gap_y_6: SwStyle = SwStyle().addClass(cls.gap_y_6)
  def gap_y_8: SwStyle = SwStyle().addClass(cls.gap_y_8)
  def gap_y_12: SwStyle = SwStyle().addClass(cls.gap_y_12)
  def gap_y_16: SwStyle = SwStyle().addClass(cls.gap_y_16)
  def gap_y_20: SwStyle = SwStyle().addClass(cls.gap_y_20)
  def gap_y_24: SwStyle = SwStyle().addClass(cls.gap_y_24)
  def gap_y_32: SwStyle = SwStyle().addClass(cls.gap_y_32)
  def gap_y_40: SwStyle = SwStyle().addClass(cls.gap_y_40)
  def gap_y_48: SwStyle = SwStyle().addClass(cls.gap_y_48)
  def space_x_0: SwStyle = SwStyle().addClass(cls.space_x_0)
  def space_x_2: SwStyle = SwStyle().addClass(cls.space_x_2)
  def space_x_4: SwStyle = SwStyle().addClass(cls.space_x_4)
  def space_x_6: SwStyle = SwStyle().addClass(cls.space_x_6)
  def space_x_8: SwStyle = SwStyle().addClass(cls.space_x_8)
  def space_x_12: SwStyle = SwStyle().addClass(cls.space_x_12)
  def space_x_16: SwStyle = SwStyle().addClass(cls.space_x_16)
  def space_x_20: SwStyle = SwStyle().addClass(cls.space_x_20)
  def space_x_24: SwStyle = SwStyle().addClass(cls.space_x_24)
  def space_x_32: SwStyle = SwStyle().addClass(cls.space_x_32)
  def space_x_40: SwStyle = SwStyle().addClass(cls.space_x_40)
  def space_x_48: SwStyle = SwStyle().addClass(cls.space_x_48)
  def _space_x_0: SwStyle = SwStyle().addClass(cls._space_x_0)
  def _space_x_2: SwStyle = SwStyle().addClass(cls._space_x_2)
  def _space_x_4: SwStyle = SwStyle().addClass(cls._space_x_4)
  def _space_x_6: SwStyle = SwStyle().addClass(cls._space_x_6)
  def _space_x_8: SwStyle = SwStyle().addClass(cls._space_x_8)
  def _space_x_12: SwStyle = SwStyle().addClass(cls._space_x_12)
  def _space_x_16: SwStyle = SwStyle().addClass(cls._space_x_16)
  def _space_x_20: SwStyle = SwStyle().addClass(cls._space_x_20)
  def _space_x_24: SwStyle = SwStyle().addClass(cls._space_x_24)
  def _space_x_32: SwStyle = SwStyle().addClass(cls._space_x_32)
  def _space_x_40: SwStyle = SwStyle().addClass(cls._space_x_40)
  def _space_x_48: SwStyle = SwStyle().addClass(cls._space_x_48)
  def space_y_0: SwStyle = SwStyle().addClass(cls.space_y_0)
  def space_y_2: SwStyle = SwStyle().addClass(cls.space_y_2)
  def space_y_4: SwStyle = SwStyle().addClass(cls.space_y_4)
  def space_y_6: SwStyle = SwStyle().addClass(cls.space_y_6)
  def space_y_8: SwStyle = SwStyle().addClass(cls.space_y_8)
  def space_y_12: SwStyle = SwStyle().addClass(cls.space_y_12)
  def space_y_16: SwStyle = SwStyle().addClass(cls.space_y_16)
  def space_y_20: SwStyle = SwStyle().addClass(cls.space_y_20)
  def space_y_24: SwStyle = SwStyle().addClass(cls.space_y_24)
  def space_y_32: SwStyle = SwStyle().addClass(cls.space_y_32)
  def space_y_40: SwStyle = SwStyle().addClass(cls.space_y_40)
  def space_y_48: SwStyle = SwStyle().addClass(cls.space_y_48)
  def _space_y_0: SwStyle = SwStyle().addClass(cls._space_y_0)
  def _space_y_2: SwStyle = SwStyle().addClass(cls._space_y_2)
  def _space_y_4: SwStyle = SwStyle().addClass(cls._space_y_4)
  def _space_y_6: SwStyle = SwStyle().addClass(cls._space_y_6)
  def _space_y_8: SwStyle = SwStyle().addClass(cls._space_y_8)
  def _space_y_12: SwStyle = SwStyle().addClass(cls._space_y_12)
  def _space_y_16: SwStyle = SwStyle().addClass(cls._space_y_16)
  def _space_y_20: SwStyle = SwStyle().addClass(cls._space_y_20)
  def _space_y_24: SwStyle = SwStyle().addClass(cls._space_y_24)
  def _space_y_32: SwStyle = SwStyle().addClass(cls._space_y_32)
  def _space_y_40: SwStyle = SwStyle().addClass(cls._space_y_40)
  def _space_y_48: SwStyle = SwStyle().addClass(cls._space_y_48)
  def space_y_reverse: SwStyle = SwStyle().addClass(cls.space_y_reverse)
  def space_x_reverse: SwStyle = SwStyle().addClass(cls.space_x_reverse)
  def divide_x_3: SwStyle = SwStyle().addClass(cls.divide_x_3)
  def divide_x_default: SwStyle = SwStyle().addClass(cls.divide_x_default)
  def divide_y_3: SwStyle = SwStyle().addClass(cls.divide_y_3)
  def divide_y_default: SwStyle = SwStyle().addClass(cls.divide_y_default)
  def divide_y_reverse: SwStyle = SwStyle().addClass(cls.divide_y_reverse)
  def divide_x_reverse: SwStyle = SwStyle().addClass(cls.divide_x_reverse)
  def divide_solid: SwStyle = SwStyle().addClass(cls.divide_solid)
  def divide_dashed: SwStyle = SwStyle().addClass(cls.divide_dashed)
  def divide_dotted: SwStyle = SwStyle().addClass(cls.divide_dotted)
  def divide_double: SwStyle = SwStyle().addClass(cls.divide_double)
  def divide_none: SwStyle = SwStyle().addClass(cls.divide_none)
  def divide_gray_0: SwStyle = SwStyle().addClass(cls.divide_gray_0)
  def divide_gray_1: SwStyle = SwStyle().addClass(cls.divide_gray_1)
  def divide_gray_2: SwStyle = SwStyle().addClass(cls.divide_gray_2)
  def divide_gray_3: SwStyle = SwStyle().addClass(cls.divide_gray_3)
  def divide_gray_4: SwStyle = SwStyle().addClass(cls.divide_gray_4)
  def divide_gray_5: SwStyle = SwStyle().addClass(cls.divide_gray_5)
  def divide_gray_6: SwStyle = SwStyle().addClass(cls.divide_gray_6)
  def divide_gray_7: SwStyle = SwStyle().addClass(cls.divide_gray_7)
  def divide_gray_8: SwStyle = SwStyle().addClass(cls.divide_gray_8)
  def divide_gray_9: SwStyle = SwStyle().addClass(cls.divide_gray_9)
  def divide_danger_1: SwStyle = SwStyle().addClass(cls.divide_danger_1)
  def divide_danger_2: SwStyle = SwStyle().addClass(cls.divide_danger_2)
  def divide_danger_3: SwStyle = SwStyle().addClass(cls.divide_danger_3)
  def divide_danger_4: SwStyle = SwStyle().addClass(cls.divide_danger_4)
  def divide_danger_5: SwStyle = SwStyle().addClass(cls.divide_danger_5)
  def divide_primary_1: SwStyle = SwStyle().addClass(cls.divide_primary_1)
  def divide_primary_2: SwStyle = SwStyle().addClass(cls.divide_primary_2)
  def divide_primary_3: SwStyle = SwStyle().addClass(cls.divide_primary_3)
  def divide_primary_4: SwStyle = SwStyle().addClass(cls.divide_primary_4)
  def divide_primary_5: SwStyle = SwStyle().addClass(cls.divide_primary_5)
  def divide_success_1: SwStyle = SwStyle().addClass(cls.divide_success_1)
  def divide_success_2: SwStyle = SwStyle().addClass(cls.divide_success_2)
  def divide_success_3: SwStyle = SwStyle().addClass(cls.divide_success_3)
  def divide_success_4: SwStyle = SwStyle().addClass(cls.divide_success_4)
  def divide_success_5: SwStyle = SwStyle().addClass(cls.divide_success_5)
  def divide_warning_1: SwStyle = SwStyle().addClass(cls.divide_warning_1)
  def divide_warning_2: SwStyle = SwStyle().addClass(cls.divide_warning_2)
  def divide_warning_3: SwStyle = SwStyle().addClass(cls.divide_warning_3)
  def divide_warning_4: SwStyle = SwStyle().addClass(cls.divide_warning_4)
  def divide_warning_5: SwStyle = SwStyle().addClass(cls.divide_warning_5)
  def divide_transparent: SwStyle = SwStyle().addClass(cls.divide_transparent)
  def divide_current: SwStyle = SwStyle().addClass(cls.divide_current)
  def divide_inherit: SwStyle = SwStyle().addClass(cls.divide_inherit)
  def divide_custom_1: SwStyle = SwStyle().addClass(cls.divide_custom_1)
  def divide_custom_2: SwStyle = SwStyle().addClass(cls.divide_custom_2)
  def divide_custom_3: SwStyle = SwStyle().addClass(cls.divide_custom_3)
  def divide_custom_4: SwStyle = SwStyle().addClass(cls.divide_custom_4)
  def divide_opacity_0: SwStyle = SwStyle().addClass(cls.divide_opacity_0)
  def divide_opacity_10: SwStyle = SwStyle().addClass(cls.divide_opacity_10)
  def divide_opacity_20: SwStyle = SwStyle().addClass(cls.divide_opacity_20)
  def divide_opacity_30: SwStyle = SwStyle().addClass(cls.divide_opacity_30)
  def divide_opacity_40: SwStyle = SwStyle().addClass(cls.divide_opacity_40)
  def divide_opacity_50: SwStyle = SwStyle().addClass(cls.divide_opacity_50)
  def divide_opacity_60: SwStyle = SwStyle().addClass(cls.divide_opacity_60)
  def divide_opacity_70: SwStyle = SwStyle().addClass(cls.divide_opacity_70)
  def divide_opacity_80: SwStyle = SwStyle().addClass(cls.divide_opacity_80)
  def divide_opacity_90: SwStyle = SwStyle().addClass(cls.divide_opacity_90)
  def divide_opacity_100: SwStyle = SwStyle().addClass(cls.divide_opacity_100)
  def overflow_auto: SwStyle = SwStyle().addClass(cls.overflow_auto)
  def overflow_hidden: SwStyle = SwStyle().addClass(cls.overflow_hidden)
  def overflow_clip: SwStyle = SwStyle().addClass(cls.overflow_clip)
  def overflow_visible: SwStyle = SwStyle().addClass(cls.overflow_visible)
  def overflow_scroll: SwStyle = SwStyle().addClass(cls.overflow_scroll)
  def overflow_x_auto: SwStyle = SwStyle().addClass(cls.overflow_x_auto)
  def overflow_y_auto: SwStyle = SwStyle().addClass(cls.overflow_y_auto)
  def overflow_x_hidden: SwStyle = SwStyle().addClass(cls.overflow_x_hidden)
  def overflow_y_hidden: SwStyle = SwStyle().addClass(cls.overflow_y_hidden)
  def overflow_x_clip: SwStyle = SwStyle().addClass(cls.overflow_x_clip)
  def overflow_y_clip: SwStyle = SwStyle().addClass(cls.overflow_y_clip)
  def overflow_x_visible: SwStyle = SwStyle().addClass(cls.overflow_x_visible)
  def overflow_y_visible: SwStyle = SwStyle().addClass(cls.overflow_y_visible)
  def overflow_x_scroll: SwStyle = SwStyle().addClass(cls.overflow_x_scroll)
  def overflow_y_scroll: SwStyle = SwStyle().addClass(cls.overflow_y_scroll)
  def scroll_auto: SwStyle = SwStyle().addClass(cls.scroll_auto)
  def scroll_smooth: SwStyle = SwStyle().addClass(cls.scroll_smooth)
  def truncate: SwStyle = SwStyle().addClass(cls.truncate)
  def overflow_ellipsis: SwStyle = SwStyle().addClass(cls.overflow_ellipsis)
  def text_ellipsis: SwStyle = SwStyle().addClass(cls.text_ellipsis)
  def text_clip: SwStyle = SwStyle().addClass(cls.text_clip)
  def hyphens_none: SwStyle = SwStyle().addClass(cls.hyphens_none)
  def hyphens_manual: SwStyle = SwStyle().addClass(cls.hyphens_manual)
  def hyphens_auto: SwStyle = SwStyle().addClass(cls.hyphens_auto)
  def whitespace_normal: SwStyle = SwStyle().addClass(cls.whitespace_normal)
  def whitespace_nowrap: SwStyle = SwStyle().addClass(cls.whitespace_nowrap)
  def whitespace_pre: SwStyle = SwStyle().addClass(cls.whitespace_pre)
  def whitespace_pre_line: SwStyle = SwStyle().addClass(cls.whitespace_pre_line)
  def whitespace_pre_wrap: SwStyle = SwStyle().addClass(cls.whitespace_pre_wrap)
  def whitespace_break_spaces: SwStyle = SwStyle().addClass(cls.whitespace_break_spaces)
  def text_wrap: SwStyle = SwStyle().addClass(cls.text_wrap)
  def text_nowrap: SwStyle = SwStyle().addClass(cls.text_nowrap)
  def text_balance: SwStyle = SwStyle().addClass(cls.text_balance)
  def text_pretty: SwStyle = SwStyle().addClass(cls.text_pretty)
  def break_normal: SwStyle = SwStyle().addClass(cls.break_normal)
  def break_words: SwStyle = SwStyle().addClass(cls.break_words)
  def break_all: SwStyle = SwStyle().addClass(cls.break_all)
  def break_keep: SwStyle = SwStyle().addClass(cls.break_keep)
  def rounded_0: SwStyle = SwStyle().addClass(cls.rounded_0)
  def rounded_2: SwStyle = SwStyle().addClass(cls.rounded_2)
  def rounded_3: SwStyle = SwStyle().addClass(cls.rounded_3)
  def rounded_4: SwStyle = SwStyle().addClass(cls.rounded_4)
  def rounded_6: SwStyle = SwStyle().addClass(cls.rounded_6)
  def rounded_8: SwStyle = SwStyle().addClass(cls.rounded_8)
  def rounded_full: SwStyle = SwStyle().addClass(cls.rounded_full)
  def rounded_s_0: SwStyle = SwStyle().addClass(cls.rounded_s_0)
  def rounded_s_2: SwStyle = SwStyle().addClass(cls.rounded_s_2)
  def rounded_s_3: SwStyle = SwStyle().addClass(cls.rounded_s_3)
  def rounded_s_4: SwStyle = SwStyle().addClass(cls.rounded_s_4)
  def rounded_s_6: SwStyle = SwStyle().addClass(cls.rounded_s_6)
  def rounded_s_8: SwStyle = SwStyle().addClass(cls.rounded_s_8)
  def rounded_s_full: SwStyle = SwStyle().addClass(cls.rounded_s_full)
  def rounded_e_0: SwStyle = SwStyle().addClass(cls.rounded_e_0)
  def rounded_e_2: SwStyle = SwStyle().addClass(cls.rounded_e_2)
  def rounded_e_3: SwStyle = SwStyle().addClass(cls.rounded_e_3)
  def rounded_e_4: SwStyle = SwStyle().addClass(cls.rounded_e_4)
  def rounded_e_6: SwStyle = SwStyle().addClass(cls.rounded_e_6)
  def rounded_e_8: SwStyle = SwStyle().addClass(cls.rounded_e_8)
  def rounded_e_full: SwStyle = SwStyle().addClass(cls.rounded_e_full)
  def rounded_t_0: SwStyle = SwStyle().addClass(cls.rounded_t_0)
  def rounded_t_2: SwStyle = SwStyle().addClass(cls.rounded_t_2)
  def rounded_t_3: SwStyle = SwStyle().addClass(cls.rounded_t_3)
  def rounded_t_4: SwStyle = SwStyle().addClass(cls.rounded_t_4)
  def rounded_t_6: SwStyle = SwStyle().addClass(cls.rounded_t_6)
  def rounded_t_8: SwStyle = SwStyle().addClass(cls.rounded_t_8)
  def rounded_t_full: SwStyle = SwStyle().addClass(cls.rounded_t_full)
  def rounded_r_0: SwStyle = SwStyle().addClass(cls.rounded_r_0)
  def rounded_r_2: SwStyle = SwStyle().addClass(cls.rounded_r_2)
  def rounded_r_3: SwStyle = SwStyle().addClass(cls.rounded_r_3)
  def rounded_r_4: SwStyle = SwStyle().addClass(cls.rounded_r_4)
  def rounded_r_6: SwStyle = SwStyle().addClass(cls.rounded_r_6)
  def rounded_r_8: SwStyle = SwStyle().addClass(cls.rounded_r_8)
  def rounded_r_full: SwStyle = SwStyle().addClass(cls.rounded_r_full)
  def rounded_b_0: SwStyle = SwStyle().addClass(cls.rounded_b_0)
  def rounded_b_2: SwStyle = SwStyle().addClass(cls.rounded_b_2)
  def rounded_b_3: SwStyle = SwStyle().addClass(cls.rounded_b_3)
  def rounded_b_4: SwStyle = SwStyle().addClass(cls.rounded_b_4)
  def rounded_b_6: SwStyle = SwStyle().addClass(cls.rounded_b_6)
  def rounded_b_8: SwStyle = SwStyle().addClass(cls.rounded_b_8)
  def rounded_b_full: SwStyle = SwStyle().addClass(cls.rounded_b_full)
  def rounded_l_0: SwStyle = SwStyle().addClass(cls.rounded_l_0)
  def rounded_l_2: SwStyle = SwStyle().addClass(cls.rounded_l_2)
  def rounded_l_3: SwStyle = SwStyle().addClass(cls.rounded_l_3)
  def rounded_l_4: SwStyle = SwStyle().addClass(cls.rounded_l_4)
  def rounded_l_6: SwStyle = SwStyle().addClass(cls.rounded_l_6)
  def rounded_l_8: SwStyle = SwStyle().addClass(cls.rounded_l_8)
  def rounded_l_full: SwStyle = SwStyle().addClass(cls.rounded_l_full)
  def rounded_ss_0: SwStyle = SwStyle().addClass(cls.rounded_ss_0)
  def rounded_ss_2: SwStyle = SwStyle().addClass(cls.rounded_ss_2)
  def rounded_ss_3: SwStyle = SwStyle().addClass(cls.rounded_ss_3)
  def rounded_ss_4: SwStyle = SwStyle().addClass(cls.rounded_ss_4)
  def rounded_ss_6: SwStyle = SwStyle().addClass(cls.rounded_ss_6)
  def rounded_ss_8: SwStyle = SwStyle().addClass(cls.rounded_ss_8)
  def rounded_ss_full: SwStyle = SwStyle().addClass(cls.rounded_ss_full)
  def rounded_se_0: SwStyle = SwStyle().addClass(cls.rounded_se_0)
  def rounded_se_2: SwStyle = SwStyle().addClass(cls.rounded_se_2)
  def rounded_se_3: SwStyle = SwStyle().addClass(cls.rounded_se_3)
  def rounded_se_4: SwStyle = SwStyle().addClass(cls.rounded_se_4)
  def rounded_se_6: SwStyle = SwStyle().addClass(cls.rounded_se_6)
  def rounded_se_8: SwStyle = SwStyle().addClass(cls.rounded_se_8)
  def rounded_se_full: SwStyle = SwStyle().addClass(cls.rounded_se_full)
  def rounded_ee_0: SwStyle = SwStyle().addClass(cls.rounded_ee_0)
  def rounded_ee_2: SwStyle = SwStyle().addClass(cls.rounded_ee_2)
  def rounded_ee_3: SwStyle = SwStyle().addClass(cls.rounded_ee_3)
  def rounded_ee_4: SwStyle = SwStyle().addClass(cls.rounded_ee_4)
  def rounded_ee_6: SwStyle = SwStyle().addClass(cls.rounded_ee_6)
  def rounded_ee_8: SwStyle = SwStyle().addClass(cls.rounded_ee_8)
  def rounded_ee_full: SwStyle = SwStyle().addClass(cls.rounded_ee_full)
  def rounded_es_0: SwStyle = SwStyle().addClass(cls.rounded_es_0)
  def rounded_es_2: SwStyle = SwStyle().addClass(cls.rounded_es_2)
  def rounded_es_3: SwStyle = SwStyle().addClass(cls.rounded_es_3)
  def rounded_es_4: SwStyle = SwStyle().addClass(cls.rounded_es_4)
  def rounded_es_6: SwStyle = SwStyle().addClass(cls.rounded_es_6)
  def rounded_es_8: SwStyle = SwStyle().addClass(cls.rounded_es_8)
  def rounded_es_full: SwStyle = SwStyle().addClass(cls.rounded_es_full)
  def rounded_tl_0: SwStyle = SwStyle().addClass(cls.rounded_tl_0)
  def rounded_tl_2: SwStyle = SwStyle().addClass(cls.rounded_tl_2)
  def rounded_tl_3: SwStyle = SwStyle().addClass(cls.rounded_tl_3)
  def rounded_tl_4: SwStyle = SwStyle().addClass(cls.rounded_tl_4)
  def rounded_tl_6: SwStyle = SwStyle().addClass(cls.rounded_tl_6)
  def rounded_tl_8: SwStyle = SwStyle().addClass(cls.rounded_tl_8)
  def rounded_tl_full: SwStyle = SwStyle().addClass(cls.rounded_tl_full)
  def rounded_tr_0: SwStyle = SwStyle().addClass(cls.rounded_tr_0)
  def rounded_tr_2: SwStyle = SwStyle().addClass(cls.rounded_tr_2)
  def rounded_tr_3: SwStyle = SwStyle().addClass(cls.rounded_tr_3)
  def rounded_tr_4: SwStyle = SwStyle().addClass(cls.rounded_tr_4)
  def rounded_tr_6: SwStyle = SwStyle().addClass(cls.rounded_tr_6)
  def rounded_tr_8: SwStyle = SwStyle().addClass(cls.rounded_tr_8)
  def rounded_tr_full: SwStyle = SwStyle().addClass(cls.rounded_tr_full)
  def rounded_br_0: SwStyle = SwStyle().addClass(cls.rounded_br_0)
  def rounded_br_2: SwStyle = SwStyle().addClass(cls.rounded_br_2)
  def rounded_br_3: SwStyle = SwStyle().addClass(cls.rounded_br_3)
  def rounded_br_4: SwStyle = SwStyle().addClass(cls.rounded_br_4)
  def rounded_br_6: SwStyle = SwStyle().addClass(cls.rounded_br_6)
  def rounded_br_8: SwStyle = SwStyle().addClass(cls.rounded_br_8)
  def rounded_br_full: SwStyle = SwStyle().addClass(cls.rounded_br_full)
  def rounded_bl_0: SwStyle = SwStyle().addClass(cls.rounded_bl_0)
  def rounded_bl_2: SwStyle = SwStyle().addClass(cls.rounded_bl_2)
  def rounded_bl_3: SwStyle = SwStyle().addClass(cls.rounded_bl_3)
  def rounded_bl_4: SwStyle = SwStyle().addClass(cls.rounded_bl_4)
  def rounded_bl_6: SwStyle = SwStyle().addClass(cls.rounded_bl_6)
  def rounded_bl_8: SwStyle = SwStyle().addClass(cls.rounded_bl_8)
  def rounded_bl_full: SwStyle = SwStyle().addClass(cls.rounded_bl_full)
  def border_3: SwStyle = SwStyle().addClass(cls.border_3)
  def border_default: SwStyle = SwStyle().addClass(cls.border_default)
  def border_x_3: SwStyle = SwStyle().addClass(cls.border_x_3)
  def border_x_default: SwStyle = SwStyle().addClass(cls.border_x_default)
  def border_y_3: SwStyle = SwStyle().addClass(cls.border_y_3)
  def border_y_default: SwStyle = SwStyle().addClass(cls.border_y_default)
  def border_s_3: SwStyle = SwStyle().addClass(cls.border_s_3)
  def border_s_default: SwStyle = SwStyle().addClass(cls.border_s_default)
  def border_e_3: SwStyle = SwStyle().addClass(cls.border_e_3)
  def border_e_default: SwStyle = SwStyle().addClass(cls.border_e_default)
  def border_t_3: SwStyle = SwStyle().addClass(cls.border_t_3)
  def border_t_default: SwStyle = SwStyle().addClass(cls.border_t_default)
  def border_r_3: SwStyle = SwStyle().addClass(cls.border_r_3)
  def border_r_default: SwStyle = SwStyle().addClass(cls.border_r_default)
  def border_b_3: SwStyle = SwStyle().addClass(cls.border_b_3)
  def border_b_default: SwStyle = SwStyle().addClass(cls.border_b_default)
  def border_l_3: SwStyle = SwStyle().addClass(cls.border_l_3)
  def border_l_default: SwStyle = SwStyle().addClass(cls.border_l_default)
  def border_solid: SwStyle = SwStyle().addClass(cls.border_solid)
  def border_dashed: SwStyle = SwStyle().addClass(cls.border_dashed)
  def border_dotted: SwStyle = SwStyle().addClass(cls.border_dotted)
  def border_double: SwStyle = SwStyle().addClass(cls.border_double)
  def border_hidden: SwStyle = SwStyle().addClass(cls.border_hidden)
  def border_none: SwStyle = SwStyle().addClass(cls.border_none)
  def border_gray_0: SwStyle = SwStyle().addClass(cls.border_gray_0)
  def border_gray_1: SwStyle = SwStyle().addClass(cls.border_gray_1)
  def border_gray_2: SwStyle = SwStyle().addClass(cls.border_gray_2)
  def border_gray_3: SwStyle = SwStyle().addClass(cls.border_gray_3)
  def border_gray_4: SwStyle = SwStyle().addClass(cls.border_gray_4)
  def border_gray_5: SwStyle = SwStyle().addClass(cls.border_gray_5)
  def border_gray_6: SwStyle = SwStyle().addClass(cls.border_gray_6)
  def border_gray_7: SwStyle = SwStyle().addClass(cls.border_gray_7)
  def border_gray_8: SwStyle = SwStyle().addClass(cls.border_gray_8)
  def border_gray_9: SwStyle = SwStyle().addClass(cls.border_gray_9)
  def border_danger_1: SwStyle = SwStyle().addClass(cls.border_danger_1)
  def border_danger_2: SwStyle = SwStyle().addClass(cls.border_danger_2)
  def border_danger_3: SwStyle = SwStyle().addClass(cls.border_danger_3)
  def border_danger_4: SwStyle = SwStyle().addClass(cls.border_danger_4)
  def border_danger_5: SwStyle = SwStyle().addClass(cls.border_danger_5)
  def border_primary_1: SwStyle = SwStyle().addClass(cls.border_primary_1)
  def border_primary_2: SwStyle = SwStyle().addClass(cls.border_primary_2)
  def border_primary_3: SwStyle = SwStyle().addClass(cls.border_primary_3)
  def border_primary_4: SwStyle = SwStyle().addClass(cls.border_primary_4)
  def border_primary_5: SwStyle = SwStyle().addClass(cls.border_primary_5)
  def border_success_1: SwStyle = SwStyle().addClass(cls.border_success_1)
  def border_success_2: SwStyle = SwStyle().addClass(cls.border_success_2)
  def border_success_3: SwStyle = SwStyle().addClass(cls.border_success_3)
  def border_success_4: SwStyle = SwStyle().addClass(cls.border_success_4)
  def border_success_5: SwStyle = SwStyle().addClass(cls.border_success_5)
  def border_warning_1: SwStyle = SwStyle().addClass(cls.border_warning_1)
  def border_warning_2: SwStyle = SwStyle().addClass(cls.border_warning_2)
  def border_warning_3: SwStyle = SwStyle().addClass(cls.border_warning_3)
  def border_warning_4: SwStyle = SwStyle().addClass(cls.border_warning_4)
  def border_warning_5: SwStyle = SwStyle().addClass(cls.border_warning_5)
  def border_transparent: SwStyle = SwStyle().addClass(cls.border_transparent)
  def border_current: SwStyle = SwStyle().addClass(cls.border_current)
  def border_inherit: SwStyle = SwStyle().addClass(cls.border_inherit)
  def border_custom_1: SwStyle = SwStyle().addClass(cls.border_custom_1)
  def border_custom_2: SwStyle = SwStyle().addClass(cls.border_custom_2)
  def border_custom_3: SwStyle = SwStyle().addClass(cls.border_custom_3)
  def border_custom_4: SwStyle = SwStyle().addClass(cls.border_custom_4)
  def border_x_gray_0: SwStyle = SwStyle().addClass(cls.border_x_gray_0)
  def border_x_gray_1: SwStyle = SwStyle().addClass(cls.border_x_gray_1)
  def border_x_gray_2: SwStyle = SwStyle().addClass(cls.border_x_gray_2)
  def border_x_gray_3: SwStyle = SwStyle().addClass(cls.border_x_gray_3)
  def border_x_gray_4: SwStyle = SwStyle().addClass(cls.border_x_gray_4)
  def border_x_gray_5: SwStyle = SwStyle().addClass(cls.border_x_gray_5)
  def border_x_gray_6: SwStyle = SwStyle().addClass(cls.border_x_gray_6)
  def border_x_gray_7: SwStyle = SwStyle().addClass(cls.border_x_gray_7)
  def border_x_gray_8: SwStyle = SwStyle().addClass(cls.border_x_gray_8)
  def border_x_gray_9: SwStyle = SwStyle().addClass(cls.border_x_gray_9)
  def border_x_danger_1: SwStyle = SwStyle().addClass(cls.border_x_danger_1)
  def border_x_danger_2: SwStyle = SwStyle().addClass(cls.border_x_danger_2)
  def border_x_danger_3: SwStyle = SwStyle().addClass(cls.border_x_danger_3)
  def border_x_danger_4: SwStyle = SwStyle().addClass(cls.border_x_danger_4)
  def border_x_danger_5: SwStyle = SwStyle().addClass(cls.border_x_danger_5)
  def border_x_primary_1: SwStyle = SwStyle().addClass(cls.border_x_primary_1)
  def border_x_primary_2: SwStyle = SwStyle().addClass(cls.border_x_primary_2)
  def border_x_primary_3: SwStyle = SwStyle().addClass(cls.border_x_primary_3)
  def border_x_primary_4: SwStyle = SwStyle().addClass(cls.border_x_primary_4)
  def border_x_primary_5: SwStyle = SwStyle().addClass(cls.border_x_primary_5)
  def border_x_success_1: SwStyle = SwStyle().addClass(cls.border_x_success_1)
  def border_x_success_2: SwStyle = SwStyle().addClass(cls.border_x_success_2)
  def border_x_success_3: SwStyle = SwStyle().addClass(cls.border_x_success_3)
  def border_x_success_4: SwStyle = SwStyle().addClass(cls.border_x_success_4)
  def border_x_success_5: SwStyle = SwStyle().addClass(cls.border_x_success_5)
  def border_x_warning_1: SwStyle = SwStyle().addClass(cls.border_x_warning_1)
  def border_x_warning_2: SwStyle = SwStyle().addClass(cls.border_x_warning_2)
  def border_x_warning_3: SwStyle = SwStyle().addClass(cls.border_x_warning_3)
  def border_x_warning_4: SwStyle = SwStyle().addClass(cls.border_x_warning_4)
  def border_x_warning_5: SwStyle = SwStyle().addClass(cls.border_x_warning_5)
  def border_x_transparent: SwStyle = SwStyle().addClass(cls.border_x_transparent)
  def border_x_current: SwStyle = SwStyle().addClass(cls.border_x_current)
  def border_x_inherit: SwStyle = SwStyle().addClass(cls.border_x_inherit)
  def border_x_custom_1: SwStyle = SwStyle().addClass(cls.border_x_custom_1)
  def border_x_custom_2: SwStyle = SwStyle().addClass(cls.border_x_custom_2)
  def border_x_custom_3: SwStyle = SwStyle().addClass(cls.border_x_custom_3)
  def border_x_custom_4: SwStyle = SwStyle().addClass(cls.border_x_custom_4)
  def border_y_gray_0: SwStyle = SwStyle().addClass(cls.border_y_gray_0)
  def border_y_gray_1: SwStyle = SwStyle().addClass(cls.border_y_gray_1)
  def border_y_gray_2: SwStyle = SwStyle().addClass(cls.border_y_gray_2)
  def border_y_gray_3: SwStyle = SwStyle().addClass(cls.border_y_gray_3)
  def border_y_gray_4: SwStyle = SwStyle().addClass(cls.border_y_gray_4)
  def border_y_gray_5: SwStyle = SwStyle().addClass(cls.border_y_gray_5)
  def border_y_gray_6: SwStyle = SwStyle().addClass(cls.border_y_gray_6)
  def border_y_gray_7: SwStyle = SwStyle().addClass(cls.border_y_gray_7)
  def border_y_gray_8: SwStyle = SwStyle().addClass(cls.border_y_gray_8)
  def border_y_gray_9: SwStyle = SwStyle().addClass(cls.border_y_gray_9)
  def border_y_danger_1: SwStyle = SwStyle().addClass(cls.border_y_danger_1)
  def border_y_danger_2: SwStyle = SwStyle().addClass(cls.border_y_danger_2)
  def border_y_danger_3: SwStyle = SwStyle().addClass(cls.border_y_danger_3)
  def border_y_danger_4: SwStyle = SwStyle().addClass(cls.border_y_danger_4)
  def border_y_danger_5: SwStyle = SwStyle().addClass(cls.border_y_danger_5)
  def border_y_primary_1: SwStyle = SwStyle().addClass(cls.border_y_primary_1)
  def border_y_primary_2: SwStyle = SwStyle().addClass(cls.border_y_primary_2)
  def border_y_primary_3: SwStyle = SwStyle().addClass(cls.border_y_primary_3)
  def border_y_primary_4: SwStyle = SwStyle().addClass(cls.border_y_primary_4)
  def border_y_primary_5: SwStyle = SwStyle().addClass(cls.border_y_primary_5)
  def border_y_success_1: SwStyle = SwStyle().addClass(cls.border_y_success_1)
  def border_y_success_2: SwStyle = SwStyle().addClass(cls.border_y_success_2)
  def border_y_success_3: SwStyle = SwStyle().addClass(cls.border_y_success_3)
  def border_y_success_4: SwStyle = SwStyle().addClass(cls.border_y_success_4)
  def border_y_success_5: SwStyle = SwStyle().addClass(cls.border_y_success_5)
  def border_y_warning_1: SwStyle = SwStyle().addClass(cls.border_y_warning_1)
  def border_y_warning_2: SwStyle = SwStyle().addClass(cls.border_y_warning_2)
  def border_y_warning_3: SwStyle = SwStyle().addClass(cls.border_y_warning_3)
  def border_y_warning_4: SwStyle = SwStyle().addClass(cls.border_y_warning_4)
  def border_y_warning_5: SwStyle = SwStyle().addClass(cls.border_y_warning_5)
  def border_y_transparent: SwStyle = SwStyle().addClass(cls.border_y_transparent)
  def border_y_current: SwStyle = SwStyle().addClass(cls.border_y_current)
  def border_y_inherit: SwStyle = SwStyle().addClass(cls.border_y_inherit)
  def border_y_custom_1: SwStyle = SwStyle().addClass(cls.border_y_custom_1)
  def border_y_custom_2: SwStyle = SwStyle().addClass(cls.border_y_custom_2)
  def border_y_custom_3: SwStyle = SwStyle().addClass(cls.border_y_custom_3)
  def border_y_custom_4: SwStyle = SwStyle().addClass(cls.border_y_custom_4)
  def border_s_gray_0: SwStyle = SwStyle().addClass(cls.border_s_gray_0)
  def border_s_gray_1: SwStyle = SwStyle().addClass(cls.border_s_gray_1)
  def border_s_gray_2: SwStyle = SwStyle().addClass(cls.border_s_gray_2)
  def border_s_gray_3: SwStyle = SwStyle().addClass(cls.border_s_gray_3)
  def border_s_gray_4: SwStyle = SwStyle().addClass(cls.border_s_gray_4)
  def border_s_gray_5: SwStyle = SwStyle().addClass(cls.border_s_gray_5)
  def border_s_gray_6: SwStyle = SwStyle().addClass(cls.border_s_gray_6)
  def border_s_gray_7: SwStyle = SwStyle().addClass(cls.border_s_gray_7)
  def border_s_gray_8: SwStyle = SwStyle().addClass(cls.border_s_gray_8)
  def border_s_gray_9: SwStyle = SwStyle().addClass(cls.border_s_gray_9)
  def border_s_danger_1: SwStyle = SwStyle().addClass(cls.border_s_danger_1)
  def border_s_danger_2: SwStyle = SwStyle().addClass(cls.border_s_danger_2)
  def border_s_danger_3: SwStyle = SwStyle().addClass(cls.border_s_danger_3)
  def border_s_danger_4: SwStyle = SwStyle().addClass(cls.border_s_danger_4)
  def border_s_danger_5: SwStyle = SwStyle().addClass(cls.border_s_danger_5)
  def border_s_primary_1: SwStyle = SwStyle().addClass(cls.border_s_primary_1)
  def border_s_primary_2: SwStyle = SwStyle().addClass(cls.border_s_primary_2)
  def border_s_primary_3: SwStyle = SwStyle().addClass(cls.border_s_primary_3)
  def border_s_primary_4: SwStyle = SwStyle().addClass(cls.border_s_primary_4)
  def border_s_primary_5: SwStyle = SwStyle().addClass(cls.border_s_primary_5)
  def border_s_success_1: SwStyle = SwStyle().addClass(cls.border_s_success_1)
  def border_s_success_2: SwStyle = SwStyle().addClass(cls.border_s_success_2)
  def border_s_success_3: SwStyle = SwStyle().addClass(cls.border_s_success_3)
  def border_s_success_4: SwStyle = SwStyle().addClass(cls.border_s_success_4)
  def border_s_success_5: SwStyle = SwStyle().addClass(cls.border_s_success_5)
  def border_s_warning_1: SwStyle = SwStyle().addClass(cls.border_s_warning_1)
  def border_s_warning_2: SwStyle = SwStyle().addClass(cls.border_s_warning_2)
  def border_s_warning_3: SwStyle = SwStyle().addClass(cls.border_s_warning_3)
  def border_s_warning_4: SwStyle = SwStyle().addClass(cls.border_s_warning_4)
  def border_s_warning_5: SwStyle = SwStyle().addClass(cls.border_s_warning_5)
  def border_s_transparent: SwStyle = SwStyle().addClass(cls.border_s_transparent)
  def border_s_current: SwStyle = SwStyle().addClass(cls.border_s_current)
  def border_s_inherit: SwStyle = SwStyle().addClass(cls.border_s_inherit)
  def border_s_custom_1: SwStyle = SwStyle().addClass(cls.border_s_custom_1)
  def border_s_custom_2: SwStyle = SwStyle().addClass(cls.border_s_custom_2)
  def border_s_custom_3: SwStyle = SwStyle().addClass(cls.border_s_custom_3)
  def border_s_custom_4: SwStyle = SwStyle().addClass(cls.border_s_custom_4)
  def border_e_gray_0: SwStyle = SwStyle().addClass(cls.border_e_gray_0)
  def border_e_gray_1: SwStyle = SwStyle().addClass(cls.border_e_gray_1)
  def border_e_gray_2: SwStyle = SwStyle().addClass(cls.border_e_gray_2)
  def border_e_gray_3: SwStyle = SwStyle().addClass(cls.border_e_gray_3)
  def border_e_gray_4: SwStyle = SwStyle().addClass(cls.border_e_gray_4)
  def border_e_gray_5: SwStyle = SwStyle().addClass(cls.border_e_gray_5)
  def border_e_gray_6: SwStyle = SwStyle().addClass(cls.border_e_gray_6)
  def border_e_gray_7: SwStyle = SwStyle().addClass(cls.border_e_gray_7)
  def border_e_gray_8: SwStyle = SwStyle().addClass(cls.border_e_gray_8)
  def border_e_gray_9: SwStyle = SwStyle().addClass(cls.border_e_gray_9)
  def border_e_danger_1: SwStyle = SwStyle().addClass(cls.border_e_danger_1)
  def border_e_danger_2: SwStyle = SwStyle().addClass(cls.border_e_danger_2)
  def border_e_danger_3: SwStyle = SwStyle().addClass(cls.border_e_danger_3)
  def border_e_danger_4: SwStyle = SwStyle().addClass(cls.border_e_danger_4)
  def border_e_danger_5: SwStyle = SwStyle().addClass(cls.border_e_danger_5)
  def border_e_primary_1: SwStyle = SwStyle().addClass(cls.border_e_primary_1)
  def border_e_primary_2: SwStyle = SwStyle().addClass(cls.border_e_primary_2)
  def border_e_primary_3: SwStyle = SwStyle().addClass(cls.border_e_primary_3)
  def border_e_primary_4: SwStyle = SwStyle().addClass(cls.border_e_primary_4)
  def border_e_primary_5: SwStyle = SwStyle().addClass(cls.border_e_primary_5)
  def border_e_success_1: SwStyle = SwStyle().addClass(cls.border_e_success_1)
  def border_e_success_2: SwStyle = SwStyle().addClass(cls.border_e_success_2)
  def border_e_success_3: SwStyle = SwStyle().addClass(cls.border_e_success_3)
  def border_e_success_4: SwStyle = SwStyle().addClass(cls.border_e_success_4)
  def border_e_success_5: SwStyle = SwStyle().addClass(cls.border_e_success_5)
  def border_e_warning_1: SwStyle = SwStyle().addClass(cls.border_e_warning_1)
  def border_e_warning_2: SwStyle = SwStyle().addClass(cls.border_e_warning_2)
  def border_e_warning_3: SwStyle = SwStyle().addClass(cls.border_e_warning_3)
  def border_e_warning_4: SwStyle = SwStyle().addClass(cls.border_e_warning_4)
  def border_e_warning_5: SwStyle = SwStyle().addClass(cls.border_e_warning_5)
  def border_e_transparent: SwStyle = SwStyle().addClass(cls.border_e_transparent)
  def border_e_current: SwStyle = SwStyle().addClass(cls.border_e_current)
  def border_e_inherit: SwStyle = SwStyle().addClass(cls.border_e_inherit)
  def border_e_custom_1: SwStyle = SwStyle().addClass(cls.border_e_custom_1)
  def border_e_custom_2: SwStyle = SwStyle().addClass(cls.border_e_custom_2)
  def border_e_custom_3: SwStyle = SwStyle().addClass(cls.border_e_custom_3)
  def border_e_custom_4: SwStyle = SwStyle().addClass(cls.border_e_custom_4)
  def border_t_gray_0: SwStyle = SwStyle().addClass(cls.border_t_gray_0)
  def border_t_gray_1: SwStyle = SwStyle().addClass(cls.border_t_gray_1)
  def border_t_gray_2: SwStyle = SwStyle().addClass(cls.border_t_gray_2)
  def border_t_gray_3: SwStyle = SwStyle().addClass(cls.border_t_gray_3)
  def border_t_gray_4: SwStyle = SwStyle().addClass(cls.border_t_gray_4)
  def border_t_gray_5: SwStyle = SwStyle().addClass(cls.border_t_gray_5)
  def border_t_gray_6: SwStyle = SwStyle().addClass(cls.border_t_gray_6)
  def border_t_gray_7: SwStyle = SwStyle().addClass(cls.border_t_gray_7)
  def border_t_gray_8: SwStyle = SwStyle().addClass(cls.border_t_gray_8)
  def border_t_gray_9: SwStyle = SwStyle().addClass(cls.border_t_gray_9)
  def border_t_danger_1: SwStyle = SwStyle().addClass(cls.border_t_danger_1)
  def border_t_danger_2: SwStyle = SwStyle().addClass(cls.border_t_danger_2)
  def border_t_danger_3: SwStyle = SwStyle().addClass(cls.border_t_danger_3)
  def border_t_danger_4: SwStyle = SwStyle().addClass(cls.border_t_danger_4)
  def border_t_danger_5: SwStyle = SwStyle().addClass(cls.border_t_danger_5)
  def border_t_primary_1: SwStyle = SwStyle().addClass(cls.border_t_primary_1)
  def border_t_primary_2: SwStyle = SwStyle().addClass(cls.border_t_primary_2)
  def border_t_primary_3: SwStyle = SwStyle().addClass(cls.border_t_primary_3)
  def border_t_primary_4: SwStyle = SwStyle().addClass(cls.border_t_primary_4)
  def border_t_primary_5: SwStyle = SwStyle().addClass(cls.border_t_primary_5)
  def border_t_success_1: SwStyle = SwStyle().addClass(cls.border_t_success_1)
  def border_t_success_2: SwStyle = SwStyle().addClass(cls.border_t_success_2)
  def border_t_success_3: SwStyle = SwStyle().addClass(cls.border_t_success_3)
  def border_t_success_4: SwStyle = SwStyle().addClass(cls.border_t_success_4)
  def border_t_success_5: SwStyle = SwStyle().addClass(cls.border_t_success_5)
  def border_t_warning_1: SwStyle = SwStyle().addClass(cls.border_t_warning_1)
  def border_t_warning_2: SwStyle = SwStyle().addClass(cls.border_t_warning_2)
  def border_t_warning_3: SwStyle = SwStyle().addClass(cls.border_t_warning_3)
  def border_t_warning_4: SwStyle = SwStyle().addClass(cls.border_t_warning_4)
  def border_t_warning_5: SwStyle = SwStyle().addClass(cls.border_t_warning_5)
  def border_t_transparent: SwStyle = SwStyle().addClass(cls.border_t_transparent)
  def border_t_current: SwStyle = SwStyle().addClass(cls.border_t_current)
  def border_t_inherit: SwStyle = SwStyle().addClass(cls.border_t_inherit)
  def border_t_custom_1: SwStyle = SwStyle().addClass(cls.border_t_custom_1)
  def border_t_custom_2: SwStyle = SwStyle().addClass(cls.border_t_custom_2)
  def border_t_custom_3: SwStyle = SwStyle().addClass(cls.border_t_custom_3)
  def border_t_custom_4: SwStyle = SwStyle().addClass(cls.border_t_custom_4)
  def border_r_gray_0: SwStyle = SwStyle().addClass(cls.border_r_gray_0)
  def border_r_gray_1: SwStyle = SwStyle().addClass(cls.border_r_gray_1)
  def border_r_gray_2: SwStyle = SwStyle().addClass(cls.border_r_gray_2)
  def border_r_gray_3: SwStyle = SwStyle().addClass(cls.border_r_gray_3)
  def border_r_gray_4: SwStyle = SwStyle().addClass(cls.border_r_gray_4)
  def border_r_gray_5: SwStyle = SwStyle().addClass(cls.border_r_gray_5)
  def border_r_gray_6: SwStyle = SwStyle().addClass(cls.border_r_gray_6)
  def border_r_gray_7: SwStyle = SwStyle().addClass(cls.border_r_gray_7)
  def border_r_gray_8: SwStyle = SwStyle().addClass(cls.border_r_gray_8)
  def border_r_gray_9: SwStyle = SwStyle().addClass(cls.border_r_gray_9)
  def border_r_danger_1: SwStyle = SwStyle().addClass(cls.border_r_danger_1)
  def border_r_danger_2: SwStyle = SwStyle().addClass(cls.border_r_danger_2)
  def border_r_danger_3: SwStyle = SwStyle().addClass(cls.border_r_danger_3)
  def border_r_danger_4: SwStyle = SwStyle().addClass(cls.border_r_danger_4)
  def border_r_danger_5: SwStyle = SwStyle().addClass(cls.border_r_danger_5)
  def border_r_primary_1: SwStyle = SwStyle().addClass(cls.border_r_primary_1)
  def border_r_primary_2: SwStyle = SwStyle().addClass(cls.border_r_primary_2)
  def border_r_primary_3: SwStyle = SwStyle().addClass(cls.border_r_primary_3)
  def border_r_primary_4: SwStyle = SwStyle().addClass(cls.border_r_primary_4)
  def border_r_primary_5: SwStyle = SwStyle().addClass(cls.border_r_primary_5)
  def border_r_success_1: SwStyle = SwStyle().addClass(cls.border_r_success_1)
  def border_r_success_2: SwStyle = SwStyle().addClass(cls.border_r_success_2)
  def border_r_success_3: SwStyle = SwStyle().addClass(cls.border_r_success_3)
  def border_r_success_4: SwStyle = SwStyle().addClass(cls.border_r_success_4)
  def border_r_success_5: SwStyle = SwStyle().addClass(cls.border_r_success_5)
  def border_r_warning_1: SwStyle = SwStyle().addClass(cls.border_r_warning_1)
  def border_r_warning_2: SwStyle = SwStyle().addClass(cls.border_r_warning_2)
  def border_r_warning_3: SwStyle = SwStyle().addClass(cls.border_r_warning_3)
  def border_r_warning_4: SwStyle = SwStyle().addClass(cls.border_r_warning_4)
  def border_r_warning_5: SwStyle = SwStyle().addClass(cls.border_r_warning_5)
  def border_r_transparent: SwStyle = SwStyle().addClass(cls.border_r_transparent)
  def border_r_current: SwStyle = SwStyle().addClass(cls.border_r_current)
  def border_r_inherit: SwStyle = SwStyle().addClass(cls.border_r_inherit)
  def border_r_custom_1: SwStyle = SwStyle().addClass(cls.border_r_custom_1)
  def border_r_custom_2: SwStyle = SwStyle().addClass(cls.border_r_custom_2)
  def border_r_custom_3: SwStyle = SwStyle().addClass(cls.border_r_custom_3)
  def border_r_custom_4: SwStyle = SwStyle().addClass(cls.border_r_custom_4)
  def border_b_gray_0: SwStyle = SwStyle().addClass(cls.border_b_gray_0)
  def border_b_gray_1: SwStyle = SwStyle().addClass(cls.border_b_gray_1)
  def border_b_gray_2: SwStyle = SwStyle().addClass(cls.border_b_gray_2)
  def border_b_gray_3: SwStyle = SwStyle().addClass(cls.border_b_gray_3)
  def border_b_gray_4: SwStyle = SwStyle().addClass(cls.border_b_gray_4)
  def border_b_gray_5: SwStyle = SwStyle().addClass(cls.border_b_gray_5)
  def border_b_gray_6: SwStyle = SwStyle().addClass(cls.border_b_gray_6)
  def border_b_gray_7: SwStyle = SwStyle().addClass(cls.border_b_gray_7)
  def border_b_gray_8: SwStyle = SwStyle().addClass(cls.border_b_gray_8)
  def border_b_gray_9: SwStyle = SwStyle().addClass(cls.border_b_gray_9)
  def border_b_danger_1: SwStyle = SwStyle().addClass(cls.border_b_danger_1)
  def border_b_danger_2: SwStyle = SwStyle().addClass(cls.border_b_danger_2)
  def border_b_danger_3: SwStyle = SwStyle().addClass(cls.border_b_danger_3)
  def border_b_danger_4: SwStyle = SwStyle().addClass(cls.border_b_danger_4)
  def border_b_danger_5: SwStyle = SwStyle().addClass(cls.border_b_danger_5)
  def border_b_primary_1: SwStyle = SwStyle().addClass(cls.border_b_primary_1)
  def border_b_primary_2: SwStyle = SwStyle().addClass(cls.border_b_primary_2)
  def border_b_primary_3: SwStyle = SwStyle().addClass(cls.border_b_primary_3)
  def border_b_primary_4: SwStyle = SwStyle().addClass(cls.border_b_primary_4)
  def border_b_primary_5: SwStyle = SwStyle().addClass(cls.border_b_primary_5)
  def border_b_success_1: SwStyle = SwStyle().addClass(cls.border_b_success_1)
  def border_b_success_2: SwStyle = SwStyle().addClass(cls.border_b_success_2)
  def border_b_success_3: SwStyle = SwStyle().addClass(cls.border_b_success_3)
  def border_b_success_4: SwStyle = SwStyle().addClass(cls.border_b_success_4)
  def border_b_success_5: SwStyle = SwStyle().addClass(cls.border_b_success_5)
  def border_b_warning_1: SwStyle = SwStyle().addClass(cls.border_b_warning_1)
  def border_b_warning_2: SwStyle = SwStyle().addClass(cls.border_b_warning_2)
  def border_b_warning_3: SwStyle = SwStyle().addClass(cls.border_b_warning_3)
  def border_b_warning_4: SwStyle = SwStyle().addClass(cls.border_b_warning_4)
  def border_b_warning_5: SwStyle = SwStyle().addClass(cls.border_b_warning_5)
  def border_b_transparent: SwStyle = SwStyle().addClass(cls.border_b_transparent)
  def border_b_current: SwStyle = SwStyle().addClass(cls.border_b_current)
  def border_b_inherit: SwStyle = SwStyle().addClass(cls.border_b_inherit)
  def border_b_custom_1: SwStyle = SwStyle().addClass(cls.border_b_custom_1)
  def border_b_custom_2: SwStyle = SwStyle().addClass(cls.border_b_custom_2)
  def border_b_custom_3: SwStyle = SwStyle().addClass(cls.border_b_custom_3)
  def border_b_custom_4: SwStyle = SwStyle().addClass(cls.border_b_custom_4)
  def border_l_gray_0: SwStyle = SwStyle().addClass(cls.border_l_gray_0)
  def border_l_gray_1: SwStyle = SwStyle().addClass(cls.border_l_gray_1)
  def border_l_gray_2: SwStyle = SwStyle().addClass(cls.border_l_gray_2)
  def border_l_gray_3: SwStyle = SwStyle().addClass(cls.border_l_gray_3)
  def border_l_gray_4: SwStyle = SwStyle().addClass(cls.border_l_gray_4)
  def border_l_gray_5: SwStyle = SwStyle().addClass(cls.border_l_gray_5)
  def border_l_gray_6: SwStyle = SwStyle().addClass(cls.border_l_gray_6)
  def border_l_gray_7: SwStyle = SwStyle().addClass(cls.border_l_gray_7)
  def border_l_gray_8: SwStyle = SwStyle().addClass(cls.border_l_gray_8)
  def border_l_gray_9: SwStyle = SwStyle().addClass(cls.border_l_gray_9)
  def border_l_danger_1: SwStyle = SwStyle().addClass(cls.border_l_danger_1)
  def border_l_danger_2: SwStyle = SwStyle().addClass(cls.border_l_danger_2)
  def border_l_danger_3: SwStyle = SwStyle().addClass(cls.border_l_danger_3)
  def border_l_danger_4: SwStyle = SwStyle().addClass(cls.border_l_danger_4)
  def border_l_danger_5: SwStyle = SwStyle().addClass(cls.border_l_danger_5)
  def border_l_primary_1: SwStyle = SwStyle().addClass(cls.border_l_primary_1)
  def border_l_primary_2: SwStyle = SwStyle().addClass(cls.border_l_primary_2)
  def border_l_primary_3: SwStyle = SwStyle().addClass(cls.border_l_primary_3)
  def border_l_primary_4: SwStyle = SwStyle().addClass(cls.border_l_primary_4)
  def border_l_primary_5: SwStyle = SwStyle().addClass(cls.border_l_primary_5)
  def border_l_success_1: SwStyle = SwStyle().addClass(cls.border_l_success_1)
  def border_l_success_2: SwStyle = SwStyle().addClass(cls.border_l_success_2)
  def border_l_success_3: SwStyle = SwStyle().addClass(cls.border_l_success_3)
  def border_l_success_4: SwStyle = SwStyle().addClass(cls.border_l_success_4)
  def border_l_success_5: SwStyle = SwStyle().addClass(cls.border_l_success_5)
  def border_l_warning_1: SwStyle = SwStyle().addClass(cls.border_l_warning_1)
  def border_l_warning_2: SwStyle = SwStyle().addClass(cls.border_l_warning_2)
  def border_l_warning_3: SwStyle = SwStyle().addClass(cls.border_l_warning_3)
  def border_l_warning_4: SwStyle = SwStyle().addClass(cls.border_l_warning_4)
  def border_l_warning_5: SwStyle = SwStyle().addClass(cls.border_l_warning_5)
  def border_l_transparent: SwStyle = SwStyle().addClass(cls.border_l_transparent)
  def border_l_current: SwStyle = SwStyle().addClass(cls.border_l_current)
  def border_l_inherit: SwStyle = SwStyle().addClass(cls.border_l_inherit)
  def border_l_custom_1: SwStyle = SwStyle().addClass(cls.border_l_custom_1)
  def border_l_custom_2: SwStyle = SwStyle().addClass(cls.border_l_custom_2)
  def border_l_custom_3: SwStyle = SwStyle().addClass(cls.border_l_custom_3)
  def border_l_custom_4: SwStyle = SwStyle().addClass(cls.border_l_custom_4)
  def border_opacity_0: SwStyle = SwStyle().addClass(cls.border_opacity_0)
  def border_opacity_10: SwStyle = SwStyle().addClass(cls.border_opacity_10)
  def border_opacity_20: SwStyle = SwStyle().addClass(cls.border_opacity_20)
  def border_opacity_30: SwStyle = SwStyle().addClass(cls.border_opacity_30)
  def border_opacity_40: SwStyle = SwStyle().addClass(cls.border_opacity_40)
  def border_opacity_50: SwStyle = SwStyle().addClass(cls.border_opacity_50)
  def border_opacity_60: SwStyle = SwStyle().addClass(cls.border_opacity_60)
  def border_opacity_70: SwStyle = SwStyle().addClass(cls.border_opacity_70)
  def border_opacity_80: SwStyle = SwStyle().addClass(cls.border_opacity_80)
  def border_opacity_90: SwStyle = SwStyle().addClass(cls.border_opacity_90)
  def border_opacity_100: SwStyle = SwStyle().addClass(cls.border_opacity_100)
  def bg_gray_0: SwStyle = SwStyle().addClass(cls.bg_gray_0)
  def bg_gray_1: SwStyle = SwStyle().addClass(cls.bg_gray_1)
  def bg_gray_2: SwStyle = SwStyle().addClass(cls.bg_gray_2)
  def bg_gray_3: SwStyle = SwStyle().addClass(cls.bg_gray_3)
  def bg_gray_4: SwStyle = SwStyle().addClass(cls.bg_gray_4)
  def bg_gray_5: SwStyle = SwStyle().addClass(cls.bg_gray_5)
  def bg_gray_6: SwStyle = SwStyle().addClass(cls.bg_gray_6)
  def bg_gray_7: SwStyle = SwStyle().addClass(cls.bg_gray_7)
  def bg_gray_8: SwStyle = SwStyle().addClass(cls.bg_gray_8)
  def bg_gray_9: SwStyle = SwStyle().addClass(cls.bg_gray_9)
  def bg_danger_1: SwStyle = SwStyle().addClass(cls.bg_danger_1)
  def bg_danger_2: SwStyle = SwStyle().addClass(cls.bg_danger_2)
  def bg_danger_3: SwStyle = SwStyle().addClass(cls.bg_danger_3)
  def bg_danger_4: SwStyle = SwStyle().addClass(cls.bg_danger_4)
  def bg_danger_5: SwStyle = SwStyle().addClass(cls.bg_danger_5)
  def bg_primary_1: SwStyle = SwStyle().addClass(cls.bg_primary_1)
  def bg_primary_2: SwStyle = SwStyle().addClass(cls.bg_primary_2)
  def bg_primary_3: SwStyle = SwStyle().addClass(cls.bg_primary_3)
  def bg_primary_4: SwStyle = SwStyle().addClass(cls.bg_primary_4)
  def bg_primary_5: SwStyle = SwStyle().addClass(cls.bg_primary_5)
  def bg_success_1: SwStyle = SwStyle().addClass(cls.bg_success_1)
  def bg_success_2: SwStyle = SwStyle().addClass(cls.bg_success_2)
  def bg_success_3: SwStyle = SwStyle().addClass(cls.bg_success_3)
  def bg_success_4: SwStyle = SwStyle().addClass(cls.bg_success_4)
  def bg_success_5: SwStyle = SwStyle().addClass(cls.bg_success_5)
  def bg_warning_1: SwStyle = SwStyle().addClass(cls.bg_warning_1)
  def bg_warning_2: SwStyle = SwStyle().addClass(cls.bg_warning_2)
  def bg_warning_3: SwStyle = SwStyle().addClass(cls.bg_warning_3)
  def bg_warning_4: SwStyle = SwStyle().addClass(cls.bg_warning_4)
  def bg_warning_5: SwStyle = SwStyle().addClass(cls.bg_warning_5)
  def bg_transparent: SwStyle = SwStyle().addClass(cls.bg_transparent)
  def bg_current: SwStyle = SwStyle().addClass(cls.bg_current)
  def bg_inherit: SwStyle = SwStyle().addClass(cls.bg_inherit)
  def bg_custom_1: SwStyle = SwStyle().addClass(cls.bg_custom_1)
  def bg_custom_2: SwStyle = SwStyle().addClass(cls.bg_custom_2)
  def bg_custom_3: SwStyle = SwStyle().addClass(cls.bg_custom_3)
  def bg_custom_4: SwStyle = SwStyle().addClass(cls.bg_custom_4)
  def bg_opacity_0: SwStyle = SwStyle().addClass(cls.bg_opacity_0)
  def bg_opacity_10: SwStyle = SwStyle().addClass(cls.bg_opacity_10)
  def bg_opacity_20: SwStyle = SwStyle().addClass(cls.bg_opacity_20)
  def bg_opacity_30: SwStyle = SwStyle().addClass(cls.bg_opacity_30)
  def bg_opacity_40: SwStyle = SwStyle().addClass(cls.bg_opacity_40)
  def bg_opacity_50: SwStyle = SwStyle().addClass(cls.bg_opacity_50)
  def bg_opacity_60: SwStyle = SwStyle().addClass(cls.bg_opacity_60)
  def bg_opacity_70: SwStyle = SwStyle().addClass(cls.bg_opacity_70)
  def bg_opacity_80: SwStyle = SwStyle().addClass(cls.bg_opacity_80)
  def bg_opacity_90: SwStyle = SwStyle().addClass(cls.bg_opacity_90)
  def bg_opacity_100: SwStyle = SwStyle().addClass(cls.bg_opacity_100)
  def bg_clip_border: SwStyle = SwStyle().addClass(cls.bg_clip_border)
  def bg_clip_padding: SwStyle = SwStyle().addClass(cls.bg_clip_padding)
  def bg_clip_content: SwStyle = SwStyle().addClass(cls.bg_clip_content)
  def bg_clip_text: SwStyle = SwStyle().addClass(cls.bg_clip_text)
  def bg_origin_border: SwStyle = SwStyle().addClass(cls.bg_origin_border)
  def bg_origin_padding: SwStyle = SwStyle().addClass(cls.bg_origin_padding)
  def bg_origin_content: SwStyle = SwStyle().addClass(cls.bg_origin_content)
  def p_0: SwStyle = SwStyle().addClass(cls.p_0)
  def p_2: SwStyle = SwStyle().addClass(cls.p_2)
  def p_4: SwStyle = SwStyle().addClass(cls.p_4)
  def p_6: SwStyle = SwStyle().addClass(cls.p_6)
  def p_8: SwStyle = SwStyle().addClass(cls.p_8)
  def p_12: SwStyle = SwStyle().addClass(cls.p_12)
  def p_16: SwStyle = SwStyle().addClass(cls.p_16)
  def p_20: SwStyle = SwStyle().addClass(cls.p_20)
  def p_24: SwStyle = SwStyle().addClass(cls.p_24)
  def p_32: SwStyle = SwStyle().addClass(cls.p_32)
  def p_40: SwStyle = SwStyle().addClass(cls.p_40)
  def p_48: SwStyle = SwStyle().addClass(cls.p_48)
  def px_0: SwStyle = SwStyle().addClass(cls.px_0)
  def px_2: SwStyle = SwStyle().addClass(cls.px_2)
  def px_4: SwStyle = SwStyle().addClass(cls.px_4)
  def px_6: SwStyle = SwStyle().addClass(cls.px_6)
  def px_8: SwStyle = SwStyle().addClass(cls.px_8)
  def px_12: SwStyle = SwStyle().addClass(cls.px_12)
  def px_16: SwStyle = SwStyle().addClass(cls.px_16)
  def px_20: SwStyle = SwStyle().addClass(cls.px_20)
  def px_24: SwStyle = SwStyle().addClass(cls.px_24)
  def px_32: SwStyle = SwStyle().addClass(cls.px_32)
  def px_40: SwStyle = SwStyle().addClass(cls.px_40)
  def px_48: SwStyle = SwStyle().addClass(cls.px_48)
  def py_0: SwStyle = SwStyle().addClass(cls.py_0)
  def py_2: SwStyle = SwStyle().addClass(cls.py_2)
  def py_4: SwStyle = SwStyle().addClass(cls.py_4)
  def py_6: SwStyle = SwStyle().addClass(cls.py_6)
  def py_8: SwStyle = SwStyle().addClass(cls.py_8)
  def py_12: SwStyle = SwStyle().addClass(cls.py_12)
  def py_16: SwStyle = SwStyle().addClass(cls.py_16)
  def py_20: SwStyle = SwStyle().addClass(cls.py_20)
  def py_24: SwStyle = SwStyle().addClass(cls.py_24)
  def py_32: SwStyle = SwStyle().addClass(cls.py_32)
  def py_40: SwStyle = SwStyle().addClass(cls.py_40)
  def py_48: SwStyle = SwStyle().addClass(cls.py_48)
  def ps_0: SwStyle = SwStyle().addClass(cls.ps_0)
  def ps_2: SwStyle = SwStyle().addClass(cls.ps_2)
  def ps_4: SwStyle = SwStyle().addClass(cls.ps_4)
  def ps_6: SwStyle = SwStyle().addClass(cls.ps_6)
  def ps_8: SwStyle = SwStyle().addClass(cls.ps_8)
  def ps_12: SwStyle = SwStyle().addClass(cls.ps_12)
  def ps_16: SwStyle = SwStyle().addClass(cls.ps_16)
  def ps_20: SwStyle = SwStyle().addClass(cls.ps_20)
  def ps_24: SwStyle = SwStyle().addClass(cls.ps_24)
  def ps_32: SwStyle = SwStyle().addClass(cls.ps_32)
  def ps_40: SwStyle = SwStyle().addClass(cls.ps_40)
  def ps_48: SwStyle = SwStyle().addClass(cls.ps_48)
  def pe_0: SwStyle = SwStyle().addClass(cls.pe_0)
  def pe_2: SwStyle = SwStyle().addClass(cls.pe_2)
  def pe_4: SwStyle = SwStyle().addClass(cls.pe_4)
  def pe_6: SwStyle = SwStyle().addClass(cls.pe_6)
  def pe_8: SwStyle = SwStyle().addClass(cls.pe_8)
  def pe_12: SwStyle = SwStyle().addClass(cls.pe_12)
  def pe_16: SwStyle = SwStyle().addClass(cls.pe_16)
  def pe_20: SwStyle = SwStyle().addClass(cls.pe_20)
  def pe_24: SwStyle = SwStyle().addClass(cls.pe_24)
  def pe_32: SwStyle = SwStyle().addClass(cls.pe_32)
  def pe_40: SwStyle = SwStyle().addClass(cls.pe_40)
  def pe_48: SwStyle = SwStyle().addClass(cls.pe_48)
  def pt_0: SwStyle = SwStyle().addClass(cls.pt_0)
  def pt_2: SwStyle = SwStyle().addClass(cls.pt_2)
  def pt_4: SwStyle = SwStyle().addClass(cls.pt_4)
  def pt_6: SwStyle = SwStyle().addClass(cls.pt_6)
  def pt_8: SwStyle = SwStyle().addClass(cls.pt_8)
  def pt_12: SwStyle = SwStyle().addClass(cls.pt_12)
  def pt_16: SwStyle = SwStyle().addClass(cls.pt_16)
  def pt_20: SwStyle = SwStyle().addClass(cls.pt_20)
  def pt_24: SwStyle = SwStyle().addClass(cls.pt_24)
  def pt_32: SwStyle = SwStyle().addClass(cls.pt_32)
  def pt_40: SwStyle = SwStyle().addClass(cls.pt_40)
  def pt_48: SwStyle = SwStyle().addClass(cls.pt_48)
  def pr_0: SwStyle = SwStyle().addClass(cls.pr_0)
  def pr_2: SwStyle = SwStyle().addClass(cls.pr_2)
  def pr_4: SwStyle = SwStyle().addClass(cls.pr_4)
  def pr_6: SwStyle = SwStyle().addClass(cls.pr_6)
  def pr_8: SwStyle = SwStyle().addClass(cls.pr_8)
  def pr_12: SwStyle = SwStyle().addClass(cls.pr_12)
  def pr_16: SwStyle = SwStyle().addClass(cls.pr_16)
  def pr_20: SwStyle = SwStyle().addClass(cls.pr_20)
  def pr_24: SwStyle = SwStyle().addClass(cls.pr_24)
  def pr_32: SwStyle = SwStyle().addClass(cls.pr_32)
  def pr_40: SwStyle = SwStyle().addClass(cls.pr_40)
  def pr_48: SwStyle = SwStyle().addClass(cls.pr_48)
  def pb_0: SwStyle = SwStyle().addClass(cls.pb_0)
  def pb_2: SwStyle = SwStyle().addClass(cls.pb_2)
  def pb_4: SwStyle = SwStyle().addClass(cls.pb_4)
  def pb_6: SwStyle = SwStyle().addClass(cls.pb_6)
  def pb_8: SwStyle = SwStyle().addClass(cls.pb_8)
  def pb_12: SwStyle = SwStyle().addClass(cls.pb_12)
  def pb_16: SwStyle = SwStyle().addClass(cls.pb_16)
  def pb_20: SwStyle = SwStyle().addClass(cls.pb_20)
  def pb_24: SwStyle = SwStyle().addClass(cls.pb_24)
  def pb_32: SwStyle = SwStyle().addClass(cls.pb_32)
  def pb_40: SwStyle = SwStyle().addClass(cls.pb_40)
  def pb_48: SwStyle = SwStyle().addClass(cls.pb_48)
  def pl_0: SwStyle = SwStyle().addClass(cls.pl_0)
  def pl_2: SwStyle = SwStyle().addClass(cls.pl_2)
  def pl_4: SwStyle = SwStyle().addClass(cls.pl_4)
  def pl_6: SwStyle = SwStyle().addClass(cls.pl_6)
  def pl_8: SwStyle = SwStyle().addClass(cls.pl_8)
  def pl_12: SwStyle = SwStyle().addClass(cls.pl_12)
  def pl_16: SwStyle = SwStyle().addClass(cls.pl_16)
  def pl_20: SwStyle = SwStyle().addClass(cls.pl_20)
  def pl_24: SwStyle = SwStyle().addClass(cls.pl_24)
  def pl_32: SwStyle = SwStyle().addClass(cls.pl_32)
  def pl_40: SwStyle = SwStyle().addClass(cls.pl_40)
  def pl_48: SwStyle = SwStyle().addClass(cls.pl_48)
  def text_left: SwStyle = SwStyle().addClass(cls.text_left)
  def text_center: SwStyle = SwStyle().addClass(cls.text_center)
  def text_right: SwStyle = SwStyle().addClass(cls.text_right)
  def text_justify: SwStyle = SwStyle().addClass(cls.text_justify)
  def text_start: SwStyle = SwStyle().addClass(cls.text_start)
  def text_end: SwStyle = SwStyle().addClass(cls.text_end)
  def indent_0: SwStyle = SwStyle().addClass(cls.indent_0)
  def indent_2: SwStyle = SwStyle().addClass(cls.indent_2)
  def indent_4: SwStyle = SwStyle().addClass(cls.indent_4)
  def indent_6: SwStyle = SwStyle().addClass(cls.indent_6)
  def indent_8: SwStyle = SwStyle().addClass(cls.indent_8)
  def indent_12: SwStyle = SwStyle().addClass(cls.indent_12)
  def indent_16: SwStyle = SwStyle().addClass(cls.indent_16)
  def indent_20: SwStyle = SwStyle().addClass(cls.indent_20)
  def indent_24: SwStyle = SwStyle().addClass(cls.indent_24)
  def indent_32: SwStyle = SwStyle().addClass(cls.indent_32)
  def indent_40: SwStyle = SwStyle().addClass(cls.indent_40)
  def indent_48: SwStyle = SwStyle().addClass(cls.indent_48)
  def _indent_0: SwStyle = SwStyle().addClass(cls._indent_0)
  def _indent_2: SwStyle = SwStyle().addClass(cls._indent_2)
  def _indent_4: SwStyle = SwStyle().addClass(cls._indent_4)
  def _indent_6: SwStyle = SwStyle().addClass(cls._indent_6)
  def _indent_8: SwStyle = SwStyle().addClass(cls._indent_8)
  def _indent_12: SwStyle = SwStyle().addClass(cls._indent_12)
  def _indent_16: SwStyle = SwStyle().addClass(cls._indent_16)
  def _indent_20: SwStyle = SwStyle().addClass(cls._indent_20)
  def _indent_24: SwStyle = SwStyle().addClass(cls._indent_24)
  def _indent_32: SwStyle = SwStyle().addClass(cls._indent_32)
  def _indent_40: SwStyle = SwStyle().addClass(cls._indent_40)
  def _indent_48: SwStyle = SwStyle().addClass(cls._indent_48)
  def align_baseline: SwStyle = SwStyle().addClass(cls.align_baseline)
  def align_top: SwStyle = SwStyle().addClass(cls.align_top)
  def align_middle: SwStyle = SwStyle().addClass(cls.align_middle)
  def align_bottom: SwStyle = SwStyle().addClass(cls.align_bottom)
  def align_text_top: SwStyle = SwStyle().addClass(cls.align_text_top)
  def align_text_bottom: SwStyle = SwStyle().addClass(cls.align_text_bottom)
  def align_sub: SwStyle = SwStyle().addClass(cls.align_sub)
  def align_super: SwStyle = SwStyle().addClass(cls.align_super)
  def font_sans: SwStyle = SwStyle().addClass(cls.font_sans)
  def font_mono: SwStyle = SwStyle().addClass(cls.font_mono)
  def text_9: SwStyle = SwStyle().addClass(cls.text_9)
  def text_10: SwStyle = SwStyle().addClass(cls.text_10)
  def text_11: SwStyle = SwStyle().addClass(cls.text_11)
  def text_13: SwStyle = SwStyle().addClass(cls.text_13)
  def text_15: SwStyle = SwStyle().addClass(cls.text_15)
  def text_17: SwStyle = SwStyle().addClass(cls.text_17)
  def text_20: SwStyle = SwStyle().addClass(cls.text_20)
  def text_23: SwStyle = SwStyle().addClass(cls.text_23)
  def text_26: SwStyle = SwStyle().addClass(cls.text_26)
  def text_30: SwStyle = SwStyle().addClass(cls.text_30)
  def text_35: SwStyle = SwStyle().addClass(cls.text_35)
  def text_custom_1: SwStyle = SwStyle().addClass(cls.text_custom_1)
  def font_normal: SwStyle = SwStyle().addClass(cls.font_normal)
  def font_medium: SwStyle = SwStyle().addClass(cls.font_medium)
  def font_semi_bold: SwStyle = SwStyle().addClass(cls.font_semi_bold)
  def font_bold: SwStyle = SwStyle().addClass(cls.font_bold)
  def uppercase: SwStyle = SwStyle().addClass(cls.uppercase)
  def lowercase: SwStyle = SwStyle().addClass(cls.lowercase)
  def capitalize: SwStyle = SwStyle().addClass(cls.capitalize)
  def normal_case: SwStyle = SwStyle().addClass(cls.normal_case)
  def italic: SwStyle = SwStyle().addClass(cls.italic)
  def not_italic: SwStyle = SwStyle().addClass(cls.not_italic)
  def normal_nums: SwStyle = SwStyle().addClass(cls.normal_nums)
  def ordinal: SwStyle = SwStyle().addClass(cls.ordinal)
  def slashed_zero: SwStyle = SwStyle().addClass(cls.slashed_zero)
  def lining_nums: SwStyle = SwStyle().addClass(cls.lining_nums)
  def oldstyle_nums: SwStyle = SwStyle().addClass(cls.oldstyle_nums)
  def proportional_nums: SwStyle = SwStyle().addClass(cls.proportional_nums)
  def tabular_nums: SwStyle = SwStyle().addClass(cls.tabular_nums)
  def diagonal_fractions: SwStyle = SwStyle().addClass(cls.diagonal_fractions)
  def stacked_fractions: SwStyle = SwStyle().addClass(cls.stacked_fractions)
  def leading_16: SwStyle = SwStyle().addClass(cls.leading_16)
  def leading_20: SwStyle = SwStyle().addClass(cls.leading_20)
  def leading_24: SwStyle = SwStyle().addClass(cls.leading_24)
  def leading_28: SwStyle = SwStyle().addClass(cls.leading_28)
  def leading_32: SwStyle = SwStyle().addClass(cls.leading_32)
  def leading_40: SwStyle = SwStyle().addClass(cls.leading_40)
  def leading_44: SwStyle = SwStyle().addClass(cls.leading_44)
  def leading_r1p5: SwStyle = SwStyle().addClass(cls.leading_r1p5)
  def text_gray_0: SwStyle = SwStyle().addClass(cls.text_gray_0)
  def text_gray_1: SwStyle = SwStyle().addClass(cls.text_gray_1)
  def text_gray_2: SwStyle = SwStyle().addClass(cls.text_gray_2)
  def text_gray_3: SwStyle = SwStyle().addClass(cls.text_gray_3)
  def text_gray_4: SwStyle = SwStyle().addClass(cls.text_gray_4)
  def text_gray_5: SwStyle = SwStyle().addClass(cls.text_gray_5)
  def text_gray_6: SwStyle = SwStyle().addClass(cls.text_gray_6)
  def text_gray_7: SwStyle = SwStyle().addClass(cls.text_gray_7)
  def text_gray_8: SwStyle = SwStyle().addClass(cls.text_gray_8)
  def text_gray_9: SwStyle = SwStyle().addClass(cls.text_gray_9)
  def text_danger_1: SwStyle = SwStyle().addClass(cls.text_danger_1)
  def text_danger_2: SwStyle = SwStyle().addClass(cls.text_danger_2)
  def text_danger_3: SwStyle = SwStyle().addClass(cls.text_danger_3)
  def text_danger_4: SwStyle = SwStyle().addClass(cls.text_danger_4)
  def text_danger_5: SwStyle = SwStyle().addClass(cls.text_danger_5)
  def text_primary_1: SwStyle = SwStyle().addClass(cls.text_primary_1)
  def text_primary_2: SwStyle = SwStyle().addClass(cls.text_primary_2)
  def text_primary_3: SwStyle = SwStyle().addClass(cls.text_primary_3)
  def text_primary_4: SwStyle = SwStyle().addClass(cls.text_primary_4)
  def text_primary_5: SwStyle = SwStyle().addClass(cls.text_primary_5)
  def text_success_1: SwStyle = SwStyle().addClass(cls.text_success_1)
  def text_success_2: SwStyle = SwStyle().addClass(cls.text_success_2)
  def text_success_3: SwStyle = SwStyle().addClass(cls.text_success_3)
  def text_success_4: SwStyle = SwStyle().addClass(cls.text_success_4)
  def text_success_5: SwStyle = SwStyle().addClass(cls.text_success_5)
  def text_warning_1: SwStyle = SwStyle().addClass(cls.text_warning_1)
  def text_warning_2: SwStyle = SwStyle().addClass(cls.text_warning_2)
  def text_warning_3: SwStyle = SwStyle().addClass(cls.text_warning_3)
  def text_warning_4: SwStyle = SwStyle().addClass(cls.text_warning_4)
  def text_warning_5: SwStyle = SwStyle().addClass(cls.text_warning_5)
  def text_transparent: SwStyle = SwStyle().addClass(cls.text_transparent)
  def text_current: SwStyle = SwStyle().addClass(cls.text_current)
  def text_inherit: SwStyle = SwStyle().addClass(cls.text_inherit)
  def text_custom_1: SwStyle = SwStyle().addClass(cls.text_custom_1)
  def text_custom_2: SwStyle = SwStyle().addClass(cls.text_custom_2)
  def text_custom_3: SwStyle = SwStyle().addClass(cls.text_custom_3)
  def text_custom_4: SwStyle = SwStyle().addClass(cls.text_custom_4)
  def text_opacity_0: SwStyle = SwStyle().addClass(cls.text_opacity_0)
  def text_opacity_10: SwStyle = SwStyle().addClass(cls.text_opacity_10)
  def text_opacity_20: SwStyle = SwStyle().addClass(cls.text_opacity_20)
  def text_opacity_30: SwStyle = SwStyle().addClass(cls.text_opacity_30)
  def text_opacity_40: SwStyle = SwStyle().addClass(cls.text_opacity_40)
  def text_opacity_50: SwStyle = SwStyle().addClass(cls.text_opacity_50)
  def text_opacity_60: SwStyle = SwStyle().addClass(cls.text_opacity_60)
  def text_opacity_70: SwStyle = SwStyle().addClass(cls.text_opacity_70)
  def text_opacity_80: SwStyle = SwStyle().addClass(cls.text_opacity_80)
  def text_opacity_90: SwStyle = SwStyle().addClass(cls.text_opacity_90)
  def text_opacity_100: SwStyle = SwStyle().addClass(cls.text_opacity_100)
  def underline: SwStyle = SwStyle().addClass(cls.underline)
  def overline: SwStyle = SwStyle().addClass(cls.overline)
  def line_through: SwStyle = SwStyle().addClass(cls.line_through)
  def no_underline: SwStyle = SwStyle().addClass(cls.no_underline)
  def decoration_gray_0: SwStyle = SwStyle().addClass(cls.decoration_gray_0)
  def decoration_gray_1: SwStyle = SwStyle().addClass(cls.decoration_gray_1)
  def decoration_gray_2: SwStyle = SwStyle().addClass(cls.decoration_gray_2)
  def decoration_gray_3: SwStyle = SwStyle().addClass(cls.decoration_gray_3)
  def decoration_gray_4: SwStyle = SwStyle().addClass(cls.decoration_gray_4)
  def decoration_gray_5: SwStyle = SwStyle().addClass(cls.decoration_gray_5)
  def decoration_gray_6: SwStyle = SwStyle().addClass(cls.decoration_gray_6)
  def decoration_gray_7: SwStyle = SwStyle().addClass(cls.decoration_gray_7)
  def decoration_gray_8: SwStyle = SwStyle().addClass(cls.decoration_gray_8)
  def decoration_gray_9: SwStyle = SwStyle().addClass(cls.decoration_gray_9)
  def decoration_danger_1: SwStyle = SwStyle().addClass(cls.decoration_danger_1)
  def decoration_danger_2: SwStyle = SwStyle().addClass(cls.decoration_danger_2)
  def decoration_danger_3: SwStyle = SwStyle().addClass(cls.decoration_danger_3)
  def decoration_danger_4: SwStyle = SwStyle().addClass(cls.decoration_danger_4)
  def decoration_danger_5: SwStyle = SwStyle().addClass(cls.decoration_danger_5)
  def decoration_primary_1: SwStyle = SwStyle().addClass(cls.decoration_primary_1)
  def decoration_primary_2: SwStyle = SwStyle().addClass(cls.decoration_primary_2)
  def decoration_primary_3: SwStyle = SwStyle().addClass(cls.decoration_primary_3)
  def decoration_primary_4: SwStyle = SwStyle().addClass(cls.decoration_primary_4)
  def decoration_primary_5: SwStyle = SwStyle().addClass(cls.decoration_primary_5)
  def decoration_success_1: SwStyle = SwStyle().addClass(cls.decoration_success_1)
  def decoration_success_2: SwStyle = SwStyle().addClass(cls.decoration_success_2)
  def decoration_success_3: SwStyle = SwStyle().addClass(cls.decoration_success_3)
  def decoration_success_4: SwStyle = SwStyle().addClass(cls.decoration_success_4)
  def decoration_success_5: SwStyle = SwStyle().addClass(cls.decoration_success_5)
  def decoration_warning_1: SwStyle = SwStyle().addClass(cls.decoration_warning_1)
  def decoration_warning_2: SwStyle = SwStyle().addClass(cls.decoration_warning_2)
  def decoration_warning_3: SwStyle = SwStyle().addClass(cls.decoration_warning_3)
  def decoration_warning_4: SwStyle = SwStyle().addClass(cls.decoration_warning_4)
  def decoration_warning_5: SwStyle = SwStyle().addClass(cls.decoration_warning_5)
  def decoration_transparent: SwStyle = SwStyle().addClass(cls.decoration_transparent)
  def decoration_current: SwStyle = SwStyle().addClass(cls.decoration_current)
  def decoration_inherit: SwStyle = SwStyle().addClass(cls.decoration_inherit)
  def decoration_custom_1: SwStyle = SwStyle().addClass(cls.decoration_custom_1)
  def decoration_custom_2: SwStyle = SwStyle().addClass(cls.decoration_custom_2)
  def decoration_custom_3: SwStyle = SwStyle().addClass(cls.decoration_custom_3)
  def decoration_custom_4: SwStyle = SwStyle().addClass(cls.decoration_custom_4)
  def decoration_solid: SwStyle = SwStyle().addClass(cls.decoration_solid)
  def decoration_double: SwStyle = SwStyle().addClass(cls.decoration_double)
  def decoration_dotted: SwStyle = SwStyle().addClass(cls.decoration_dotted)
  def decoration_dashed: SwStyle = SwStyle().addClass(cls.decoration_dashed)
  def decoration_wavy: SwStyle = SwStyle().addClass(cls.decoration_wavy)
  def decoration_0: SwStyle = SwStyle().addClass(cls.decoration_0)
  def decoration_1: SwStyle = SwStyle().addClass(cls.decoration_1)
  def decoration_2: SwStyle = SwStyle().addClass(cls.decoration_2)
  def decoration_4: SwStyle = SwStyle().addClass(cls.decoration_4)
  def decoration_8: SwStyle = SwStyle().addClass(cls.decoration_8)
  def decoration_auto: SwStyle = SwStyle().addClass(cls.decoration_auto)
  def decoration_from_font: SwStyle = SwStyle().addClass(cls.decoration_from_font)
  def underline_offset_0: SwStyle = SwStyle().addClass(cls.underline_offset_0)
  def underline_offset_1: SwStyle = SwStyle().addClass(cls.underline_offset_1)
  def underline_offset_2: SwStyle = SwStyle().addClass(cls.underline_offset_2)
  def underline_offset_4: SwStyle = SwStyle().addClass(cls.underline_offset_4)
  def underline_offset_8: SwStyle = SwStyle().addClass(cls.underline_offset_8)
  def underline_offset_auto: SwStyle = SwStyle().addClass(cls.underline_offset_auto)
  def antialiased: SwStyle = SwStyle().addClass(cls.antialiased)
  def subpixel_antialiased: SwStyle = SwStyle().addClass(cls.subpixel_antialiased)
  def caret_gray_0: SwStyle = SwStyle().addClass(cls.caret_gray_0)
  def caret_gray_1: SwStyle = SwStyle().addClass(cls.caret_gray_1)
  def caret_gray_2: SwStyle = SwStyle().addClass(cls.caret_gray_2)
  def caret_gray_3: SwStyle = SwStyle().addClass(cls.caret_gray_3)
  def caret_gray_4: SwStyle = SwStyle().addClass(cls.caret_gray_4)
  def caret_gray_5: SwStyle = SwStyle().addClass(cls.caret_gray_5)
  def caret_gray_6: SwStyle = SwStyle().addClass(cls.caret_gray_6)
  def caret_gray_7: SwStyle = SwStyle().addClass(cls.caret_gray_7)
  def caret_gray_8: SwStyle = SwStyle().addClass(cls.caret_gray_8)
  def caret_gray_9: SwStyle = SwStyle().addClass(cls.caret_gray_9)
  def caret_danger_1: SwStyle = SwStyle().addClass(cls.caret_danger_1)
  def caret_danger_2: SwStyle = SwStyle().addClass(cls.caret_danger_2)
  def caret_danger_3: SwStyle = SwStyle().addClass(cls.caret_danger_3)
  def caret_danger_4: SwStyle = SwStyle().addClass(cls.caret_danger_4)
  def caret_danger_5: SwStyle = SwStyle().addClass(cls.caret_danger_5)
  def caret_primary_1: SwStyle = SwStyle().addClass(cls.caret_primary_1)
  def caret_primary_2: SwStyle = SwStyle().addClass(cls.caret_primary_2)
  def caret_primary_3: SwStyle = SwStyle().addClass(cls.caret_primary_3)
  def caret_primary_4: SwStyle = SwStyle().addClass(cls.caret_primary_4)
  def caret_primary_5: SwStyle = SwStyle().addClass(cls.caret_primary_5)
  def caret_success_1: SwStyle = SwStyle().addClass(cls.caret_success_1)
  def caret_success_2: SwStyle = SwStyle().addClass(cls.caret_success_2)
  def caret_success_3: SwStyle = SwStyle().addClass(cls.caret_success_3)
  def caret_success_4: SwStyle = SwStyle().addClass(cls.caret_success_4)
  def caret_success_5: SwStyle = SwStyle().addClass(cls.caret_success_5)
  def caret_warning_1: SwStyle = SwStyle().addClass(cls.caret_warning_1)
  def caret_warning_2: SwStyle = SwStyle().addClass(cls.caret_warning_2)
  def caret_warning_3: SwStyle = SwStyle().addClass(cls.caret_warning_3)
  def caret_warning_4: SwStyle = SwStyle().addClass(cls.caret_warning_4)
  def caret_warning_5: SwStyle = SwStyle().addClass(cls.caret_warning_5)
  def caret_transparent: SwStyle = SwStyle().addClass(cls.caret_transparent)
  def caret_current: SwStyle = SwStyle().addClass(cls.caret_current)
  def caret_inherit: SwStyle = SwStyle().addClass(cls.caret_inherit)
  def caret_custom_1: SwStyle = SwStyle().addClass(cls.caret_custom_1)
  def caret_custom_2: SwStyle = SwStyle().addClass(cls.caret_custom_2)
  def caret_custom_3: SwStyle = SwStyle().addClass(cls.caret_custom_3)
  def caret_custom_4: SwStyle = SwStyle().addClass(cls.caret_custom_4)
  def accent_gray_0: SwStyle = SwStyle().addClass(cls.accent_gray_0)
  def accent_gray_1: SwStyle = SwStyle().addClass(cls.accent_gray_1)
  def accent_gray_2: SwStyle = SwStyle().addClass(cls.accent_gray_2)
  def accent_gray_3: SwStyle = SwStyle().addClass(cls.accent_gray_3)
  def accent_gray_4: SwStyle = SwStyle().addClass(cls.accent_gray_4)
  def accent_gray_5: SwStyle = SwStyle().addClass(cls.accent_gray_5)
  def accent_gray_6: SwStyle = SwStyle().addClass(cls.accent_gray_6)
  def accent_gray_7: SwStyle = SwStyle().addClass(cls.accent_gray_7)
  def accent_gray_8: SwStyle = SwStyle().addClass(cls.accent_gray_8)
  def accent_gray_9: SwStyle = SwStyle().addClass(cls.accent_gray_9)
  def accent_danger_1: SwStyle = SwStyle().addClass(cls.accent_danger_1)
  def accent_danger_2: SwStyle = SwStyle().addClass(cls.accent_danger_2)
  def accent_danger_3: SwStyle = SwStyle().addClass(cls.accent_danger_3)
  def accent_danger_4: SwStyle = SwStyle().addClass(cls.accent_danger_4)
  def accent_danger_5: SwStyle = SwStyle().addClass(cls.accent_danger_5)
  def accent_primary_1: SwStyle = SwStyle().addClass(cls.accent_primary_1)
  def accent_primary_2: SwStyle = SwStyle().addClass(cls.accent_primary_2)
  def accent_primary_3: SwStyle = SwStyle().addClass(cls.accent_primary_3)
  def accent_primary_4: SwStyle = SwStyle().addClass(cls.accent_primary_4)
  def accent_primary_5: SwStyle = SwStyle().addClass(cls.accent_primary_5)
  def accent_success_1: SwStyle = SwStyle().addClass(cls.accent_success_1)
  def accent_success_2: SwStyle = SwStyle().addClass(cls.accent_success_2)
  def accent_success_3: SwStyle = SwStyle().addClass(cls.accent_success_3)
  def accent_success_4: SwStyle = SwStyle().addClass(cls.accent_success_4)
  def accent_success_5: SwStyle = SwStyle().addClass(cls.accent_success_5)
  def accent_warning_1: SwStyle = SwStyle().addClass(cls.accent_warning_1)
  def accent_warning_2: SwStyle = SwStyle().addClass(cls.accent_warning_2)
  def accent_warning_3: SwStyle = SwStyle().addClass(cls.accent_warning_3)
  def accent_warning_4: SwStyle = SwStyle().addClass(cls.accent_warning_4)
  def accent_warning_5: SwStyle = SwStyle().addClass(cls.accent_warning_5)
  def accent_transparent: SwStyle = SwStyle().addClass(cls.accent_transparent)
  def accent_current: SwStyle = SwStyle().addClass(cls.accent_current)
  def accent_inherit: SwStyle = SwStyle().addClass(cls.accent_inherit)
  def accent_custom_1: SwStyle = SwStyle().addClass(cls.accent_custom_1)
  def accent_custom_2: SwStyle = SwStyle().addClass(cls.accent_custom_2)
  def accent_custom_3: SwStyle = SwStyle().addClass(cls.accent_custom_3)
  def accent_custom_4: SwStyle = SwStyle().addClass(cls.accent_custom_4)
  def accent_auto: SwStyle = SwStyle().addClass(cls.accent_auto)
  def opacity_0: SwStyle = SwStyle().addClass(cls.opacity_0)
  def opacity_10: SwStyle = SwStyle().addClass(cls.opacity_10)
  def opacity_20: SwStyle = SwStyle().addClass(cls.opacity_20)
  def opacity_30: SwStyle = SwStyle().addClass(cls.opacity_30)
  def opacity_40: SwStyle = SwStyle().addClass(cls.opacity_40)
  def opacity_50: SwStyle = SwStyle().addClass(cls.opacity_50)
  def opacity_60: SwStyle = SwStyle().addClass(cls.opacity_60)
  def opacity_70: SwStyle = SwStyle().addClass(cls.opacity_70)
  def opacity_80: SwStyle = SwStyle().addClass(cls.opacity_80)
  def opacity_90: SwStyle = SwStyle().addClass(cls.opacity_90)
  def opacity_100: SwStyle = SwStyle().addClass(cls.opacity_100)
  def shadow_1: SwStyle = SwStyle().addClass(cls.shadow_1)
  def shadow_2: SwStyle = SwStyle().addClass(cls.shadow_2)
  def shadow_3: SwStyle = SwStyle().addClass(cls.shadow_3)
  def shadow_4: SwStyle = SwStyle().addClass(cls.shadow_4)
  def shadow_gray_0: SwStyle = SwStyle().addClass(cls.shadow_gray_0)
  def shadow_gray_1: SwStyle = SwStyle().addClass(cls.shadow_gray_1)
  def shadow_gray_2: SwStyle = SwStyle().addClass(cls.shadow_gray_2)
  def shadow_gray_3: SwStyle = SwStyle().addClass(cls.shadow_gray_3)
  def shadow_gray_4: SwStyle = SwStyle().addClass(cls.shadow_gray_4)
  def shadow_gray_5: SwStyle = SwStyle().addClass(cls.shadow_gray_5)
  def shadow_gray_6: SwStyle = SwStyle().addClass(cls.shadow_gray_6)
  def shadow_gray_7: SwStyle = SwStyle().addClass(cls.shadow_gray_7)
  def shadow_gray_8: SwStyle = SwStyle().addClass(cls.shadow_gray_8)
  def shadow_gray_9: SwStyle = SwStyle().addClass(cls.shadow_gray_9)
  def shadow_danger_1: SwStyle = SwStyle().addClass(cls.shadow_danger_1)
  def shadow_danger_2: SwStyle = SwStyle().addClass(cls.shadow_danger_2)
  def shadow_danger_3: SwStyle = SwStyle().addClass(cls.shadow_danger_3)
  def shadow_danger_4: SwStyle = SwStyle().addClass(cls.shadow_danger_4)
  def shadow_danger_5: SwStyle = SwStyle().addClass(cls.shadow_danger_5)
  def shadow_primary_1: SwStyle = SwStyle().addClass(cls.shadow_primary_1)
  def shadow_primary_2: SwStyle = SwStyle().addClass(cls.shadow_primary_2)
  def shadow_primary_3: SwStyle = SwStyle().addClass(cls.shadow_primary_3)
  def shadow_primary_4: SwStyle = SwStyle().addClass(cls.shadow_primary_4)
  def shadow_primary_5: SwStyle = SwStyle().addClass(cls.shadow_primary_5)
  def shadow_success_1: SwStyle = SwStyle().addClass(cls.shadow_success_1)
  def shadow_success_2: SwStyle = SwStyle().addClass(cls.shadow_success_2)
  def shadow_success_3: SwStyle = SwStyle().addClass(cls.shadow_success_3)
  def shadow_success_4: SwStyle = SwStyle().addClass(cls.shadow_success_4)
  def shadow_success_5: SwStyle = SwStyle().addClass(cls.shadow_success_5)
  def shadow_warning_1: SwStyle = SwStyle().addClass(cls.shadow_warning_1)
  def shadow_warning_2: SwStyle = SwStyle().addClass(cls.shadow_warning_2)
  def shadow_warning_3: SwStyle = SwStyle().addClass(cls.shadow_warning_3)
  def shadow_warning_4: SwStyle = SwStyle().addClass(cls.shadow_warning_4)
  def shadow_warning_5: SwStyle = SwStyle().addClass(cls.shadow_warning_5)
  def shadow_transparent: SwStyle = SwStyle().addClass(cls.shadow_transparent)
  def shadow_current: SwStyle = SwStyle().addClass(cls.shadow_current)
  def shadow_inherit: SwStyle = SwStyle().addClass(cls.shadow_inherit)
  def shadow_custom_1: SwStyle = SwStyle().addClass(cls.shadow_custom_1)
  def shadow_custom_2: SwStyle = SwStyle().addClass(cls.shadow_custom_2)
  def shadow_custom_3: SwStyle = SwStyle().addClass(cls.shadow_custom_3)
  def shadow_custom_4: SwStyle = SwStyle().addClass(cls.shadow_custom_4)
  def outline_none: SwStyle = SwStyle().addClass(cls.outline_none)
  def outline: SwStyle = SwStyle().addClass(cls.outline)
  def outline_dashed: SwStyle = SwStyle().addClass(cls.outline_dashed)
  def outline_dotted: SwStyle = SwStyle().addClass(cls.outline_dotted)
  def outline_double: SwStyle = SwStyle().addClass(cls.outline_double)
  def outline_0: SwStyle = SwStyle().addClass(cls.outline_0)
  def outline_1: SwStyle = SwStyle().addClass(cls.outline_1)
  def outline_2: SwStyle = SwStyle().addClass(cls.outline_2)
  def outline_4: SwStyle = SwStyle().addClass(cls.outline_4)
  def outline_8: SwStyle = SwStyle().addClass(cls.outline_8)
  def outline_offset_0: SwStyle = SwStyle().addClass(cls.outline_offset_0)
  def outline_offset_1: SwStyle = SwStyle().addClass(cls.outline_offset_1)
  def outline_offset_2: SwStyle = SwStyle().addClass(cls.outline_offset_2)
  def outline_offset_4: SwStyle = SwStyle().addClass(cls.outline_offset_4)
  def outline_offset_8: SwStyle = SwStyle().addClass(cls.outline_offset_8)
  def _outline_offset_0: SwStyle = SwStyle().addClass(cls._outline_offset_0)
  def _outline_offset_1: SwStyle = SwStyle().addClass(cls._outline_offset_1)
  def _outline_offset_2: SwStyle = SwStyle().addClass(cls._outline_offset_2)
  def _outline_offset_4: SwStyle = SwStyle().addClass(cls._outline_offset_4)
  def _outline_offset_8: SwStyle = SwStyle().addClass(cls._outline_offset_8)
  def outline_gray_0: SwStyle = SwStyle().addClass(cls.outline_gray_0)
  def outline_gray_1: SwStyle = SwStyle().addClass(cls.outline_gray_1)
  def outline_gray_2: SwStyle = SwStyle().addClass(cls.outline_gray_2)
  def outline_gray_3: SwStyle = SwStyle().addClass(cls.outline_gray_3)
  def outline_gray_4: SwStyle = SwStyle().addClass(cls.outline_gray_4)
  def outline_gray_5: SwStyle = SwStyle().addClass(cls.outline_gray_5)
  def outline_gray_6: SwStyle = SwStyle().addClass(cls.outline_gray_6)
  def outline_gray_7: SwStyle = SwStyle().addClass(cls.outline_gray_7)
  def outline_gray_8: SwStyle = SwStyle().addClass(cls.outline_gray_8)
  def outline_gray_9: SwStyle = SwStyle().addClass(cls.outline_gray_9)
  def outline_danger_1: SwStyle = SwStyle().addClass(cls.outline_danger_1)
  def outline_danger_2: SwStyle = SwStyle().addClass(cls.outline_danger_2)
  def outline_danger_3: SwStyle = SwStyle().addClass(cls.outline_danger_3)
  def outline_danger_4: SwStyle = SwStyle().addClass(cls.outline_danger_4)
  def outline_danger_5: SwStyle = SwStyle().addClass(cls.outline_danger_5)
  def outline_primary_1: SwStyle = SwStyle().addClass(cls.outline_primary_1)
  def outline_primary_2: SwStyle = SwStyle().addClass(cls.outline_primary_2)
  def outline_primary_3: SwStyle = SwStyle().addClass(cls.outline_primary_3)
  def outline_primary_4: SwStyle = SwStyle().addClass(cls.outline_primary_4)
  def outline_primary_5: SwStyle = SwStyle().addClass(cls.outline_primary_5)
  def outline_success_1: SwStyle = SwStyle().addClass(cls.outline_success_1)
  def outline_success_2: SwStyle = SwStyle().addClass(cls.outline_success_2)
  def outline_success_3: SwStyle = SwStyle().addClass(cls.outline_success_3)
  def outline_success_4: SwStyle = SwStyle().addClass(cls.outline_success_4)
  def outline_success_5: SwStyle = SwStyle().addClass(cls.outline_success_5)
  def outline_warning_1: SwStyle = SwStyle().addClass(cls.outline_warning_1)
  def outline_warning_2: SwStyle = SwStyle().addClass(cls.outline_warning_2)
  def outline_warning_3: SwStyle = SwStyle().addClass(cls.outline_warning_3)
  def outline_warning_4: SwStyle = SwStyle().addClass(cls.outline_warning_4)
  def outline_warning_5: SwStyle = SwStyle().addClass(cls.outline_warning_5)
  def outline_transparent: SwStyle = SwStyle().addClass(cls.outline_transparent)
  def outline_current: SwStyle = SwStyle().addClass(cls.outline_current)
  def outline_inherit: SwStyle = SwStyle().addClass(cls.outline_inherit)
  def outline_custom_1: SwStyle = SwStyle().addClass(cls.outline_custom_1)
  def outline_custom_2: SwStyle = SwStyle().addClass(cls.outline_custom_2)
  def outline_custom_3: SwStyle = SwStyle().addClass(cls.outline_custom_3)
  def outline_custom_4: SwStyle = SwStyle().addClass(cls.outline_custom_4)
  def brightness_0: SwStyle = SwStyle().addClass(cls.brightness_0)
  def brightness_50: SwStyle = SwStyle().addClass(cls.brightness_50)
  def brightness_75: SwStyle = SwStyle().addClass(cls.brightness_75)
  def brightness_90: SwStyle = SwStyle().addClass(cls.brightness_90)
  def brightness_95: SwStyle = SwStyle().addClass(cls.brightness_95)
  def brightness_100: SwStyle = SwStyle().addClass(cls.brightness_100)
  def brightness_105: SwStyle = SwStyle().addClass(cls.brightness_105)
  def brightness_110: SwStyle = SwStyle().addClass(cls.brightness_110)
  def brightness_125: SwStyle = SwStyle().addClass(cls.brightness_125)
  def brightness_150: SwStyle = SwStyle().addClass(cls.brightness_150)
  def brightness_200: SwStyle = SwStyle().addClass(cls.brightness_200)
  def ease_linear: SwStyle = SwStyle().addClass(cls.ease_linear)
  def ease_in: SwStyle = SwStyle().addClass(cls.ease_in)
  def ease_out: SwStyle = SwStyle().addClass(cls.ease_out)
  def ease_in_out: SwStyle = SwStyle().addClass(cls.ease_in_out)
  def will_change_auto: SwStyle = SwStyle().addClass(cls.will_change_auto)
  def will_change_scroll: SwStyle = SwStyle().addClass(cls.will_change_scroll)
  def will_change_contents: SwStyle = SwStyle().addClass(cls.will_change_contents)
  def will_change_transform: SwStyle = SwStyle().addClass(cls.will_change_transform)
  def contain_none: SwStyle = SwStyle().addClass(cls.contain_none)
  def contain_content: SwStyle = SwStyle().addClass(cls.contain_content)
  def contain_strict: SwStyle = SwStyle().addClass(cls.contain_strict)
  def contain_size: SwStyle = SwStyle().addClass(cls.contain_size)
  def contain_inline_size: SwStyle = SwStyle().addClass(cls.contain_inline_size)
  def contain_layout: SwStyle = SwStyle().addClass(cls.contain_layout)
  def contain_paint: SwStyle = SwStyle().addClass(cls.contain_paint)
  def contain_style: SwStyle = SwStyle().addClass(cls.contain_style)
  def content_none: SwStyle = SwStyle().addClass(cls.content_none)
  def forced_color_adjust_auto: SwStyle = SwStyle().addClass(cls.forced_color_adjust_auto)
  def forced_color_adjust_none: SwStyle = SwStyle().addClass(cls.forced_color_adjust_none)

  def first_letter(styles: SwStyle): SwStyle = SwStyle().first_letter(styles)
  def first_line(styles: SwStyle): SwStyle = SwStyle().first_line(styles)
  def marker(styles: SwStyle): SwStyle = SwStyle().marker(styles)
  def selection(styles: SwStyle): SwStyle = SwStyle().selection(styles)
  def file(styles: SwStyle): SwStyle = SwStyle().file(styles)
  def placeholder(styles: SwStyle): SwStyle = SwStyle().placeholder(styles)
  def backdrop(styles: SwStyle): SwStyle = SwStyle().backdrop(styles)
  def before(styles: SwStyle): SwStyle = SwStyle().before(styles)
  def after(styles: SwStyle): SwStyle = SwStyle().after(styles)
  def first(styles: SwStyle): SwStyle = SwStyle().first(styles)
  def last(styles: SwStyle): SwStyle = SwStyle().last(styles)
  def only(styles: SwStyle): SwStyle = SwStyle().only(styles)
  def odd(styles: SwStyle): SwStyle = SwStyle().odd(styles)
  def even(styles: SwStyle): SwStyle = SwStyle().even(styles)
  def first_of_type(styles: SwStyle): SwStyle = SwStyle().first_of_type(styles)
  def last_of_type(styles: SwStyle): SwStyle = SwStyle().last_of_type(styles)
  def only_of_type(styles: SwStyle): SwStyle = SwStyle().only_of_type(styles)
  def visited(styles: SwStyle): SwStyle = SwStyle().visited(styles)
  def target(styles: SwStyle): SwStyle = SwStyle().target(styles)
  def open(styles: SwStyle): SwStyle = SwStyle().open(styles)
  def default(styles: SwStyle): SwStyle = SwStyle().default(styles)
  def checked(styles: SwStyle): SwStyle = SwStyle().checked(styles)
  def indeterminate(styles: SwStyle): SwStyle = SwStyle().indeterminate(styles)
  def placeholder_shown(styles: SwStyle): SwStyle = SwStyle().placeholder_shown(styles)
  def autofill(styles: SwStyle): SwStyle = SwStyle().autofill(styles)
  def optional(styles: SwStyle): SwStyle = SwStyle().optional(styles)
  def required(styles: SwStyle): SwStyle = SwStyle().required(styles)
  def valid(styles: SwStyle): SwStyle = SwStyle().valid(styles)
  def invalid(styles: SwStyle): SwStyle = SwStyle().invalid(styles)
  def in_range(styles: SwStyle): SwStyle = SwStyle().in_range(styles)
  def out_of_range(styles: SwStyle): SwStyle = SwStyle().out_of_range(styles)
  def read_only(styles: SwStyle): SwStyle = SwStyle().read_only(styles)
  def empty(styles: SwStyle): SwStyle = SwStyle().empty(styles)
  def focus_within(styles: SwStyle): SwStyle = SwStyle().focus_within(styles)
  def hover(styles: SwStyle): SwStyle = SwStyle().hover(styles)
  def focus(styles: SwStyle): SwStyle = SwStyle().focus(styles)
  def focus_visible(styles: SwStyle): SwStyle = SwStyle().focus_visible(styles)
  def active(styles: SwStyle): SwStyle = SwStyle().active(styles)
  def enabled(styles: SwStyle): SwStyle = SwStyle().enabled(styles)
  def disabled(styles: SwStyle): SwStyle = SwStyle().disabled(styles)
  def group_first(styles: SwStyle): SwStyle = SwStyle().group_first(styles)
  def group_last(styles: SwStyle): SwStyle = SwStyle().group_last(styles)
  def group_only(styles: SwStyle): SwStyle = SwStyle().group_only(styles)
  def group_odd(styles: SwStyle): SwStyle = SwStyle().group_odd(styles)
  def group_even(styles: SwStyle): SwStyle = SwStyle().group_even(styles)
  def group_first_of_type(styles: SwStyle): SwStyle = SwStyle().group_first_of_type(styles)
  def group_last_of_type(styles: SwStyle): SwStyle = SwStyle().group_last_of_type(styles)
  def group_only_of_type(styles: SwStyle): SwStyle = SwStyle().group_only_of_type(styles)
  def group_visited(styles: SwStyle): SwStyle = SwStyle().group_visited(styles)
  def group_target(styles: SwStyle): SwStyle = SwStyle().group_target(styles)
  def group_open(styles: SwStyle): SwStyle = SwStyle().group_open(styles)
  def group_default(styles: SwStyle): SwStyle = SwStyle().group_default(styles)
  def group_checked(styles: SwStyle): SwStyle = SwStyle().group_checked(styles)
  def group_indeterminate(styles: SwStyle): SwStyle = SwStyle().group_indeterminate(styles)
  def group_placeholder_shown(styles: SwStyle): SwStyle = SwStyle().group_placeholder_shown(styles)
  def group_autofill(styles: SwStyle): SwStyle = SwStyle().group_autofill(styles)
  def group_optional(styles: SwStyle): SwStyle = SwStyle().group_optional(styles)
  def group_required(styles: SwStyle): SwStyle = SwStyle().group_required(styles)
  def group_valid(styles: SwStyle): SwStyle = SwStyle().group_valid(styles)
  def group_invalid(styles: SwStyle): SwStyle = SwStyle().group_invalid(styles)
  def group_in_range(styles: SwStyle): SwStyle = SwStyle().group_in_range(styles)
  def group_out_of_range(styles: SwStyle): SwStyle = SwStyle().group_out_of_range(styles)
  def group_read_only(styles: SwStyle): SwStyle = SwStyle().group_read_only(styles)
  def group_empty(styles: SwStyle): SwStyle = SwStyle().group_empty(styles)
  def group_focus_within(styles: SwStyle): SwStyle = SwStyle().group_focus_within(styles)
  def group_hover(styles: SwStyle): SwStyle = SwStyle().group_hover(styles)
  def group_focus(styles: SwStyle): SwStyle = SwStyle().group_focus(styles)
  def group_focus_visible(styles: SwStyle): SwStyle = SwStyle().group_focus_visible(styles)
  def group_active(styles: SwStyle): SwStyle = SwStyle().group_active(styles)
  def group_enabled(styles: SwStyle): SwStyle = SwStyle().group_enabled(styles)
  def group_disabled(styles: SwStyle): SwStyle = SwStyle().group_disabled(styles)
  def group(styles: SwStyle): SwStyle = SwStyle().group(styles)
  def peer_first(styles: SwStyle): SwStyle = SwStyle().peer_first(styles)
  def peer_last(styles: SwStyle): SwStyle = SwStyle().peer_last(styles)
  def peer_only(styles: SwStyle): SwStyle = SwStyle().peer_only(styles)
  def peer_odd(styles: SwStyle): SwStyle = SwStyle().peer_odd(styles)
  def peer_even(styles: SwStyle): SwStyle = SwStyle().peer_even(styles)
  def peer_first_of_type(styles: SwStyle): SwStyle = SwStyle().peer_first_of_type(styles)
  def peer_last_of_type(styles: SwStyle): SwStyle = SwStyle().peer_last_of_type(styles)
  def peer_only_of_type(styles: SwStyle): SwStyle = SwStyle().peer_only_of_type(styles)
  def peer_visited(styles: SwStyle): SwStyle = SwStyle().peer_visited(styles)
  def peer_target(styles: SwStyle): SwStyle = SwStyle().peer_target(styles)
  def peer_open(styles: SwStyle): SwStyle = SwStyle().peer_open(styles)
  def peer_default(styles: SwStyle): SwStyle = SwStyle().peer_default(styles)
  def peer_checked(styles: SwStyle): SwStyle = SwStyle().peer_checked(styles)
  def peer_indeterminate(styles: SwStyle): SwStyle = SwStyle().peer_indeterminate(styles)
  def peer_placeholder_shown(styles: SwStyle): SwStyle = SwStyle().peer_placeholder_shown(styles)
  def peer_autofill(styles: SwStyle): SwStyle = SwStyle().peer_autofill(styles)
  def peer_optional(styles: SwStyle): SwStyle = SwStyle().peer_optional(styles)
  def peer_required(styles: SwStyle): SwStyle = SwStyle().peer_required(styles)
  def peer_valid(styles: SwStyle): SwStyle = SwStyle().peer_valid(styles)
  def peer_invalid(styles: SwStyle): SwStyle = SwStyle().peer_invalid(styles)
  def peer_in_range(styles: SwStyle): SwStyle = SwStyle().peer_in_range(styles)
  def peer_out_of_range(styles: SwStyle): SwStyle = SwStyle().peer_out_of_range(styles)
  def peer_read_only(styles: SwStyle): SwStyle = SwStyle().peer_read_only(styles)
  def peer_empty(styles: SwStyle): SwStyle = SwStyle().peer_empty(styles)
  def peer_focus_within(styles: SwStyle): SwStyle = SwStyle().peer_focus_within(styles)
  def peer_hover(styles: SwStyle): SwStyle = SwStyle().peer_hover(styles)
  def peer_focus(styles: SwStyle): SwStyle = SwStyle().peer_focus(styles)
  def peer_focus_visible(styles: SwStyle): SwStyle = SwStyle().peer_focus_visible(styles)
  def peer_active(styles: SwStyle): SwStyle = SwStyle().peer_active(styles)
  def peer_enabled(styles: SwStyle): SwStyle = SwStyle().peer_enabled(styles)
  def peer_disabled(styles: SwStyle): SwStyle = SwStyle().peer_disabled(styles)
  def peer(styles: SwStyle): SwStyle = SwStyle().peer(styles)
  def has(styles: SwStyle): SwStyle = SwStyle().has(styles)
  def group_has(styles: SwStyle): SwStyle = SwStyle().group_has(styles)
  def peer_has(styles: SwStyle): SwStyle = SwStyle().peer_has(styles)
  def aria_busy(styles: SwStyle): SwStyle = SwStyle().aria_busy(styles)
  def aria_checked(styles: SwStyle): SwStyle = SwStyle().aria_checked(styles)
  def aria_disabled(styles: SwStyle): SwStyle = SwStyle().aria_disabled(styles)
  def aria_expanded(styles: SwStyle): SwStyle = SwStyle().aria_expanded(styles)
  def aria_hidden(styles: SwStyle): SwStyle = SwStyle().aria_hidden(styles)
  def aria_pressed(styles: SwStyle): SwStyle = SwStyle().aria_pressed(styles)
  def aria_readonly(styles: SwStyle): SwStyle = SwStyle().aria_readonly(styles)
  def aria_required(styles: SwStyle): SwStyle = SwStyle().aria_required(styles)
  def aria_selected(styles: SwStyle): SwStyle = SwStyle().aria_selected(styles)
  def aria(styles: SwStyle): SwStyle = SwStyle().aria(styles)
  def group_aria_busy(styles: SwStyle): SwStyle = SwStyle().group_aria_busy(styles)
  def group_aria_checked(styles: SwStyle): SwStyle = SwStyle().group_aria_checked(styles)
  def group_aria_disabled(styles: SwStyle): SwStyle = SwStyle().group_aria_disabled(styles)
  def group_aria_expanded(styles: SwStyle): SwStyle = SwStyle().group_aria_expanded(styles)
  def group_aria_hidden(styles: SwStyle): SwStyle = SwStyle().group_aria_hidden(styles)
  def group_aria_pressed(styles: SwStyle): SwStyle = SwStyle().group_aria_pressed(styles)
  def group_aria_readonly(styles: SwStyle): SwStyle = SwStyle().group_aria_readonly(styles)
  def group_aria_required(styles: SwStyle): SwStyle = SwStyle().group_aria_required(styles)
  def group_aria_selected(styles: SwStyle): SwStyle = SwStyle().group_aria_selected(styles)
  def group_aria(styles: SwStyle): SwStyle = SwStyle().group_aria(styles)
  def peer_aria_busy(styles: SwStyle): SwStyle = SwStyle().peer_aria_busy(styles)
  def peer_aria_checked(styles: SwStyle): SwStyle = SwStyle().peer_aria_checked(styles)
  def peer_aria_disabled(styles: SwStyle): SwStyle = SwStyle().peer_aria_disabled(styles)
  def peer_aria_expanded(styles: SwStyle): SwStyle = SwStyle().peer_aria_expanded(styles)
  def peer_aria_hidden(styles: SwStyle): SwStyle = SwStyle().peer_aria_hidden(styles)
  def peer_aria_pressed(styles: SwStyle): SwStyle = SwStyle().peer_aria_pressed(styles)
  def peer_aria_readonly(styles: SwStyle): SwStyle = SwStyle().peer_aria_readonly(styles)
  def peer_aria_required(styles: SwStyle): SwStyle = SwStyle().peer_aria_required(styles)
  def peer_aria_selected(styles: SwStyle): SwStyle = SwStyle().peer_aria_selected(styles)
  def peer_aria(styles: SwStyle): SwStyle = SwStyle().peer_aria(styles)
  def data(styles: SwStyle): SwStyle = SwStyle().data(styles)
  def group_data(styles: SwStyle): SwStyle = SwStyle().group_data(styles)
  def peer_data(styles: SwStyle): SwStyle = SwStyle().peer_data(styles)
  def supports(styles: SwStyle): SwStyle = SwStyle().supports(styles)
  def motion_safe(styles: SwStyle): SwStyle = SwStyle().motion_safe(styles)
  def motion_reduce(styles: SwStyle): SwStyle = SwStyle().motion_reduce(styles)
  def contrast_more(styles: SwStyle): SwStyle = SwStyle().contrast_more(styles)
  def contrast_less(styles: SwStyle): SwStyle = SwStyle().contrast_less(styles)
  def max_sm(styles: SwStyle): SwStyle = SwStyle().max_sm(styles)
  def max_md(styles: SwStyle): SwStyle = SwStyle().max_md(styles)
  def max_lg(styles: SwStyle): SwStyle = SwStyle().max_lg(styles)
  def max_xl(styles: SwStyle): SwStyle = SwStyle().max_xl(styles)
  def max(styles: SwStyle): SwStyle = SwStyle().max(styles)
  def sm(styles: SwStyle): SwStyle = SwStyle().sm(styles)
  def md(styles: SwStyle): SwStyle = SwStyle().md(styles)
  def lg(styles: SwStyle): SwStyle = SwStyle().lg(styles)
  def xl(styles: SwStyle): SwStyle = SwStyle().xl(styles)
  def min(styles: SwStyle): SwStyle = SwStyle().min(styles)
  def portrait(styles: SwStyle): SwStyle = SwStyle().portrait(styles)
  def landscape(styles: SwStyle): SwStyle = SwStyle().landscape(styles)
  def ltr(styles: SwStyle): SwStyle = SwStyle().ltr(styles)
  def rtl(styles: SwStyle): SwStyle = SwStyle().rtl(styles)
  def dark(styles: SwStyle): SwStyle = SwStyle().dark(styles)
  def forced_colors(styles: SwStyle): SwStyle = SwStyle().forced_colors(styles)
  def print(styles: SwStyle): SwStyle = SwStyle().print(styles)
  def important(styles: SwStyle): SwStyle = SwStyle().important(styles)
}

inline def sw(inline styles: SwStyle): String =
  ${ swImpl('styles) }

private def swImpl(stylesExpr: Expr[SwStyle])(using Quotes): Expr[String] = {
  import quotes.reflect.*

  def extractClassNames(term: Term): List[String] = term match {
    case Apply(Select(inner, "first_letter"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first_letter:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "first_line"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first_line:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "marker"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"marker:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "selection"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"selection:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "file"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"file:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "placeholder"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"placeholder:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "backdrop"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"backdrop:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "before"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"before:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "after"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"after:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "first"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "last"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"last:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "odd"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"odd:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "even"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"even:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "first_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"first_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "last_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"last_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "only_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"only_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "visited"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"visited:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "target"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"target:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "open"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"open:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "default"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"default:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "indeterminate"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"indeterminate:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "placeholder_shown"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"placeholder_shown:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "autofill"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"autofill:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "optional"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"optional:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "valid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"valid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "invalid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"invalid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "in_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"in_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "out_of_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"out_of_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "read_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"read_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "empty"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"empty:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "focus_within"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"focus_within:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"hover:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "focus"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"focus:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "focus_visible"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"focus_visible:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "active"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"active:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "enabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"enabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_first"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_first:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_last"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_last:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_odd"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_odd:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_even"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_even:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_first_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_first_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_last_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_last_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_only_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_only_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_visited"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_visited:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_target"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_target:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_open"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_open:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_default"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_default:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_indeterminate"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_indeterminate:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_placeholder_shown"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_placeholder_shown:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_autofill"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_autofill:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_optional"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_optional:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_valid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_valid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_invalid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_invalid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_in_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_in_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_out_of_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_out_of_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_read_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_read_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_empty"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_empty:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_focus_within"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_focus_within:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_hover:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_focus"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_focus:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_focus_visible"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_focus_visible:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_active"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_active:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_enabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_enabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_first"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_first:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_last"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_last:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_odd"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_odd:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_even"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_even:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_first_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_first_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_last_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_last_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_only_of_type"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_only_of_type:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_visited"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_visited:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_target"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_target:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_open"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_open:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_default"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_default:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_indeterminate"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_indeterminate:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_placeholder_shown"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_placeholder_shown:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_autofill"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_autofill:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_optional"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_optional:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_valid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_valid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_invalid"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_invalid:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_in_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_in_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_out_of_range"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_out_of_range:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_read_only"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_read_only:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_empty"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_empty:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_focus_within"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_focus_within:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_hover"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_hover:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_focus"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_focus:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_focus_visible"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_focus_visible:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_active"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_active:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_enabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_enabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "has"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"has:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_has"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_has:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_has"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_has:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_busy"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_busy:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_expanded"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_expanded:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_hidden"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_hidden:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_pressed"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_pressed:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_readonly"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_readonly:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria_selected"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria_selected:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "aria"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"aria:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_busy"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_busy:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_expanded"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_expanded:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_hidden"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_hidden:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_pressed"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_pressed:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_readonly"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_readonly:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria_selected"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria_selected:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_aria"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_aria:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_busy"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_busy:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_checked"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_checked:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_disabled"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_disabled:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_expanded"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_expanded:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_hidden"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_hidden:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_pressed"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_pressed:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_readonly"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_readonly:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_required"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_required:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria_selected"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria_selected:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_aria"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_aria:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "data"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"data:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "group_data"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"group_data:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "peer_data"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"peer_data:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "supports"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"supports:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "motion_safe"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"motion_safe:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "motion_reduce"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"motion_reduce:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "contrast_more"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"contrast_more:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "contrast_less"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"contrast_less:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_sm"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_sm:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_md"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_md:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_lg"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_lg:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max_xl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max_xl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "max"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"max:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "sm"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"sm:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "md"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"md:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "lg"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"lg:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "xl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"xl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "min"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"min:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "portrait"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"portrait:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "landscape"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"landscape:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "ltr"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"ltr:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "rtl"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"rtl:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "dark"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"dark:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "forced_colors"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"forced_colors:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "print"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"print:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Select(inner, "important"), List(styles)) =>
      val classes = extractClassNames(styles).map(cls => s"important:$cls")
      extractClassNames(inner) ++ classes
    case Apply(Ident(name), List(inner)) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Inlined(_, _, inner) =>
      extractClassNames(inner)
    case Select(inner, name) =>
      extractClassNames(inner) :+ name.replace("_", "-")
    case Ident("tw") =>
      Nil
    case _ =>
      report.errorAndAbort(s"Unexpected term: $term")
  }

  val term = stylesExpr.asTerm
  val classNames = extractClassNames(term)
  val combinedClasses = classNames.mkString(" ")
  report.info(s"Compiled: $combinedClasses")
  Expr(combinedClasses)
}

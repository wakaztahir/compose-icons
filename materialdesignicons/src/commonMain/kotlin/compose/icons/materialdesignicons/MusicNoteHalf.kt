package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MusicNoteHalf: ImageVector
    get() {
        if (_musicNoteHalf != null) {
            return _musicNoteHalf!!
        }
        _musicNoteHalf = Builder(name = "MusicNoteHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.56f)
                arcTo(3.96f, 3.96f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 16.0f, 17.0f)
                verticalLineTo(3.0f)
                moveTo(12.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 14.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _musicNoteHalf!!
    }

private var _musicNoteHalf: ImageVector? = null
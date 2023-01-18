package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ShareLine: ImageVector
    get() {
        if (_shareLine != null) {
            return _shareLine!!
        }
        _shareLine = Builder(name = "ShareLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.12f, 17.023f)
                lineToRelative(-4.199f, -2.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -5.465f)
                lineToRelative(4.2f, -2.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.959f, 1.755f)
                lineToRelative(-4.2f, 2.29f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, true, 0.0f, 1.954f)
                lineToRelative(4.199f, 2.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.959f, 1.755f)
                close()
                moveTo(6.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(17.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(17.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shareLine!!
    }

private var _shareLine: ImageVector? = null
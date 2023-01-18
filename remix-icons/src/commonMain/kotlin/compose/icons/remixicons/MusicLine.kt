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

public val RemixIcons.MusicLine: ImageVector
    get() {
        if (_musicLine != null) {
            return _musicLine!!
        }
        _musicLine = Builder(name = "MusicLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.535f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.0f, -3.465f)
                close()
                moveTo(10.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _musicLine!!
    }

private var _musicLine: ImageVector? = null
package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WbShade: ImageVector
    get() {
        if (_wbShade != null) {
            return _wbShade!!
        }
        _wbShade = Builder(name = "WbShade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(5.5f, 5.5f)
                lineTo(22.0f, 20.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(8.0f, 4.0f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(8.0f)
                lineTo(12.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _wbShade!!
    }

private var _wbShade: ImageVector? = null
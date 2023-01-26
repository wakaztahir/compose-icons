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

public val BaselineGroup.Screenshot: ImageVector
    get() {
        if (_screenshot != null) {
            return _screenshot!!
        }
        _screenshot = Builder(name = "Screenshot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.01f)
                lineTo(7.0f, 1.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.1f, 1.01f, 17.0f, 1.01f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.5f, 8.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _screenshot!!
    }

private var _screenshot: ImageVector? = null

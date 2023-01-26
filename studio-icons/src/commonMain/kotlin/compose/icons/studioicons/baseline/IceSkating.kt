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

public val BaselineGroup.IceSkating: ImageVector
    get() {
        if (_iceSkating != null) {
            return _iceSkating!!
        }
        _iceSkating = Builder(name = "IceSkating", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f)
                horizontalLineToRelative(2.52f)
                lineTo(11.0f, 7.0f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 7.0f, 8.0f, 6.78f, 8.0f, 6.5f)
                curveTo(8.0f, 6.22f, 8.22f, 6.0f, 8.5f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.0f, -2.88f)
                curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f)
                lineToRelative(-2.7f, -0.67f)
                curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9.0f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 9.0f, 8.0f, 8.78f, 8.0f, 8.5f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _iceSkating!!
    }

private var _iceSkating: ImageVector? = null
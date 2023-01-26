package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(4.66f)
                lineToRelative(-3.5f, 3.51f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.83f)
                lineTo(8.0f, 13.65f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(8.0f)
                moveToRelative(0.0f, -6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-0.01f)
                curveTo(6.9f, 6.99f, 6.0f, 7.89f, 6.0f, 8.98f)
                verticalLineToRelative(5.52f)
                lineTo(9.5f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(3.5f, -3.51f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null

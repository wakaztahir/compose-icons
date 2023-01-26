package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(17.0f, 3.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-3.15f, -0.66f)
                curveToRelative(-0.01f, 0.0f, -0.01f, 0.01f, -0.02f, 0.02f)
                curveToRelative(1.55f, 0.62f, 2.72f, 1.98f, 3.07f, 3.64f)
                horizontalLineTo(7.1f)
                curveToRelative(0.34f, -1.66f, 1.52f, -3.02f, 3.07f, -3.64f)
                curveToRelative(-0.33f, -0.26f, -0.6f, -0.58f, -0.8f, -0.95f)
                lineTo(5.0f, 6.5f)
                verticalLineToRelative(-1.0f)
                lineToRelative(4.37f, -0.91f)
                curveTo(9.87f, 3.65f, 10.86f, 3.0f, 12.0f, 3.0f)
                curveToRelative(0.7f, 0.0f, 1.34f, 0.25f, 1.85f, 0.66f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(-0.03f, -0.59f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveTo(13.0f, 6.55f, 13.0f, 6.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null

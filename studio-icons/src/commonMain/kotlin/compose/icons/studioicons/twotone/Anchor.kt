package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                lineToRelative(1.55f, 1.55f)
                curveToRelative(-0.96f, 1.69f, -3.33f, 3.04f, -5.55f, 3.37f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(7.82f)
                curveTo(14.16f, 7.4f, 15.0f, 6.3f, 15.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 3.35f, 9.0f, 5.0f)
                curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.92f)
                curveToRelative(-2.22f, -0.33f, -4.59f, -1.68f, -5.55f, -3.37f)
                lineTo(7.0f, 15.0f)
                lineToRelative(-4.0f, -3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.88f, 4.92f, 7.0f, 9.0f, 7.0f)
                reflectiveCurveToRelative(9.0f, -3.12f, 9.0f, -7.0f)
                verticalLineToRelative(-3.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveTo(11.45f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
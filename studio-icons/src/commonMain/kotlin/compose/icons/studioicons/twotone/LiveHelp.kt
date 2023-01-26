package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.LiveHelp: ImageVector
    get() {
        if (_liveHelp != null) {
            return _liveHelp!!
        }
        _liveHelp = Builder(name = "LiveHelp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(4.83f)
                lineToRelative(0.59f, 0.59f)
                lineTo(12.0f, 20.17f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(0.58f, -0.58f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                lineTo(8.0f, 9.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-0.59f, 0.59f)
                lineTo(12.0f, 20.17f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-0.58f, -0.58f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(8.0f, 6.79f, 8.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _liveHelp!!
    }

private var _liveHelp: ImageVector? = null

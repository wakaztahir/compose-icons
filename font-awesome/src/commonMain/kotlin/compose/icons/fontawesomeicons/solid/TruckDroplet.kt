package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.TruckDroplet: ImageVector
    get() {
        if (_truckDroplet != null) {
            return _truckDroplet!!
        }
        _truckDroplet = Builder(name = "TruckDroplet", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 48.0f)
                curveTo(0.0f, 21.5f, 21.5f, 0.0f, 48.0f, 0.0f)
                lineTo(368.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineTo(416.0f, 96.0f)
                horizontalLineToRelative(50.7f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(589.3f, 192.0f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(608.0f, 256.0f)
                verticalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(576.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(256.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(48.0f, 416.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 48.0f)
                close()
                moveTo(416.0f, 256.0f)
                lineTo(544.0f, 256.0f)
                lineTo(544.0f, 237.3f)
                lineTo(466.7f, 160.0f)
                lineTo(416.0f, 160.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(160.0f, 464.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(528.0f, 416.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                close()
                moveTo(208.0f, 272.0f)
                curveToRelative(39.8f, 0.0f, 72.0f, -29.6f, 72.0f, -66.0f)
                curveToRelative(0.0f, -27.0f, -39.4f, -82.9f, -59.9f, -110.3f)
                curveToRelative(-6.1f, -8.2f, -18.1f, -8.2f, -24.2f, 0.0f)
                curveTo(175.4f, 123.0f, 136.0f, 179.0f, 136.0f, 206.0f)
                curveToRelative(0.0f, 36.5f, 32.2f, 66.0f, 72.0f, 66.0f)
                close()
            }
        }
        .build()
        return _truckDroplet!!
    }

private var _truckDroplet: ImageVector? = null

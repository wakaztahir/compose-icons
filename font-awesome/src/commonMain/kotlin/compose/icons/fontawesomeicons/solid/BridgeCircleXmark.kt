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

public val SolidGroup.BridgeCircleXmark: ImageVector
    get() {
        if (_bridgeCircleXmark != null) {
            return _bridgeCircleXmark!!
        }
        _bridgeCircleXmark = Builder(name = "BridgeCircleXmark", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(46.3f, 32.0f, 32.0f, 46.3f, 32.0f, 64.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(64.0f)
                lineTo(32.0f, 160.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(224.0f, 384.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                curveToRelative(6.3f, 0.0f, 12.4f, 0.6f, 18.3f, 1.7f)
                curveTo(367.1f, 231.8f, 426.9f, 192.0f, 496.0f, 192.0f)
                curveToRelative(42.5f, 0.0f, 81.6f, 15.1f, 112.0f, 40.2f)
                lineTo(608.0f, 160.0f)
                lineTo(536.0f, 160.0f)
                lineTo(536.0f, 96.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(488.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(408.0f, 160.0f)
                lineTo(408.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(360.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(280.0f, 160.0f)
                lineTo(280.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(232.0f, 96.0f)
                verticalLineToRelative(64.0f)
                lineTo(152.0f, 160.0f)
                lineTo(152.0f, 96.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(496.0f, 512.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveToRelative(-64.5f, -144.0f, -144.0f, -144.0f)
                reflectiveCurveToRelative(-144.0f, 64.5f, -144.0f, 144.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                close()
                moveTo(555.3f, 331.3f)
                lineTo(518.6f, 368.0f)
                lineToRelative(36.7f, 36.7f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineTo(496.0f, 390.6f)
                lineToRelative(-36.7f, 36.7f)
                curveToRelative(-6.2f, 6.2f, -16.4f, 6.2f, -22.6f, 0.0f)
                reflectiveCurveToRelative(-6.2f, -16.4f, 0.0f, -22.6f)
                lineTo(473.4f, 368.0f)
                lineToRelative(-36.7f, -36.7f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineTo(496.0f, 345.4f)
                lineToRelative(36.7f, -36.7f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                close()
            }
        }
        .build()
        return _bridgeCircleXmark!!
    }

private var _bridgeCircleXmark: ImageVector? = null

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

public val SolidGroup.IdCard: ImageVector
    get() {
        if (_idCard != null) {
            return _idCard!!
        }
        _idCard = Builder(name = "IdCard", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                lineToRelative(576.0f, 0.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                close()
                moveTo(0.0f, 128.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(512.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(576.0f, 128.0f)
                lineTo(0.0f, 128.0f)
                close()
                moveTo(64.0f, 405.3f)
                curveToRelative(0.0f, -29.5f, 23.9f, -53.3f, 53.3f, -53.3f)
                lineTo(234.7f, 352.0f)
                curveToRelative(29.5f, 0.0f, 53.3f, 23.9f, 53.3f, 53.3f)
                curveToRelative(0.0f, 5.9f, -4.8f, 10.7f, -10.7f, 10.7f)
                lineTo(74.7f, 416.0f)
                curveToRelative(-5.9f, 0.0f, -10.7f, -4.8f, -10.7f, -10.7f)
                close()
                moveTo(176.0f, 320.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(352.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(496.0f, 192.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(368.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(352.0f, 272.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(496.0f, 256.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(368.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(352.0f, 336.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(496.0f, 320.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(368.0f, 352.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _idCard!!
    }

private var _idCard: ImageVector? = null

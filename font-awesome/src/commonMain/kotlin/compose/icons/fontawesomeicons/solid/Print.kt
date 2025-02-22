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

public val SolidGroup.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 0.0f)
                curveTo(92.7f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                lineTo(128.0f, 64.0f)
                lineTo(354.7f, 64.0f)
                lineTo(384.0f, 93.3f)
                lineTo(384.0f, 160.0f)
                horizontalLineToRelative(64.0f)
                lineTo(448.0f, 93.3f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(400.0f, 18.7f)
                curveTo(388.0f, 6.7f, 371.7f, 0.0f, 354.7f, 0.0f)
                lineTo(128.0f, 0.0f)
                close()
                moveTo(384.0f, 352.0f)
                verticalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                lineTo(128.0f, 448.0f)
                lineTo(128.0f, 384.0f)
                lineTo(128.0f, 368.0f)
                lineTo(128.0f, 352.0f)
                lineTo(384.0f, 352.0f)
                close()
                moveTo(448.0f, 384.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(512.0f, 256.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 192.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(64.0f, 384.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 384.0f)
                close()
                moveTo(432.0f, 296.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null

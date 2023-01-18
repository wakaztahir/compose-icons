package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TruckLine: ImageVector
    get() {
        if (_truckLine != null) {
            return _truckLine!!
        }
        _truckLine = Builder(name = "TruckLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.965f, 18.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.93f, 0.0f)
                lineTo(1.0f, 18.0f)
                lineTo(1.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(3.0f, 4.056f)
                lineTo(23.0f, 18.0f)
                horizontalLineToRelative(-2.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.93f, 0.0f)
                horizontalLineToRelative(-5.07f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(8.05f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 5.663f, 0.95f)
                horizontalLineToRelative(5.674f)
                curveToRelative(0.168f, -0.353f, 0.393f, -0.674f, 0.663f, -0.95f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.285f)
                lineTo(18.992f, 10.0f)
                lineTo(17.0f, 10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.5f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.001f)
                close()
                moveTo(7.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _truckLine!!
    }

private var _truckLine: ImageVector? = null
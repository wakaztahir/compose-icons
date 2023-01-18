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

public val RemixIcons.PoliceCarLine: ImageVector
    get() {
        if (_policeCarLine != null) {
            return _policeCarLine!!
        }
        _policeCarLine = Builder(name = "PoliceCarLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(5.618f, 11.0f)
                horizontalLineToRelative(12.764f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -1.447f)
                lineTo(18.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                lineTo(4.724f, 9.553f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.618f, 11.0f)
                close()
                moveTo(22.0f, 13.5f)
                lineTo(22.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-1.243f, -0.31f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 12.22f)
                verticalLineToRelative(-0.72f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                lineTo(2.0f, 11.0f)
                lineToRelative(2.447f, -4.894f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.237f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.764f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.789f, 1.106f)
                lineTo(22.0f, 11.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.757f, 0.97f)
                lineTo(22.0f, 13.5f)
                close()
                moveTo(5.0f, 14.0f)
                curveToRelative(2.317f, 0.0f, 3.879f, 0.755f, 4.686f, 2.264f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.441f, 0.736f)
                lineTo(6.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.245f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.44f, -0.736f)
                curveTo(15.12f, 14.754f, 16.682f, 14.0f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _policeCarLine!!
    }

private var _policeCarLine: ImageVector? = null
package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Biotech: ImageVector
    get() {
        if (_biotech != null) {
            return _biotech!!
        }
        _biotech = Builder(name = "Biotech", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.09f, 0.59f, -2.04f, 1.46f, -2.56f)
                curveTo(8.17f, 9.03f, 8.0f, 8.54f, 8.0f, 8.0f)
                curveToRelative(0.0f, -0.21f, 0.04f, -0.42f, 0.09f, -0.62f)
                curveTo(6.28f, 8.13f, 5.0f, 9.92f, 5.0f, 12.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.56f, 5.51f)
                curveTo(11.91f, 5.54f, 13.0f, 6.64f, 13.0f, 8.0f)
                curveToRelative(0.0f, 0.75f, -0.33f, 1.41f, -0.85f, 1.87f)
                lineToRelative(0.59f, 1.62f)
                lineToRelative(0.94f, -0.34f)
                lineToRelative(0.34f, 0.94f)
                lineToRelative(1.88f, -0.68f)
                lineToRelative(-0.34f, -0.94f)
                lineToRelative(0.94f, -0.34f)
                lineTo(13.76f, 2.6f)
                lineToRelative(-0.94f, 0.34f)
                lineTo(12.48f, 2.0f)
                lineTo(10.6f, 2.68f)
                lineToRelative(0.34f, 0.94f)
                lineTo(10.0f, 3.97f)
                lineTo(10.56f, 5.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 8.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _biotech!!
    }

private var _biotech: ImageVector? = null
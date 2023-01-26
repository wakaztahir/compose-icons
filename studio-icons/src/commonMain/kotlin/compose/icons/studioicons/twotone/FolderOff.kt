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

public val TwotoneGroup.FolderOff: ImageVector
    get() {
        if (_folderOff != null) {
            return _folderOff!!
        }
        _folderOff = Builder(name = "FolderOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.17f, 18.0f)
                lineToRelative(-11.17f, -11.17f)
                lineToRelative(0.0f, 11.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.17f, 8.0f)
                lineToRelative(8.83f, 9.17f)
                lineToRelative(0.0f, -9.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.69f, 3.51f)
                lineToRelative(1.56f, 1.56f)
                curveTo(2.1f, 5.35f, 2.01f, 5.66f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(3.31f, 3.31f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                close()
                moveTo(15.17f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.83f)
                lineTo(15.17f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(7.17f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(9.17f)
                lineToRelative(1.76f, 1.76f)
                curveTo(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _folderOff!!
    }

private var _folderOff: ImageVector? = null
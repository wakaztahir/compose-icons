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

public val TwotoneGroup.FolderDelete: ImageVector
    get() {
        if (_folderDelete != null) {
            return _folderDelete!!
        }
        _folderDelete = Builder(name = "FolderDelete", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(11.5f)
                close()
                moveTo(20.0f, 8.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 10.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(16.5f, 15.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.5f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.89f, 21.11f, 6.0f, 20.0f, 6.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _folderDelete!!
    }

private var _folderDelete: ImageVector? = null

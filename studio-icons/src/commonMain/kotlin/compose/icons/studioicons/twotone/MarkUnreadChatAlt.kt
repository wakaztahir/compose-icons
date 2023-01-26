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

public val TwotoneGroup.MarkUnreadChatAlt: ImageVector
    get() {
        if (_markUnreadChatAlt != null) {
            return _markUnreadChatAlt!!
        }
        _markUnreadChatAlt = Builder(name = "MarkUnreadChatAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 17.17f)
                lineTo(5.17f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.9f)
                curveTo(19.68f, 7.96f, 19.34f, 8.0f, 19.0f, 8.0f)
                reflectiveCurveToRelative(-0.68f, -0.04f, -1.0f, -0.1f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(9.03f)
                curveToRelative(-0.44f, -0.58f, -0.77f, -1.26f, -0.92f, -2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.17f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                horizontalLineTo(5.17f)
                lineTo(4.0f, 17.17f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(10.1f)
                curveToRelative(-0.18f, -0.89f, -0.08f, -1.61f, 0.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.01f, 2.9f, 2.01f, 4.0f)
                lineTo(2.0f, 22.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.97f)
                curveToRelative(-0.58f, 0.44f, -1.26f, 0.77f, -2.0f, 0.92f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(7.9f)
                curveToRelative(-1.21f, -0.25f, -2.25f, -0.95f, -2.97f, -1.9f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _markUnreadChatAlt!!
    }

private var _markUnreadChatAlt: ImageVector? = null

package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.PictureInPictureAlt: ImageVector
    get() {
        if (_pictureInPictureAlt != null) {
            return _pictureInPictureAlt!!
        }
        _pictureInPictureAlt = Builder(name = "PictureInPictureAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.88f, -2.0f, 1.98f)
                lineTo(1.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 4.98f)
                curveTo(23.0f, 3.88f, 22.1f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(21.0f, 19.02f)
                lineTo(3.0f, 19.02f)
                lineTo(3.0f, 4.97f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.05f)
                close()
            }
        }
        .build()
        return _pictureInPictureAlt!!
    }

private var _pictureInPictureAlt: ImageVector? = null

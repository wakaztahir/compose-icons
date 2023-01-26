package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.FormatItalic: ImageVector
    get() {
        if (_formatItalic != null) {
            return _formatItalic!!
        }
        _formatItalic = Builder(name = "FormatItalic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.21f)
                lineToRelative(3.42f, -8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-3.42f, 8.0f)
                close()
            }
        }
        .build()
        return _formatItalic!!
    }

private var _formatItalic: ImageVector? = null
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

public val TwotoneGroup.PowerInput: ImageVector
    get() {
        if (_powerInput != null) {
            return _powerInput!!
        }
        _powerInput = Builder(name = "PowerInput", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.0f)
                lineTo(21.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _powerInput!!
    }

private var _powerInput: ImageVector? = null

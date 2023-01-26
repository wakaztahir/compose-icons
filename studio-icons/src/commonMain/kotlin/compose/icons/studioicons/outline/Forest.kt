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

public val OutlineGroup.Forest: ImageVector
    get() {
        if (_forest != null) {
            return _forest!!
        }
        _forest = Builder(name = "Forest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                lineToRelative(-3.86f, -6.0f)
                horizontalLineTo(22.0f)
                lineTo(15.0f, 2.0f)
                lineToRelative(-3.0f, 4.29f)
                lineTo(9.0f, 2.0f)
                lineTo(2.0f, 12.0f)
                horizontalLineToRelative(1.86f)
                lineTo(0.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(15.0f, 5.49f)
                lineTo(18.16f, 10.0f)
                horizontalLineToRelative(-1.68f)
                lineToRelative(3.86f, 6.0f)
                horizontalLineToRelative(-3.62f)
                lineToRelative(-2.57f, -4.0f)
                horizontalLineTo(16.0f)
                lineToRelative(-2.78f, -3.97f)
                lineTo(15.0f, 5.49f)
                close()
                moveTo(3.66f, 16.0f)
                lineToRelative(3.86f, -6.0f)
                horizontalLineTo(5.84f)
                lineTo(9.0f, 5.49f)
                lineTo(12.16f, 10.0f)
                horizontalLineToRelative(-1.68f)
                lineToRelative(3.86f, 6.0f)
                horizontalLineTo(3.66f)
                close()
            }
        }
        .build()
        return _forest!!
    }

private var _forest: ImageVector? = null

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

public val OutlineGroup.VerticalSplit: ImageVector
    get() {
        if (_verticalSplit != null) {
            return _verticalSplit!!
        }
        _verticalSplit = Builder(name = "VerticalSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(19.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                moveToRelative(2.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(8.0f)
                lineTo(21.0f, 5.0f)
                close()
            }
        }
        .build()
        return _verticalSplit!!
    }

private var _verticalSplit: ImageVector? = null

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

public val TwotoneGroup.AlignHorizontalCenter: ImageVector
    get() {
        if (_alignHorizontalCenter != null) {
            return _alignHorizontalCenter!!
        }
        _alignHorizontalCenter = Builder(name = "AlignHorizontalCenter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _alignHorizontalCenter!!
    }

private var _alignHorizontalCenter: ImageVector? = null

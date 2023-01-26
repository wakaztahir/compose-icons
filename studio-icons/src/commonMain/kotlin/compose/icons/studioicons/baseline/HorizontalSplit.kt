package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.HorizontalSplit: ImageVector
    get() {
        if (_horizontalSplit != null) {
            return _horizontalSplit!!
        }
        _horizontalSplit = Builder(name = "HorizontalSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-6.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                close()
            }
        }
        .build()
        return _horizontalSplit!!
    }

private var _horizontalSplit: ImageVector? = null
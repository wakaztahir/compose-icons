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

public val BaselineGroup.OpenWith: ImageVector
    get() {
        if (_openWith != null) {
            return _openWith!!
        }
        _openWith = Builder(name = "OpenWith", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(-5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(9.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 7.0f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(23.0f, 12.0f)
                lineToRelative(-5.0f, -5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 18.0f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _openWith!!
    }

private var _openWith: ImageVector? = null

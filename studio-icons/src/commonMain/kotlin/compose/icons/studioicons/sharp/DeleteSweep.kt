package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DeleteSweep: ImageVector
    get() {
        if (_deleteSweep != null) {
            return _deleteSweep!!
        }
        _deleteSweep = Builder(name = "DeleteSweep", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(10.0f)
                lineTo(13.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(6.0f, 4.0f)
                lineTo(5.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                lineTo(14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _deleteSweep!!
    }

private var _deleteSweep: ImageVector? = null

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

public val SharpGroup.MarkunreadMailbox: ImageVector
    get() {
        if (_markunreadMailbox != null) {
            return _markunreadMailbox!!
        }
        _markunreadMailbox = Builder(name = "MarkunreadMailbox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _markunreadMailbox!!
    }

private var _markunreadMailbox: ImageVector? = null
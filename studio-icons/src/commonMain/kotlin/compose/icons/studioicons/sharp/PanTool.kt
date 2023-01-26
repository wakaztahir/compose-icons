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

public val SharpGroup.PanTool: ImageVector
    get() {
        if (_panTool != null) {
            return _panTool!!
        }
        _panTool = Builder(name = "PanTool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(10.02f)
                lineTo(1.0f, 14.83f)
                lineTo(2.9f, 13.0f)
                lineTo(8.0f, 15.91f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _panTool!!
    }

private var _panTool: ImageVector? = null
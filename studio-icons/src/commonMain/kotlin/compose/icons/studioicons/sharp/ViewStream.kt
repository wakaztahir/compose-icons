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

public val SharpGroup.ViewStream: ImageVector
    get() {
        if (_viewStream != null) {
            return _viewStream!!
        }
        _viewStream = Builder(name = "ViewStream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _viewStream!!
    }

private var _viewStream: ImageVector? = null

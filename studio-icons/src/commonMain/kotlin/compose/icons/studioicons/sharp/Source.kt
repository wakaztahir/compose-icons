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

public val SharpGroup.Source: ImageVector
    get() {
        if (_source != null) {
            return _source!!
        }
        _source = Builder(name = "Source", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _source!!
    }

private var _source: ImageVector? = null

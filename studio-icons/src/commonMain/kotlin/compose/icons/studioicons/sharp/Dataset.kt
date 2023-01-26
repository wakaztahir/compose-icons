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

public val SharpGroup.Dataset: ImageVector
    get() {
        if (_dataset != null) {
            return _dataset!!
        }
        _dataset = Builder(name = "Dataset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(17.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _dataset!!
    }

private var _dataset: ImageVector? = null

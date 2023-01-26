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

public val SharpGroup.LabelImportant: ImageVector
    get() {
        if (_labelImportant != null) {
            return _labelImportant!!
        }
        _labelImportant = Builder(name = "LabelImportant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.99f)
                horizontalLineToRelative(12.04f)
                lineTo(21.0f, 12.0f)
                lineToRelative(-4.97f, -7.0f)
                horizontalLineTo(4.0f)
                lineToRelative(5.0f, 7.0f)
                lineToRelative(-5.0f, 6.99f)
                close()
            }
        }
        .build()
        return _labelImportant!!
    }

private var _labelImportant: ImageVector? = null
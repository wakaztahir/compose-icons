package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.NoteBlank: ImageVector
    get() {
        if (_noteBlank != null) {
            return _noteBlank!!
        }
        _noteBlank = Builder(name = "NoteBlank", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(156.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 11.3f, -4.7f)
                lineTo(219.3f, 168.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 4.7f, -11.3f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(160.0f, 204.7f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(44.7f)
                close()
            }
        }
        .build()
        return _noteBlank!!
    }

private var _noteBlank: ImageVector? = null
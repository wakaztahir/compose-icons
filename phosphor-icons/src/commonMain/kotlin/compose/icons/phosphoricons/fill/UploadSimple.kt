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

public val FillGroup.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) {
            return _uploadSimple!!
        }
        _uploadSimple = Builder(name = "UploadSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.6f, 85.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 1.7f, -8.7f)
                lineToRelative(42.0f, -42.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(42.0f, 42.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 1.7f, 8.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.4f, 5.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(90.0f)
                horizontalLineTo(86.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 78.6f, 85.0f)
                close()
                moveTo(216.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 144.0f)
                close()
            }
        }
        .build()
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
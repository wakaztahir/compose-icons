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

public val FillGroup.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) {
            return _genderNeuter!!
        }
        _genderNeuter = Builder(name = "GenderNeuter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -8.0f, 159.6f)
                lineTo(120.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 183.6f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandBing: VectorAsset
    get() {
        if (_brandBing != null) {
            return _brandBing!!
        }
        _brandBing = VectorAssetBuilder(name = "BrandBing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                lineToRelative(4.0f, 1.5f)
                verticalLineToRelative(12.0f)
                lineToRelative(6.0f, -2.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -4.0f)
                lineToRelative(7.0f, 2.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-10.0f, 5.0f)
                lineToRelative(-4.0f, -2.0f)
                close()
            }
        }
        .build()
        return _brandBing!!
    }

private var _brandBing: VectorAsset? = null

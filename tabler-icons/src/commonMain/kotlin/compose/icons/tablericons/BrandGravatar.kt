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

public val TablerIcons.BrandGravatar: VectorAsset
    get() {
        if (_brandGravatar != null) {
            return _brandGravatar!!
        }
        _brandGravatar = VectorAssetBuilder(name = "BrandGravatar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.64f, 5.632f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 6.36f, -2.632f)
                verticalLineToRelative(7.714f)
            }
        }
        .build()
        return _brandGravatar!!
    }

private var _brandGravatar: VectorAsset? = null

package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ReceiptRefund: VectorAsset
    get() {
        if (_receiptRefund != null) {
            return _receiptRefund!!
        }
        _receiptRefund = VectorAssetBuilder(name = "ReceiptRefund", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                lineToRelative(-3.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-3.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(2.0f, -2.0f)
                moveToRelative(0.0f, 4.0f)
                lineToRelative(-2.0f, -2.0f)
            }
        }
        .build()
        return _receiptRefund!!
    }

private var _receiptRefund: VectorAsset? = null
